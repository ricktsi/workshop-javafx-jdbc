package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;

public class DepartmentFormController implements Initializable {

	private Department entity;
	
	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private Label lblErrorName;
	
	@FXML
	private Button btnSave;
	
	@FXML
	private Button btnCancel;
	
	@FXML
	public void onBtnSaveAction() {
		System.out.println("onBtnSaveAction");
	}
	
	@FXML
	public void onBtnCancelAction() {
		System.out.println("onBtnCancelAction");
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		initializeNodes();
	}
	
	private void initializeNodes() {
		Constraints.setTextFieldMaxLength(txtName, 30);
		Constraints.setTextFieldInteger(txtId);
	}
	
	public void setDepartment(Department entity) {
		this.entity = entity;
	}
	
	public void updateFormData() {
		if (entity == null) {
			throw new IllegalStateException("Entity was null");
		}
		txtId.setText( entity.getId() == null ? "" : String.valueOf(entity.getId()));
		txtName.setText(entity.getName());
	}

}
