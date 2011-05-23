/*
Education-project: Swing-Basics lection 2.1

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

package de.wvskoeln.swing.lection2_1;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Klasse MainPanel, wird durch Klasse JPanel erweitert (Siehe auch: Vererbung)
 * @author bettray
 *
 */
public class MainPanel extends JPanel implements ActionListener
{
	private JTextArea textArea = null; 		// Deklarieren eines Textgebietes
	private JTextField textField = null;	// Deklarieren eines Textfeldes
	
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
		JPanel north = new JPanel();
		// Dem Nord-panel einen Textrahmen zuweisen
		north.setBorder(BorderFactory.createTitledBorder("Northpanel, mit eigenem Rahmen"));
		
		// Erzeugen eines Senden-Buttons, die Beschriftung der Buttons wird direkt dem Konstruktor uebergeben
		JButton send = new JButton("Senden");
		// Dem Button den ActionListener zufuegen, damit auf einen Mausklick-Ereignis (Event) reagiert werden kann
		send.addActionListener(this);
		
		// Erzeugen eines Reset-Buttons, die Beschriftung der Buttons wird direkt dem Konstruktor uebergeben
		JButton reset = new JButton("Loeschen");
		// Dem Button den ActionListener zufuegen, damit auf einen Mausklick-Ereignis (Event) reagiert werden kann
		reset.addActionListener(this);
		// Die Klick-Events werden unten in der Methode actionPerformed() verarbeitet
		
		// Initialisieren des Textfeldes
		textField = new JTextField();
		// Groesse des Textfeldes vorgeben (0 ... n)
		textField.setColumns(20);
		
		// Initialisieren des Textgebietes
		textArea = new JTextArea();
		
		north.add(send);		// send-Button ins north-Panel einfuegen
		north.add(textField);	// Textfeld dem north- Panel zufuegen
		north.add(reset);		// reset-Button ins north-Panel einfuegen
		
		add(north, BorderLayout.NORTH);		// north-Panel dem Mainpanel zufuegen
		add(textArea, BorderLayout.CENTER);	// Textgebiet dem Mainpanel zufuegen
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// Ausgeben, welches Action-Kommando ausgefuehrt wurde (Text in den Buttons)
		System.out.println(arg0.getActionCommand() );
		
		// Wenn Senden betaetigt wurde, dann stelle den erzeugten Text im Textgebiet 'textArea' dar ...
		if(arg0.getActionCommand().equals("Senden"))
		{
			String text = "Sie haben den Button '"+arg0.getActionCommand()+"' gedrueckt\nund in das Textfeld '"+textField.getText()+"' eingegeben.\nVielen Dank!";
			textArea.setText(text); // vorhandenen Text mit erstellem String ueberschreiben
		}
		else // ... ansonsten ...
		{
			if(arg0.getActionCommand().equals("Loeschen")) // Wenn Loeschen betaetigt wurde, loesche den text im Textgebiet 'textArea'
			{
				textArea.setText(""); // vorhandenen Text mit "" (Leerstring) ueberschreiben
			}
		}
	}
}
