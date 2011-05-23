/*
Education-project: Swing-Basics lection 1.6

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

package de.wvskoeln.swing.lection1_6;

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Klasse MainPanel, wird durch Klasse JPanel erweitert (Siehe auch: Vererbung)
 * @author bettray
 *
 */
public class MainPanel extends JPanel
{
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
		
		initComponents();
	}
	
	/**
	 * Initialisieren der im Panel enthaltenen Komponenten
	 */
	private void initComponents()
	{
		// JPanel erzeugen, welches die beiden Buttons aufnimmt
		JPanel north = new JPanel();
		// Dem Nord-panel einen Textrahmen zuweisen
		north.setBorder(BorderFactory.createTitledBorder("Northpanel, mit eigenem Rahmen"));
		
		// Erzeugen von 2 Buttons, die Beschriftung der Buttons wird direkt dem Konstruktor uebergeben
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		
		// Erzeugen von Textlabels
		JLabel label_south = new JLabel("Dies ist ein Textlabel, es steht und im 'Sueden'");
		JLabel label_west = new JLabel("Links, bzw. Westen");
		JLabel label_east = new JLabel("Rechts, bzw. Osten");
		
		// Buttons ins north-Panel einfuegen
		north.add(button1);
		north.add(button2);
		
		// Erzeugen eines Textfeldes
		JTextField textfeld = new JTextField("Textfeld, diesmal mit vorgegebenem Text");
		// Groesse des Textfeldes vorgeben (0 ... n)
		textfeld.setColumns(20);
		
		add(north, BorderLayout.NORTH);		// button-Panel zufuegen
		add(textfeld, BorderLayout.CENTER);	// textfeld zufuegen
		add(label_south, BorderLayout.SOUTH);	// Label hinzufuegen
		add(label_west, BorderLayout.WEST);	// Label hinzufuegen
		add(label_east, BorderLayout.EAST);	// Label hinzufuegen
	}
}
