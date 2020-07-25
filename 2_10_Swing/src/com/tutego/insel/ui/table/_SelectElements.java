package com.tutego.insel.ui.table;

import javax.swing.*;

public class _SelectElements
{
  public static void main( String[] args )
  {
	String[][] rowData = {
		{ "Japan", "245" }, { "USA", "240" }, { "Italien", "220" },
		{ "Spanien", "217" }, {"Türkei", "215"} ,{ "England", "214" },
		{ "Frankreich", "190" }, {"Griechenland", "185" },
		{ "Deutschland", "180" }, {"Portugal", "170" }
	};

	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    JTable table = new JTable( rowData, new String[]{"",""} );

	table.setSelectionMode( ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
	
	// This
	
	table.setColumnSelectionAllowed( true );
	table.setRowSelectionAllowed( false );
	
	table.setColumnSelectionInterval( 0, 0 );
	
	
	// Or
	
//		table.setColumnSelectionAllowed( true );
//		table.setRowSelectionAllowed( true );
//
//		table.changeSelection( 1, 1, false, false );
	
	frame.getContentPane().add( new JScrollPane(table) );
	frame.pack();
	frame.setVisible( true );
  }
}
