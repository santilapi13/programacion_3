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
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import modelo.IPersonaje;
import modelo.Mazo;
import modelo.PersonajeFactory;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class Ventana extends JFrame implements ActionListener, ListSelectionListener
{

	private JPanel contentPane;
	private JPanel panel_Izquierda;
	private JPanel panel_Derecha;
	private JPanel panel_I_arriba;
	private JPanel panel_I_abajo;
	private JTextField textFieldNombre;
	private JRadioButton rdbtnMago;
	private JRadioButton rdbtnElfo;
	private JRadioButton rdbtnHechicera;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JRadioButton rdbtnDragon;
	private JPanel panel_5;
	private JRadioButton rdbtnGuerrero;
	private JLabel lblNewLabel;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JRadioButton rdbtnTierra;
	private JPanel panel_9;
	private JRadioButton rdbtnAire;
	private JPanel panel_10;
	private JRadioButton rdbtnAgua;
	private JPanel panel_11;
	private JRadioButton rdbtnFuego;
	private final ButtonGroup buttonGroup_Tipo = new ButtonGroup();
	private final ButtonGroup buttonGroup_Elemento = new ButtonGroup();
	private JButton btnAceptar;
	private JPanel panel_12;
	private JScrollPane scrollPane;
	private JList<IPersonaje> list;
	private JScrollPane scrollPane_1;
	private JTextArea textArea;

	private DefaultListModel<IPersonaje> listModel = new DefaultListModel<IPersonaje>();

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
		setBounds(100, 100, 1039, 601);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		this.panel_Izquierda = new JPanel();
		this.contentPane.add(this.panel_Izquierda);
		this.panel_Izquierda.setLayout(new GridLayout(2, 0, 0, 0));

		this.panel_I_arriba = new JPanel();
		this.panel_I_arriba.setBorder(
				new TitledBorder(null, "Tipo de Personaje", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panel_Izquierda.add(this.panel_I_arriba);
		this.panel_I_arriba.setLayout(new GridLayout(0, 1, 0, 0));

		this.panel = new JPanel();
		this.panel_I_arriba.add(this.panel);
		this.panel.setLayout(new GridLayout(0, 3, 0, 0));

		this.panel_7 = new JPanel();
		this.panel.add(this.panel_7);

		this.lblNewLabel = new JLabel("Nombre:");
		this.panel_7.add(this.lblNewLabel);

		this.panel_6 = new JPanel();
		this.panel.add(this.panel_6);

		this.textFieldNombre = new JTextField();
		this.textFieldNombre.setPreferredSize(new Dimension(15, 20));
		this.panel_6.add(this.textFieldNombre);
		this.textFieldNombre.setColumns(10);

		this.panel_12 = new JPanel();
		this.panel.add(this.panel_12);

		this.btnAceptar = new JButton("Aceptar");
		this.btnAceptar.addActionListener(this);
		this.panel_12.add(this.btnAceptar);

		this.panel_1 = new JPanel();
		this.panel_I_arriba.add(this.panel_1);

		this.rdbtnMago = new JRadioButton("Mago");
		buttonGroup_Tipo.add(this.rdbtnMago);
		this.rdbtnMago.setSelected(true);
		this.panel_1.add(this.rdbtnMago);

		this.panel_2 = new JPanel();
		this.panel_I_arriba.add(this.panel_2);

		this.rdbtnElfo = new JRadioButton("Elfo");
		buttonGroup_Tipo.add(this.rdbtnElfo);
		this.panel_2.add(this.rdbtnElfo);

		this.panel_3 = new JPanel();
		this.panel_I_arriba.add(this.panel_3);

		this.rdbtnHechicera = new JRadioButton("Hechicera");
		buttonGroup_Tipo.add(this.rdbtnHechicera);
		this.panel_3.add(this.rdbtnHechicera);

		this.panel_4 = new JPanel();
		this.panel_I_arriba.add(this.panel_4);

		this.rdbtnDragon = new JRadioButton("Dragon");
		buttonGroup_Tipo.add(this.rdbtnDragon);
		this.panel_4.add(this.rdbtnDragon);

		this.panel_5 = new JPanel();
		this.panel_I_arriba.add(this.panel_5);

		this.rdbtnGuerrero = new JRadioButton("Guerrero");
		buttonGroup_Tipo.add(this.rdbtnGuerrero);
		this.panel_5.add(this.rdbtnGuerrero);

		this.panel_I_abajo = new JPanel();
		this.panel_I_abajo
				.setBorder(new TitledBorder(null, "Elemento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panel_Izquierda.add(this.panel_I_abajo);
		this.panel_I_abajo.setLayout(new GridLayout(0, 1, 0, 0));

		this.panel_8 = new JPanel();
		this.panel_I_abajo.add(this.panel_8);

		this.rdbtnTierra = new JRadioButton("Tierra");
		buttonGroup_Elemento.add(this.rdbtnTierra);
		this.rdbtnTierra.setSelected(true);
		this.panel_8.add(this.rdbtnTierra);

		this.panel_9 = new JPanel();
		this.panel_I_abajo.add(this.panel_9);

		this.rdbtnAire = new JRadioButton("Aire");
		buttonGroup_Elemento.add(this.rdbtnAire);
		this.panel_9.add(this.rdbtnAire);

		this.panel_10 = new JPanel();
		this.panel_I_abajo.add(this.panel_10);

		this.rdbtnAgua = new JRadioButton("Agua");
		buttonGroup_Elemento.add(this.rdbtnAgua);
		this.panel_10.add(this.rdbtnAgua);

		this.panel_11 = new JPanel();
		this.panel_I_abajo.add(this.panel_11);

		this.rdbtnFuego = new JRadioButton("Fuego");
		buttonGroup_Elemento.add(this.rdbtnFuego);
		this.panel_11.add(this.rdbtnFuego);

		this.panel_Derecha = new JPanel();
		this.contentPane.add(this.panel_Derecha);
		this.panel_Derecha.setLayout(new BorderLayout(0, 0));

		this.scrollPane_1 = new JScrollPane();
		this.scrollPane_1.setPreferredSize(new Dimension(2, 200));
		this.panel_Derecha.add(this.scrollPane_1, BorderLayout.SOUTH);

		this.textArea = new JTextArea();
		this.scrollPane_1.setViewportView(this.textArea);

		this.scrollPane = new JScrollPane();
		this.panel_Derecha.add(this.scrollPane, BorderLayout.CENTER);

		this.list = new JList<IPersonaje>();
		this.list.addListSelectionListener(this);
		this.list.setModel(listModel);
		this.scrollPane.setViewportView(this.list);

		this.rdbtnMago.setActionCommand("Mago");
		this.rdbtnElfo.setActionCommand("Elfo");
		this.rdbtnHechicera.setActionCommand("Hechicera");
		this.rdbtnDragon.setActionCommand("Dragon");
		this.rdbtnGuerrero.setActionCommand("Guerrero");

		this.rdbtnAgua.setActionCommand("Agua");
		this.rdbtnTierra.setActionCommand("Tierra");
		this.rdbtnFuego.setActionCommand("Fuego");
		this.rdbtnAire.setActionCommand("Aire");
		this.inicializa();

	}

	public void actionPerformed(ActionEvent arg0)
	{
		if (arg0.getSource() == this.btnAceptar)
		{
			do_btnAceptar_actionPerformed(arg0);
		}
	}

	protected void do_btnAceptar_actionPerformed(ActionEvent arg0)
	{
		String tipo = this.buttonGroup_Tipo.getSelection().getActionCommand();
		String elemento = this.buttonGroup_Elemento.getSelection().getActionCommand();
		String nombre = this.textFieldNombre.getText();
		IPersonaje carta = PersonajeFactory.getPersonaje(tipo, elemento, nombre);
		Mazo.getInstance().agregaCarta(carta);
		this.refrescaListas();
	}

	private void refrescaListas()
	{
		this.listModel.clear();

		Iterator<IPersonaje> it = Mazo.getInstance().getIterator();
		while (it.hasNext())
			this.listModel.addElement(it.next());
	}

	public void valueChanged(ListSelectionEvent arg0)
	{
		if (arg0.getSource() == this.list)
		{
			do_list_valueChanged(arg0);
		}
	}

	protected void do_list_valueChanged(ListSelectionEvent arg0)
	{

		IPersonaje seleccionado = this.list.getSelectedValue();
		if (seleccionado != null)
		{
			String cartelito = seleccionado.toString() + "\nArmadura: " + seleccionado.getArmadura()
					+ "\nAtaque Corto: " + seleccionado.getAtaqueCorto() + "\nAtaque Distancia: "
					+ seleccionado.getAtaqueDistante();
			this.textArea.setText(cartelito);
		}
	}

	private void inicializa()
	{
		Mazo.getInstance().agregaCarta(PersonajeFactory.getPersonaje("Elfo", "Tierra", "Legolas"));
		Mazo.getInstance().agregaCarta(PersonajeFactory.getPersonaje("Mago", "Aire", "Gandalf"));
		Mazo.getInstance().agregaCarta(PersonajeFactory.getPersonaje("Mago", "Tierra", "Radagast"));
		Mazo.getInstance().agregaCarta(PersonajeFactory.getPersonaje("Elfo", "Agua", "Galadriel"));
		Mazo.getInstance().agregaCarta(PersonajeFactory.getPersonaje("Hechicera", "Fuego", "Melisandre"));
		Mazo.getInstance().agregaCarta(PersonajeFactory.getPersonaje("Guerrero", "Fuego", "Boromir"));
		Mazo.getInstance().agregaCarta(PersonajeFactory.getPersonaje("Mago", "Fuego", "Gerald"));
		this.refrescaListas();

	}
}
