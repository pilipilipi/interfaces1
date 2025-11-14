package prueba1;

import java.awt.*;
import java.awt.geom.Point2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import static java.awt.Font.PLAIN;

public class PruebaGraphics extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaGraphics frame = new PruebaGraphics();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PruebaGraphics() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1169, 745);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		Graphics2D g2d = (Graphics2D) g;
		
		LinearGradientPaint gp2 = new LinearGradientPaint(
			    new Point2D.Float(400f, 350f),
			    new Point2D.Float(770f, 550f),
			    new float[]{0f, 0.3f, 0.5f, 0.6f, 0.8f, 1f},
			    new Color[]{
			    		new Color(128, 0, 255),
			        new Color(0, 255, 255),   // Cyan neón
			        new Color(57, 255, 20),   // Verde neón
			        new Color(255, 255, 0),   // Amarillo neón
			        new Color(255, 94, 0),    // Naranja brillante
			        new Color(255, 0, 255)   // Magenta neón
			    }
			);
		g2d.setPaint(gp2);
		g2d.fillRect(0, 0, getWidth(), getHeight());
		
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(1));
		g2d.drawLine(30, 70, 770, 70);

		g2d.setColor(Color.BLUE);
		g2d.fillRect(30, 100, 350, 60);
		g2d.setColor(Color.BLACK);
		g2d.drawRect(30, 100, 350, 60);

		g2d.setColor(Color.CYAN);
		g2d.drawRoundRect(420, 100, 350, 60, 50, 50);

		g2d.setColor(Color.PINK);
		g2d.drawArc(30, 200, 100, 100, 180, -90);

		g2d.setColor(Color.RED);
		g2d.drawOval(100, 200, 100, 100);

		g2d.setColor(Color.YELLOW);
		g2d.fillOval(240, 200, 150, 100);
		g2d.setColor(Color.BLACK);
		g2d.drawOval(240, 200, 150, 100);

		int[] tranguloX = { 450, 510, 570 };
		int[] trianguloY = { 300, 200, 300 };
		g2d.setColor(Color.ORANGE);
		g2d.drawPolygon(tranguloX, trianguloY, 3);

		int[] pentagonoX = { 670, 650, 700, 750, 730 };
		int[] pentagonoY = { 300, 245, 200, 245, 300 };
		g2d.setColor(Color.MAGENTA);
		g2d.fillPolygon(pentagonoX, pentagonoY, 5);
		g2d.setColor(Color.BLACK);
		g2d.drawPolygon(pentagonoX, pentagonoY, 5);

		g2d.setColor(Color.BLACK);
		g2d.setFont(new Font("ARIAL", PLAIN, 32));
		g2d.drawString("Esto es un txt", 30, 400);
		
		Toolkit t = Toolkit.getDefaultToolkit();
		Image imagen = t.getImage("C:\\Users\\alumno\\Downloads\\gato.jpg");
		g2d.drawImage(imagen, 30, 450, 200, 200, this);

		GradientPaint gp = new GradientPaint(400, 350, Color.RED, 770, 550, Color.GREEN);
		g2d.setPaint(gp);
		g2d.fillRect(400, 350, 370, 200);
	}

}