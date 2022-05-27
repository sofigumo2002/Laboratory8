/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author sofia
 */
public class FXMLSelectionSortController implements Initializable {

    Integer array[];

    @FXML
    private TableView<List<String>> selectionSortTableView;
    @FXML
    private TableColumn<List<String>, String> tableColumn0;
    @FXML
    private TableColumn<List<String>, String> tableColumn1;
    @FXML
    private TableColumn<List<String>, String> tableColumn2;
    @FXML
    private TableColumn<List<String>, String> tableColumn3;
    @FXML
    private TableColumn<List<String>, String> tableColumn4;
    @FXML
    private TableColumn<List<String>, String> tableColumn5;
    @FXML
    private TableColumn<List<String>, String> tableColumn6;
    @FXML
    private TableColumn<List<String>, String> tableColumn7;
    @FXML
    private TableColumn<List<String>, String> tableColumn8;
    @FXML
    private TableColumn<List<String>, String> tableColumn9;
    @FXML
    private TextField interactionsTextField;

    @FXML
    private TableView<List<String>> resulltSelectionSortTableView;
    @FXML
    private TableColumn<List<String>, String> tableColumn00;
    @FXML
    private TableColumn<List<String>, String> tableColumn11;
    @FXML
    private TableColumn<List<String>, String> tableColumn22;
    @FXML
    private TableColumn<List<String>, String> tableColumn33;
    @FXML
    private TableColumn<List<String>, String> tableColumn44;
    @FXML
    private TableColumn<List<String>, String> tableColumn55;
    @FXML
    private TableColumn<List<String>, String> tableColumn66;
    @FXML
    private TableColumn<List<String>, String> tableColumn77;
    @FXML
    private TableColumn<List<String>, String> tableColumn88;
    @FXML
    private TableColumn<List<String>, String> tableColumn99;

    @FXML
    private Button btnStart;
    @FXML
    private Button btnRandomize;
    @FXML
    private TextField textMin;
    @FXML
    private TextField textMinIndex;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // TODO
        this.array = new Integer[10];
        util.Utility.fill(this.array);
        //Table View Bubble
        this.tableColumn0.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableColumn1.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableColumn2.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableColumn3.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableColumn4.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableColumn5.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableColumn6.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableColumn7.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableColumn8.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableColumn9.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });

        //Table View Bubble
        this.tableColumn00.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableColumn11.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableColumn22.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableColumn33.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableColumn44.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableColumn55.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableColumn66.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableColumn77.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableColumn88.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableColumn99.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });

        //procedemos a mostrar el contenido del table view 
        if (array != null) {
            this.selectionSortTableView.setItems(getData());
        }
    }

    @FXML
    private void btnStartOnAction(ActionEvent event) {
        this.selectionSort(array);
        if (array != null) {
            this.resulltSelectionSortTableView.setItems(getData());
        }
    }

    @FXML
    private void btnRandomizeOnAction(ActionEvent event) {
        util.Utility.fill(this.array);//volvemos a llenar el arreglo
        this.interactionsTextField.setText(" ");
        this.textMin.setText(" ");
        this.textMinIndex.setText(" ");
        this.resulltSelectionSortTableView.setItems(null);//limpiamos el contenido del table
    }

    //Este metodo es igual al de Elementary, se le da los valores al min y min index 
    public void selectionSort(Integer[] array) {
        int iteractionsCounter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }//if
                iteractionsCounter++;
            }//for j
            textMin.setText(textMin.getText() + min + " ");
            textMinIndex.setText(textMinIndex.getText() + minIndex + " ");
            array[minIndex] = array[i];
            array[i] = min;
        }//for i
        this.interactionsTextField.setText(String.valueOf(iteractionsCounter));
    }//selectionSort

     private ObservableList<List<String>> getData() {
        ObservableList<List<String>> data = FXCollections.observableArrayList();
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(String.valueOf(array[i]));
        }
        data.add(arrayList);
        return data;
    }
}

