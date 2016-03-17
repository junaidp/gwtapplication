package com.mamallan.gwtapp.client.view;


import java.util.ArrayList;

import com.google.gwt.cell.client.TextCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.mamallan.gwtapp.client.presenter.BindingsPresenter.Display;
import com.mamallan.gwtapp.client.view.widgets.ButtonImageCell;
import com.mamallan.gwtapp.shared.dto.AddedBeanPropertyDTO;
import com.mamallan.gwtapp.shared.entity.BindingsEntity;

public class BindingsView extends Composite implements Display{

	private static BindingsViewUiBinder uiBinder = GWT
			.create(BindingsViewUiBinder.class);

	interface BindingsViewUiBinder extends UiBinder<Widget, BindingsView> {
	}
	
	@UiField
	Button btnAddBinding;
	@UiField
	VerticalPanel tableContainer;
	private Column<BindingsEntity, String> columnName;
	private Column<BindingsEntity, String> columnType;
	private Column<BindingsEntity, String> columnValue;
	private Column<BindingsEntity, String> editColumn;
	private Column<BindingsEntity, String> removeColumn;
	
	private CellTable<BindingsEntity> tableBindings = new CellTable<BindingsEntity>();
	

	public BindingsView() {
		initWidget(uiBinder.createAndBindUi(this));
		tableContainer.add(tableBindings);
		tableLayout();
	}
	
	public void tableLayout(){
		
		tableBindings.setEmptyTableWidget(new HTML("No Record found"));
		tableBindings.setRowCount(0);

		columnName = new Column<BindingsEntity, String>(new TextCell()) {
			@Override
			public String getValue(BindingsEntity object) {
				return object.getBindingName();
			}
		};
		tableBindings.addColumn(columnName,"Name");
		
		columnType = new Column<BindingsEntity, String>(new TextCell()) {
			@Override
			public String getValue(BindingsEntity object) {
				return object.getBindingType();
			}
		};
		tableBindings.addColumn(columnType,"Type");
		
		columnValue = new Column<BindingsEntity, String>(new TextCell()) {
			@Override
			public String getValue(BindingsEntity object) {
				return object.getBindingValue();
			}
		};
		tableBindings.addColumn(columnValue,"Value");
		
		removeColumn = new Column<BindingsEntity, String>(new ButtonImageCell()) {
			@Override
			public String getValue(BindingsEntity object) {
				return "images/delete.png";
			}
		};
		
		editColumn = new Column<BindingsEntity, String>(new ButtonImageCell()) {
			@Override
			public String getValue(BindingsEntity object) {
				return "images/edit.png";
			}
		};
		
	}
	
	public void popuplateTable(ArrayList<BindingsEntity> bindings){
		
		tableBindings.setRowData(0, bindings);
		
	}


	public Button getBtnAddBinding() {
		return btnAddBinding;
	}


	public void setBtnAddBinding(Button btnAddBinding) {
		this.btnAddBinding = btnAddBinding;
	}

	public Column<BindingsEntity, String> getEditColumn() {
		return editColumn;
	}

	public Column<BindingsEntity, String> getRemoveColumn() {
		return removeColumn;
	}

}
