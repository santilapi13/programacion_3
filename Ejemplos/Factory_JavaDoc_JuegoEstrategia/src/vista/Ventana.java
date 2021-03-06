package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import modelo.Mapa;
import modelo.Personaje;
import modelo.PersonajeFactory;
import modelo.Posicion;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class Ventana extends JFrame implements ActionListener, ListSelectionListener
{

    private JPanel contentPane;
    private JPanel panelPrincipal;
    private JPanel panelColumna1;
    private JPanel panelColumna2;
    private JPanel panelColumna3;
    private JScrollPane scrollPane;
    private JList<Personaje> list_1;
    private JScrollPane scrollPane_2;
    private JPanel panelSur;
    private JScrollPane scrollPane_1;
    private JTextArea textArea_Log;
    private JPanel panel_Acciones;
    private JPanel panel_Movimientos;
    private JPanel panel_13;
    private JLabel lblX_1;
    private JPanel panel_14;
    private JTextField textField_X_Mueve;
    private JPanel panel_15;
    private JLabel lblY_1;
    private JPanel panel_16;
    private JTextField textField_Y_Mueve;
    private JLabel lblNewLabel_2;
    private JPanel panel_17;
    private JButton btnMover;
    private JPanel panel_CrearPersonaje;
    private JPanel panel_Crear_SeleccionTipo;
    private JRadioButton rdbtnGuerrero;
    private JRadioButton rdbtnCaballero;
    private JRadioButton rdbtnArquero;
    private JLabel label;
    private JPanel panel_Crear_Parametros;
    private JPanel panel_2;
    private JLabel lblNewLabel;
    private JPanel panel_4;
    private JTextField textField_Nombre;
    private JPanel panel_5;
    private JLabel lblX;
    private JPanel panel_6;
    private JTextField textField_X;
    private JPanel panel_7;
    private JLabel lblY;
    private JPanel panel_8;
    private JTextField textField_Y;
    private JLabel lblNewLabel_1;
    private JPanel panel_9;
    private JButton btnNuevo;
    private JButton btnAtacar;
    private JScrollPane scrollPane_3;
    private JTextArea textArea_detalles;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private JList<Personaje> list_2;
    private DefaultListModel<Personaje> listModel = new DefaultListModel<Personaje>();
    private Mapa mapa = new Mapa();
    private JButton btnEliminar;

    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
	EventQueue.invokeLater(new Runnable()
	{
	    public void run()
	    {
		try
		{
		    Ventana frame = new Ventana();
		    frame.setVisible(true);
		} catch (Exception e)
		{
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the frame.
     */
    public Ventana()
    {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 1000, 765);
	this.contentPane = new JPanel();
	this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	this.contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(this.contentPane);

	this.panelPrincipal = new JPanel();
	this.contentPane.add(this.panelPrincipal, BorderLayout.CENTER);
	this.panelPrincipal.setLayout(new GridLayout(0, 3, 0, 0));

	this.panelColumna1 = new JPanel();
	this.panelPrincipal.add(this.panelColumna1);
	this.panelColumna1.setLayout(new BorderLayout(0, 0));

	this.scrollPane = new JScrollPane();
	this.panelColumna1.add(this.scrollPane, BorderLayout.CENTER);

	this.list_1 = new JList<Personaje>();
	this.list_1.addListSelectionListener(this);

	this.scrollPane.setViewportView(this.list_1);

	this.panelColumna2 = new JPanel();
	this.panelPrincipal.add(this.panelColumna2);
	this.panelColumna2.setLayout(new GridLayout(2, 0, 0, 0));

	this.panel_CrearPersonaje = new JPanel();
	this.panel_CrearPersonaje.setBorder(
		new TitledBorder(null, "Crear Personaje", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	this.panelColumna2.add(this.panel_CrearPersonaje);
	this.panel_CrearPersonaje.setLayout(new GridLayout(2, 0, 0, 0));

	this.panel_Crear_SeleccionTipo = new JPanel();
	this.panel_Crear_SeleccionTipo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	this.panel_CrearPersonaje.add(this.panel_Crear_SeleccionTipo);
	this.panel_Crear_SeleccionTipo.setLayout(new GridLayout(0, 1, 0, 0));

	this.rdbtnGuerrero = new JRadioButton("Guerrero");
	this.buttonGroup.add(this.rdbtnGuerrero);
	this.rdbtnGuerrero.setSelected(true);
	this.panel_Crear_SeleccionTipo.add(this.rdbtnGuerrero);

	this.rdbtnCaballero = new JRadioButton("Caballero");
	this.buttonGroup.add(this.rdbtnCaballero);
	this.panel_Crear_SeleccionTipo.add(this.rdbtnCaballero);

	this.rdbtnArquero = new JRadioButton("Arquero\r\n");
	this.buttonGroup.add(this.rdbtnArquero);
	this.panel_Crear_SeleccionTipo.add(this.rdbtnArquero);

	this.label = new JLabel("");
	this.panel_Crear_SeleccionTipo.add(this.label);

	this.panel_Crear_Parametros = new JPanel();
	this.panel_Crear_Parametros.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	this.panel_CrearPersonaje.add(this.panel_Crear_Parametros);
	this.panel_Crear_Parametros.setLayout(new GridLayout(0, 2, 0, 0));

	this.panel_2 = new JPanel();
	this.panel_Crear_Parametros.add(this.panel_2);

	this.lblNewLabel = new JLabel("Nombre:");
	this.panel_2.add(this.lblNewLabel);

	this.panel_4 = new JPanel();
	this.panel_Crear_Parametros.add(this.panel_4);

	this.textField_Nombre = new JTextField();
	this.textField_Nombre.setColumns(10);
	this.panel_4.add(this.textField_Nombre);

	this.panel_5 = new JPanel();
	this.panel_Crear_Parametros.add(this.panel_5);

	this.lblX = new JLabel("X:");
	this.panel_5.add(this.lblX);

	this.panel_6 = new JPanel();
	this.panel_Crear_Parametros.add(this.panel_6);

	this.textField_X = new JTextField();
	this.textField_X.setColumns(10);
	this.panel_6.add(this.textField_X);

	this.panel_7 = new JPanel();
	this.panel_Crear_Parametros.add(this.panel_7);

	this.lblY = new JLabel("Y:");
	this.panel_7.add(this.lblY);

	this.panel_8 = new JPanel();
	this.panel_Crear_Parametros.add(this.panel_8);

	this.textField_Y = new JTextField();
	this.textField_Y.setColumns(10);
	this.panel_8.add(this.textField_Y);

	this.lblNewLabel_1 = new JLabel("");
	this.panel_Crear_Parametros.add(this.lblNewLabel_1);

	this.panel_9 = new JPanel();
	this.panel_Crear_Parametros.add(this.panel_9);

	this.btnNuevo = new JButton("Nuevo");
	this.btnNuevo.addActionListener(this);
	this.panel_9.add(this.btnNuevo);

	this.panel_Acciones = new JPanel();
	this.panel_Acciones
		.setBorder(new TitledBorder(null, "Acciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	this.panelColumna2.add(this.panel_Acciones);

	this.panel_Movimientos = new JPanel();
	this.panel_Movimientos
		.setBorder(new TitledBorder(null, "Movimiento", TitledBorder.LEADING, TitledBorder.TOP, null, null));

	this.panel_Acciones.add(this.panel_Movimientos);
	this.panel_Movimientos.setLayout(new GridLayout(0, 2, 0, 0));

	this.panel_13 = new JPanel();
	this.panel_Movimientos.add(this.panel_13);

	this.lblX_1 = new JLabel("X:");
	this.panel_13.add(this.lblX_1);

	this.panel_14 = new JPanel();
	this.panel_Movimientos.add(this.panel_14);

	this.textField_X_Mueve = new JTextField();
	this.textField_X_Mueve.setColumns(10);
	this.panel_14.add(this.textField_X_Mueve);

	this.panel_15 = new JPanel();
	this.panel_Movimientos.add(this.panel_15);

	this.lblY_1 = new JLabel("Y:");
	this.panel_15.add(this.lblY_1);

	this.panel_16 = new JPanel();
	this.panel_Movimientos.add(this.panel_16);

	this.textField_Y_Mueve = new JTextField();
	this.textField_Y_Mueve.setColumns(10);
	this.panel_16.add(this.textField_Y_Mueve);

	this.lblNewLabel_2 = new JLabel("");
	this.panel_Movimientos.add(this.lblNewLabel_2);

	this.panel_17 = new JPanel();
	this.panel_Movimientos.add(this.panel_17);

	this.btnMover = new JButton("Mover");
	this.btnMover.addActionListener(this);
	this.panel_17.add(this.btnMover);

	this.btnAtacar = new JButton("Atacar");
	this.btnAtacar.addActionListener(this);
	this.panel_Acciones.add(this.btnAtacar);

	this.btnEliminar = new JButton("Eliminar");
	this.btnEliminar.addActionListener(this);
	this.panel_Acciones.add(this.btnEliminar);

	this.scrollPane_3 = new JScrollPane();
	this.scrollPane_3.setViewportBorder(
		new TitledBorder(null, "Detalles", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	this.panel_Acciones.add(this.scrollPane_3);

	this.textArea_detalles = new JTextArea();
	this.textArea_detalles.setRows(5);
	this.textArea_detalles.setColumns(28);
	this.scrollPane_3.setViewportView(this.textArea_detalles);

	this.panelColumna3 = new JPanel();
	this.panelPrincipal.add(this.panelColumna3);
	this.panelColumna3.setLayout(new BorderLayout(0, 0));

	this.scrollPane_2 = new JScrollPane();
	this.panelColumna3.add(this.scrollPane_2, BorderLayout.CENTER);

	this.list_2 = new JList<Personaje>();
	this.scrollPane_2.setViewportView(this.list_2);

	this.panelSur = new JPanel();
	this.contentPane.add(this.panelSur, BorderLayout.SOUTH);
	this.panelSur.setLayout(new BorderLayout(0, 0));
	this.panelSur.setPreferredSize(new Dimension(50, 100));

	this.scrollPane_1 = new JScrollPane();
	this.panelSur.add(this.scrollPane_1, BorderLayout.CENTER);

	this.textArea_Log = new JTextArea();
	this.scrollPane_1.setViewportView(this.textArea_Log);

	this.setMinimumSize(new Dimension(1000, 760));
	this.btnAtacar.setActionCommand("ATACAR");
	this.btnNuevo.setActionCommand("NUEVO");
	this.btnMover.setActionCommand("MOVER");
	this.btnEliminar.setActionCommand("ELIMINAR");
	this.list_1.setModel(listModel);
	this.list_2.setModel(listModel);

    }

    public void actionPerformed(ActionEvent arg0)
    {
	if (arg0.getActionCommand().equals("NUEVO"))
	{
	    this.nuevoPersonaje();

	} else if (arg0.getActionCommand().equals("MOVER"))
	{
	    this.moverPersonaje();
	}

	else if (arg0.getActionCommand().equals("ATACAR"))
	{
	    this.atacarPersonaje();
	} else if (arg0.getActionCommand().equals("ELIMINAR"))
	    this.eliminarPersonaje();
	this.refrescaListas();
    }

    private void eliminarPersonaje()
    {
	Personaje p = this.list_1.getSelectedValue();
	if (p != null)
	{
	    this.mapa.eliminarPersonaje(p);
	    this.textArea_Log.append("Se elimino a: " + p.getNombre() + "\n");
	}

	else
	    JOptionPane.showMessageDialog(this, "Debe seleccionar un Personaje para eliminar");
    }

    private void atacarPersonaje()
    {
	String cartel;
	Personaje p = this.list_1.getSelectedValue();
	Personaje victima = this.list_2.getSelectedValue();
	if (p != null && victima != null)
	{
	    cartel = p.ataca(victima);
	    this.textArea_Log.append(cartel + "\n");
	} else
	    JOptionPane.showMessageDialog(this, "Debe seleccionar un Personaje de cada lista");

    }

    private void moverPersonaje()
    {
	Personaje p = this.list_1.getSelectedValue();
	if (p != null)
	{
	    double x = Double.parseDouble(this.textField_X_Mueve.getText());
	    double y = Double.parseDouble(this.textField_Y_Mueve.getText());
	    p.mueve(x, y);
	    this.textArea_Log.append("Se movio a: " + p.getNombre() + "X: " + x + " Y: " + y + "\n");

	} else
	    JOptionPane.showMessageDialog(this, "Debe seleccionar un Personaje para mover");
    }

    private void nuevoPersonaje()
    {

	String nombre = this.textField_Nombre.getText();
	double x = Double.parseDouble(this.textField_X.getText());
	double y = Double.parseDouble(this.textField_Y.getText());
	String tipo = null;
	if (this.rdbtnGuerrero.isSelected())
	    tipo = "Guerrero";
	else if (this.rdbtnCaballero.isSelected())
	    tipo = "Caballero";
	else if (this.rdbtnArquero.isSelected())
	    tipo = "Arquero";
	Personaje p = PersonajeFactory.getPersonaje(tipo, nombre, new Posicion(x, y));
	this.mapa.agregarPersonaje(p);
	this.textArea_Log.append("Se agrego a: " + p.getNombre() + "\n");
    }

    public void valueChanged(ListSelectionEvent arg0)
    {
	Object p = this.list_1.getSelectedValue();
	if (p != null)
	{
	    this.textArea_detalles.setText(p.toString());
	}

    }

    private void refrescaListas()
    {
	this.listModel.clear();
	Iterator<Personaje> it = this.mapa.getPersonajes().iterator();
	while (it.hasNext())
	    this.listModel.addElement(it.next());
	this.repaint();
    }

}
