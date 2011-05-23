/*
Education-project: Swing-Basics lection 2.3

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

package de.wvskoeln.swing.lection2_3;

/**
 * Erstellen eines Fensters durch erzeugen eines Objektes der erweiterten Klasse MainFrame
 * @author l_bettray
 *
 */
public class Start
{
	public Start()
	{
		// MainFrame-Objekt Deklarieren und Initialisieren
		MainFrame mFrame = new MainFrame();
//		MainFrame mFrame = new MainFrame("Das Hauptfenster"); 
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Objekt vom Typ Start erzeugen (Bewirkt aufruf des Konstruktors)
		Start s = new Start();
	}

}
