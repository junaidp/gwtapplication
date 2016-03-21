package com.mamallan.gwtapp.client.view;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.google.gwt.cell.client.CheckboxCell;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.mamallan.gwtapp.client.presenter.BindingsPresenter.Display;
import com.mamallan.gwtapp.client.view.widgets.ButtonImageCell;
import com.mamallan.gwtapp.shared.entity.BindingsEntity;

public class BindingsView extends Composite implements Display{

	private static BindingsViewUiBinder uiBinder = GWT
			.create(BindingsViewUiBinder.class);

	interface BindingsViewUiBinder extends UiBinder<Widget, BindingsView> {
	}
	
	@UiField
	Button btnAddBinding;
	@UiField
	Button btnDeleteBindings;
	private CellTable.Resources tableRes = GWT.create(TableRes.class);
	@UiField
	VerticalPanel cellContainer;
	private CellTable<BindingsEntity> tableBindings = new CellTable<BindingsEntity>(10, tableRes);
	@UiField
	SimplePager pager;
	@UiField
	TextBox txtSearch;
	private Column<BindingsEntity, String> columnName;
	private Column<BindingsEntity, String> columnType;
	private Column<BindingsEntity, String> columnValue;
	private Column<BindingsEntity, String> editColumn;
	private Column<BindingsEntity, String> removeColumn;
	private Column<BindingsEntity, Boolean> cbColumn;
	

	public BindingsView() {
		initWidget(uiBinder.createAndBindUi(this));
		tableLayout();
	}
	
	public void tableLayout(){
		cellContainer.add(tableBindings);
	
		tableBindings.setWidth("100%");
		tableBindings.setEmptyTableWidget(new HTML("No Record found"));
		tableBindings.setRowCount(0);
		txtSearch.getElement().setPropertyString("placeholder", "search");
		
		final CheckboxCell cbCell = new CheckboxCell();
		cbColumn = new Column<BindingsEntity, Boolean>(cbCell) {
		    @Override
		    public Boolean getValue(BindingsEntity object) {
		        
		        return false;
		    }
		};
		tableBindings.addColumn(cbColumn,"");

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
		
		tableBindings.addColumn(editColumn,"");
		tableBindings.addColumn(removeColumn,"");
		
		columnName.setSortable(true);
		columnType.setSortable(true);
		columnValue.setSortable(true);
		
		tableBindings.setColumnWidth(0, "10px");
		tableBindings.setColumnWidth(4, "10px");
		tableBindings.setColumnWidth(5, "10px");
		
		
	}
	
	public void popuplateTable(ArrayList<BindingsEntity> bindings){
		
		tableBindings.setRowData(0, bindings);
		tableBindings.setRowCount(bindings.size());
		pager.setDisplay(tableBindings);
		sortTableGroup(bindings);
	}
	
	private void sortTableGroup(List<BindingsEntity> bindings){
		ListDataProvider<BindingsEntity> dataProvider = new ListDataProvider<BindingsEntity>();
		dataProvider.addDataDisplay(tableBindings);

		List<BindingsEntity> list = dataProvider.getList();

		for (BindingsEntity group : bindings) {
		list.add(group);
		}
		final ListHandler<BindingsEntity> columnSortHandler = new ListHandler<BindingsEntity>(list);

		columnSortHandler.setComparator(columnName,new Comparator<BindingsEntity>() {

		public int compare(BindingsEntity o1,BindingsEntity o2) {
		if (o1 == o2) {
		return 0;
		}

		// Compare the bindingName columns.
		if (o1 != null) {

		return (o2 != null) ? o1.getBindingName().compareTo(o2.getBindingName()) : 1;
		}
		return -1;
		}
		});
		
		columnSortHandler.setComparator(columnType,new Comparator<BindingsEntity>() {

			public int compare(BindingsEntity o1,BindingsEntity o2) {
			if (o1 == o2) {
			return 0;
			}

			// Compare the type columns.
			if (o1 != null) {

			return (o2 != null) ? o1.getBindingType().compareTo(o2.getBindingType()) : 1;
			}
			return -1;
			}
			});
		
		columnSortHandler.setComparator(columnValue,new Comparator<BindingsEntity>() {

			public int compare(BindingsEntity o1,BindingsEntity o2) {
			if (o1 == o2) {
			return 0;
			}

			// Compare the value columns.
			if (o1 != null) {

			return (o2 != null) ? o1.getBindingValue().compareTo(o2.getBindingValue()) : 1;
			}
			return -1;
			}
			});
		
		
		
				
		
		tableBindings.addColumnSortHandler(columnSortHandler);
		tableBindings.getColumnSortList().push(columnValue);
		tableBindings.getColumnSortList().push(columnName);
		tableBindings.getColumnSortList().push(columnType);
		
		
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

	public Column<BindingsEntity, Boolean> getCbColumn() {
		return cbColumn;
	}

	public Button getBtnDeleteBindings() {
		return btnDeleteBindings;
	}

	public CellTable<BindingsEntity> getTableBindings() {
		return tableBindings;
	}

	public TextBox getTxtSearch() {
		return txtSearch;
	}

}
