/*
Education-project: Swing-Basics lection 2.4

Copyright (C) 2011 Karsten Bettray

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License
as published by the Free Software Foundation; either version 3 of the License, or (at your option) any later version.
This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
See the GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License along with this library;
if not, write to the Free Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110, USA
or look at <http://www.gnu.org/licenses/>.
*/

package de.wvskoeln.swing.lection2_4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

/**
 * Klasse MainPanel, wird durch Klasse JPanel erweitert (Siehe auch: Vererbung)
 * @author bettray
 *
 */
public class MainPanel extends JPanel implements ActionListener
{
	private JTextArea textArea = null; 		// Deklarieren eines Textgebietes
	private Box hBox = null;				// Eine Horizontalbox als Container erzeugen
	private InputPanel inputPanel = null;	// InputPanel beinhaltet die Eingabefelder fuer Name, Vorname und Alter
	private JButton send = null;			// Deklarieren eines Senden-Buttons
	private JTable table = null;			// Tabelle fuer Benutzerdaten
	private JPanel tableContainer = null;	// Nimmt die Tabelle auf
	/**
	 * Defaultkonstruktor, ruft super-Konstruktor und init-Methode auf
	 */
	public MainPanel()
	{
		super();
		
		init();
	}

	/**
	 * Konstruktor, ruft super-Konstruktor auf (legt dabei den Layoutmanager fest) und init-Methode
	 */
	public MainPanel(LayoutManager arg0)
	{
		super(arg0);
		
		init();
	}
	
	/**
	 * Initialisierung der Panel-Eigenschaften
	 */
	private void init()
	{
		// Layoutmanager vorgeben
		setLayout(new BorderLayout());
		
		// Kreieren eines Rahmens mit Titel
		setBorder(BorderFactory.createTitledBorder("Hauptframe mit Rahmen"));
		
		// Componenten dem Panel zuweisen
		initComponents();
	}
	
	/**
	 * Initialisieren der im Panel enthaltenen Komponenten
	 */
	private void initComponents()
	{
		// JPanel erzeugen, welches die beiden Buttons aufnimmt
		JPanel north = new JPanel(new BorderLayout());
		
		// Container fuer die Tabelle
		tableContainer = new JPanel();
		tableContainer.setBorder(BorderFactory.createTitledBorder("Tabellen-Panel"));
		
		hBox = Box.createHorizontalBox();	// Horizontalbox initialisieren ...
		
		Box vBoxCenter = Box.createVerticalBox(); // Vertikal-Box, nimmt Tabelle und Text-Gebiet auf
		
		vBoxCenter.add(tableContainer);		// Zfuegen des Containers fuer die Tabelle
		
		// Erzeugen eines Senden-Buttons, die Beschriftung der Buttons wird direkt dem Konstruktor uebergeben
		JButton add = new JButton("Benutzer anlegen");
		
		// Dem Button den ActionListener zufuegen, damit auf einen Mausklick-Ereignis (Event) reagiert werden kann
		add.addActionListener(this);
		
		// Erzeugen eines Reset-Buttons, die Beschriftung der Buttons wird direkt dem Konstruktor uebergeben
		send = new JButton("Senden");
		send.setVisible(false);
		
		// Dem Button den ActionListener zufuegen, damit auf einen Mausklick-Ereignis (Event) reagiert werden kann
		send.addActionListener(this);
		// !!! Die Klick-Events werden unten in der Methode actionPerformed() verarbeitet !!!
		
		// Initialisieren des InputPanel mit den Textfelder
		inputPanel = new InputPanel(); //  = new JTextField("Name, Vorname und Alter Kommagetrennt eingeben (Mustermann,Franz,33).");
		inputPanel.setVisible(false);
		
		// Der Horizotalbox inputPanel und send-Button zufuegen
		hBox.add(add);
		hBox.add(inputPanel);
		hBox.add(send);
		
		// Initialisieren des Textgebietes
		textArea = new JTextArea();
		
		vBoxCenter.add(textArea);	// Textgebiet der Vertikal-Box zufuegen
		vBoxCenter.setBorder(BorderFactory.createTitledBorder("Zentrum"));
		
		north.add(hBox, BorderLayout.CENTER);	// hBox dem north-Panel zufuegen
		
		add(north, BorderLayout.NORTH);			// north-Panel oben in dasMainpanel zufuegen
		add(vBoxCenter, BorderLayout.CENTER);	// Vertikal-Box ins Zentrum des Mainpanels zufuegen
	}
	
	/**
	 * Initialisieren einer neuen Tabelle 
	 */
	private void addTableData()
	{
		// Legt die Namen der Tabellenspalten fest
		String[] rowNames = new String[] { "name", "firstname", "age" };
		
		// Fuegt die Eingaben der Textfelder in die Tabelle ein
		String[][] cellData = new String[][] { { inputPanel.getName(), inputPanel.getFirstname(), inputPanel.getAge()+"" },
											   { inputPanel.getName(), inputPanel.getFirstname(), inputPanel.getAge()+"" } };

		// Loeschen der Referenz auf die aktuelle Tabelle
		table = null;
		// Legt eine neue Tabelle im Speicher an
		table = new JTable(cellData, rowNames);
		
		// Legt einen Scroll-Pane fuer die Tabelle an. Notwendig, um die Spaltennamen der Tabellen sichtbar zu machen
		JScrollPane sp = new JScrollPane(table);
		sp.setPreferredSize(new Dimension(300, 100));	// Legt die Groesse des ScrollPanes fest
		
		// Panel mit der alten Tabelle loeschen
		tableContainer.removeAll();
		// Tabelle einfuegen
		tableContainer.add(sp);
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// Ausgeben, welches Action-Kommando ausgefuehrt wurde (Text in den Buttons)
		System.out.println(arg0.getActionCommand() );
		
		// Wenn 'Benutzer anlegen' betaetigt wurde, dann mache die hBox sichtbar ...
		if(arg0.getActionCommand().equals("Benutzer anlegen"))
		{
			inputPanel.setVisible(true);	// inputPanel sichtbar machen
			send.setVisible(true);			// send-Button sichtbar machen
		}
		else // ... ansonsten ...
		{
			if(arg0.getActionCommand().equals("Senden")) // Wenn Senden betaetigt wurde, schreibe erzeugte Zeichenkette in Textgebiet 'textArea'
			{
				// Ausgabestring fuer Textarea erzeugen
				String text = "Sie haben den Button '"+arg0.getActionCommand()+"' gedrueckt\n\n";
				text += "Sie heissen " + inputPanel.getName() + " " + inputPanel.getFirstname() + "\n";
				text += "und sind " + inputPanel.getAge() + " Jahre alt!\n\nVielen Dank!";
				
				// Methode zum erzeugen und zufuegen einer neuen Tabelle aufrufen
				addTableData();
				
				textArea.setText(text); // vorhandenen Text mit erstelltem String ueberschreiben
			}
		}
	}
}
