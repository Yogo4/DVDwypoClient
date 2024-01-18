package com.example.dvdwypoclient;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import static java.lang.Integer.parseInt;

public class Client {

    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;

    public Client(Socket socket) throws IOException {
        this.socket = socket;
        this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    }

    public void run(TableView<DataModel> dvdTable, ObservableList<DataModel> model) {
        Thread visualUpdateThread = new Thread(() -> {
            try {
                while (socket.isConnected()) {
                    String line;
                    model.clear();
                    while ((line = bufferedReader.readLine()) != null) {
                        String[] values = line.split(",");
                        DataModel data = new DataModel(
                                parseInt(values[0]),
                                values[1],
                                values[2],
                                values[3],
                                values[4],
                                parseInt(values[5])
                        );
                        Platform.runLater(() -> {
                            model.add(data);
                            dvdTable.setItems(model);
                        });
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        visualUpdateThread.setDaemon(true);
        visualUpdateThread.start();
    }
}
