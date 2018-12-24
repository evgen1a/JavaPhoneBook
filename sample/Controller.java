package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {

    private ObservableList<PhoneBook> usersData = FXCollections.observableArrayList();

    @FXML
    private TableView<PhoneBook> tableUsers;

    @FXML
    private TableColumn<PhoneBook, Integer> idColumn;

    @FXML
    private TableColumn<PhoneBook, String> fromColumn;

    @FXML
    private TableColumn<PhoneBook, String> toColumn;

    @FXML
    private TableColumn<PhoneBook, String> dateColumn;

    @FXML
    private TableColumn<PhoneBook, Integer> durationColumn;


    @FXML
    private void initialize() {
        initData();

        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        fromColumn.setCellValueFactory(new PropertyValueFactory<>("from"));
        toColumn.setCellValueFactory(new PropertyValueFactory<>("to"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        durationColumn.setCellValueFactory(new PropertyValueFactory<>("duration"));

        tableUsers.setItems(usersData);
    }

    private void initData() {
        usersData.add(new PhoneBook(1, "Masha", "Kirill", "10.08.15 15:20:15", 5));
        usersData.add(new PhoneBook(2, "Vova", "Alexander", "24.11.18 22:18:11", 25));
        usersData.add(new PhoneBook(3, "Anna", "Victoria", "29.08.15 15:40:59", 36));
        usersData.add(new PhoneBook(4, "Dmitry", "Kirill", "24.11.17 10:00:01", 28));
        usersData.add(new PhoneBook(5, "Masha", "Victoria", "28.08.13 09:09:09", 3));
    }

}