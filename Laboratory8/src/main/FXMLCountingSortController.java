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
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author sofia
 */
public class FXMLCountingSortController implements Initializable {

    Integer array[];

    @FXML
    private TableView<List<String>> countingSortTableView;
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

    //tabla de i
    @FXML
    private TableView<List<String>> couterTableView;
    @FXML
    private TableColumn<List<String>, String> tableViewi0;
    @FXML
    private TableColumn<List<String>, String> tableViewi1;
    @FXML
    private TableColumn<List<String>, String> tableViewi2;
    @FXML
    private TableColumn<List<String>, String> tableViewi3;
    @FXML
    private TableColumn<List<String>, String> tableViewi4;
    @FXML
    private TableColumn<List<String>, String> tableViewi5;
    @FXML
    private TableColumn<List<String>, String> tableViewi6;
    @FXML
    private TableColumn<List<String>, String> tableViewi7;
    @FXML
    private TableColumn<List<String>, String> tableViewi8;
    @FXML
    private TableColumn<List<String>, String> tableViewi9;
    @FXML
    private TableColumn<List<String>, String> tableViewi010;
    @FXML
    private TableColumn<List<String>, String> tableViewi11;
    @FXML
    private TableColumn<List<String>, String> tableViewi12;
    @FXML
    private TableColumn<List<String>, String> tableViewi13;
    @FXML
    private TableColumn<List<String>, String> tableViewi14;
    @FXML
    private TableColumn<List<String>, String> tableViewi15;
    @FXML
    private TableColumn<List<String>, String> tableViewi16;
    @FXML
    private TableColumn<List<String>, String> tableViewi17;
    @FXML
    private TableColumn<List<String>, String> tableViewi18;
    @FXML
    private TableColumn<List<String>, String> tableViewi19;

    //tabla de los resultados
    @FXML
    private TableView<List<String>> resultCountingSortTableView;
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

        //nueva tabla 
        this.tableViewi0.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableViewi1.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableViewi2.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableViewi3.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableViewi4.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableViewi5.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableViewi6.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableViewi7.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableViewi8.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableViewi9.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableViewi010.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableViewi11.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableViewi12.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableViewi13.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableViewi14.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableViewi15.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableViewi16.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableViewi17.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableViewi18.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableViewi19.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        
        //Table View 
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
            this.countingSortTableView.setItems(getData());
            this.couterTableView.setItems(getData());
        }
    }

    @FXML
    private void btnStartOnAction(ActionEvent event) {
        this.countingSort(array);
        if (array != null) {
            this.resultCountingSortTableView.setItems(getData());
            fillCouterTableView(array);//Tabla de 0 a 19 y coloca los numeros que se repiten
        }
    }

    @FXML
    private void btnRandomizeOnAction(ActionEvent event) {
        util.Utility.fill(this.array);//volvemos a llenar el arreglo 
        this.resultCountingSortTableView.setItems(null);//limpiamos el contenido del table
        this.couterTableView.setItems(null);//limpiamos el contenido del table
    }

    private void countingSort(Integer[] array) {
        int max = (int) util.Utility.maxArray(array); //va de 0 hasta el elemento maximo
        // create buckets
        int counter[] = new int[max + 1]; 
        // fill buckets 
        for (int element : array) {
            counter[element]++; //incrementa el num de ocurrencias del elemento
	} 
       // sort array 
        int index = 0; 
        for (int i = 0; i < counter.length; i++) { 
	  while (counter[i]>0) { //significa q al menos hay un elemento (q existe)
		array[index++] = i; 
                counter[i]--; 
            } 
        }//for i
    }

    private ObservableList<List<String>> getData() {
        ObservableList<List<String>> data = FXCollections.observableArrayList();
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(String.valueOf(array[i]));
        }
        data.add(arrayList);
        return data;
    }

    private void fillCouterTableView(Integer[] array) {
        int[] array2 = new int[20];//Numeros enteros
        for (int i = 0; i < array.length; i++) {
            switch(array[i]){
                case 0:
                    array2[0]+=1;
                    break;
                case 1:
                    array2[1]+=1;
                    break;
                case 2:
                    array2[2]+=1;
                    break;
                case 3:
                    array2[3]+=1;
                    break;
                case 4:
                    array2[4]+=1;
                    break;
                case 5:
                    array2[5]+=1;
                    break;
                case 6:
                    array2[6]+=1;
                    break;
                case 7:
                    array2[7]+=1;
                    break;
                case 8:
                    array2[8]+=1;
                    break;
                case 9:
                    array2[9]+=1;
                    break;
                case 10:
                    array2[10]+=1;
                    break;
                case 11:
                    array2[11]+=1;
                    break;
                case 12:
                    array2[12]+=1;
                    break;
                case 13:
                    array2[13]+=1;
                    break;
                case 14:
                    array2[14]+=1;
                    break;
                case 15:
                    array2[15]+=1;
                    break;
                case 16:
                    array2[16]+=1;
                    break;
                case 17:
                    array2[17]+=1;
                    break;
                case 18:
                    array2[18]+=1;
                    break;
                case 19:
                    array2[19]+=1;
                    break;
            }
        }

//        couterTableView.getItems().add(array2);
//        this.tableViewi0.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[0])));
//        this.tableViewi1.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[1])));
//        this.tableViewi2.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[2])));
//        this.tableViewi3.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[3])));
//        this.tableViewi4.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[4])));
//        this.tableViewi5.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[5])));
//        this.tableViewi6.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[6])));
//        this.tableViewi7.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[7])));
//        this.tableViewi8.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[8])));
//        this.tableViewi9.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[9])));
//        this.tableViewi010.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[10])));
//        this.tableViewi11.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[11])));
//        this.tableViewi12.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[12])));
//        this.tableViewi13.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[13])));
//        this.tableViewi14.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[14])));
//        this.tableViewi15.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[15])));
//        this.tableViewi16.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[16])));
//        this.tableViewi17.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[17])));
//        this.tableViewi18.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[18])));
//        this.tableViewi19.setCellValueFactory(c -> new SimpleStringProperty(String.valueOf(array2[19])));
    }

}//end class