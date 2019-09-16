import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.*;

public class SportsGame {
	private JFrame pf;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsGame p = new SportsGame();
		p.startrun();
	}


	public void startrun() {
		pf = new JFrame("Sports_Game°æFM×¨ÓÃÈí¼þ1.0");

		
		pf.setForeground(Color.black);

		Font f = new Font("TimesRoman", Font.BOLD, 14);
    	pf.setFont(f);
    	pf.setSize(660,690);
    	CardLayout cardLayout = new CardLayout();
        pf.setLayout(cardLayout);
    	pf.setDefaultCloseOperation(pf.EXIT_ON_CLOSE);
    	
    	panelCover PanelCover = new panelCover();
    	panelLogin PanelLogin = new panelLogin();
    	panelMain PanelMain = new panelMain();
    	panelSeason PanelSeason = new panelSeason();
    	
    	
    	pf.add(PanelCover);
    	pf.add(PanelLogin);
    	pf.add(PanelMain);
    	pf.add(PanelSeason);
    	
    	PanelCover.setVisible(true);
        PanelLogin.setVisible(false);
        PanelMain.setVisible(false);
        PanelSeason.setVisible(false);

        PanelCover.enterButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				PanelCover.setVisible(false);
				PanelLogin.setVisible(true);
			}
    	});
        
        PanelLogin.loginButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				PanelLogin.setVisible(false);
				PanelMain.setVisible(true);
			}
    	});
        
        PanelMain.marketButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ImageIcon select = new ImageIcon("src/image/marketbuttonfocus.png");
        		PanelMain.marketButton.setIcon(select);
        	}
        });
        
        PanelMain.seasonButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		PanelMain.setVisible(false);
        		PanelSeason.setVisible(true);
        	}
        });
        
        PanelSeason.backButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		PanelSeason.setVisible(false);
        		PanelMain.setVisible(true);
        	}
        });
        
        
        pf.setResizable(false);
    	pf.setVisible(true);
    	
    	
   
	}
	
	
}

class panelCover extends JPanel{
	JButton enterButton = new JButton();
	public panelCover() {
		
		this.setLayout(new SpringLayout());
		ImageIcon backgroundimage = new ImageIcon ("src/image/mainbackground.jpg");
		JLabel backgroundimagelabel = new JLabel(backgroundimage);
		backgroundimagelabel.setBounds(0, 0, this.getWidth(), this.getHeight());
    
		this.setOpaque(false);
		this.add(backgroundimagelabel);
    
		ImageIcon login = new ImageIcon("src/image/enter.jpg");
		enterButton.setIcon(login);
		enterButton.setMargin(new Insets(0,0,0,0));
		enterButton.setBorder(null);
		enterButton.setFocusPainted(false);
		enterButton.setFocusable(true);
	
		Spring xPad = Spring.constant(20);
		Spring yPad = Spring.constant(470);
		SpringLayout.Constraints constraintLoginButton = new SpringLayout.Constraints();
		constraintLoginButton.setConstraint(SpringLayout.WEST,xPad);
		constraintLoginButton.setConstraint(SpringLayout.NORTH, yPad);
	
		this.add(enterButton,constraintLoginButton);
    
		this.setVisible(false);
	}	
}


class panelLogin extends JPanel{
	JButton loginButton = new JButton();
	public panelLogin() {
		this.setLayout(new SpringLayout());
		this.setSize(650,650);
		
		ImageIcon backgroundimage = new ImageIcon ("src/image/loginback.jpg");
		JLabel backgroundimagelabel = new JLabel(backgroundimage);
		backgroundimagelabel.setBounds(0, 0, this.getWidth(), this.getHeight());
    
		this.setOpaque(false);
		this.add(backgroundimagelabel);
    
		ImageIcon login = new ImageIcon("src/image/login.jpg");
		loginButton.setIcon(login);
		loginButton.setMargin(new Insets(0,0,0,0));
		loginButton.setBorder(null);
		loginButton.setFocusPainted(false);
		loginButton.setFocusable(true);
	
		Spring xPad = Spring.constant(60);
		Spring yPad = Spring.constant(570);
		SpringLayout.Constraints constraintLoginButton = new SpringLayout.Constraints();
		constraintLoginButton.setConstraint(SpringLayout.WEST,xPad);
		constraintLoginButton.setConstraint(SpringLayout.NORTH, yPad);
		this.add(loginButton,constraintLoginButton);
		

		JTextField textName = new JTextField();
		Dimension dimName = new Dimension (80,32);
		textName.setPreferredSize(dimName);
		Spring xTextNamePad = Spring.constant(160);
		Spring yTextNamePad = Spring.constant(495);
		SpringLayout.Constraints constraintTextName = new SpringLayout.Constraints();
		constraintTextName.setConstraint(SpringLayout.WEST,xTextNamePad);
		constraintTextName.setConstraint(SpringLayout.NORTH, yTextNamePad);
		this.add(textName,constraintTextName);
		
		JTextField textPass = new JTextField();
		Dimension dimPass = new Dimension (80,32);
		textPass.setPreferredSize(dimPass);
		Spring xTextPassPad = Spring.constant(160);
		Spring yTextPassPad = Spring.constant(530);
		SpringLayout.Constraints constraintTextPass = new SpringLayout.Constraints();
		constraintTextPass.setConstraint(SpringLayout.WEST,xTextPassPad);
		constraintTextPass.setConstraint(SpringLayout.NORTH, yTextPassPad);
		this.add(textPass,constraintTextPass);
		
		this.setVisible(false);
	}
}



class panelMain extends JPanel{
	
	JButton seasonButton = new JButton();
	JButton teamButton = new JButton();
	JButton matchesButton = new JButton();
	JButton marketButton = new JButton();
	JButton manageButton = new JButton();
	JButton exitButton = new JButton();
	
	
	public panelMain() {
		
		this.setLayout(new BorderLayout());
		
		JPanel buttonSubPanel = new JPanel();
		GridLayout gridLayout = new GridLayout(6,1,0,0);
		buttonSubPanel.setLayout(gridLayout);
		buttonSubPanel.setSize(200,450);
		buttonSubPanel.setOpaque(false);
		this.add(BorderLayout.WEST,buttonSubPanel);
		
		ImageIcon seasonIcon = new ImageIcon("src/image/seasonbutton.png");
		seasonButton.setIcon(seasonIcon);
		seasonButton.setMargin(new Insets(0,0,0,0));
		seasonButton.setBorder(null);
		seasonButton.setFocusPainted(false);
		seasonButton.setFocusable(true);
		seasonButton.setContentAreaFilled(false);
		buttonSubPanel.add(seasonButton);
		
		ImageIcon teamIcon = new ImageIcon("src/image/teamsbutton.png");
		teamButton.setIcon(teamIcon);
		teamButton.setMargin(new Insets(0,0,0,0));
		teamButton.setBorder(null);
		teamButton.setFocusPainted(false);
		teamButton.setFocusable(true);
		teamButton.setContentAreaFilled(false);
		buttonSubPanel.add(teamButton);
		
		ImageIcon matchesIcon = new ImageIcon("src/image/matchesbutton.png");
		matchesButton.setIcon(matchesIcon);
		matchesButton.setMargin(new Insets(0,0,0,0));
		matchesButton.setBorder(null);
		matchesButton.setFocusPainted(false);
		matchesButton.setFocusable(true);
		matchesButton.setContentAreaFilled(false);
		buttonSubPanel.add(matchesButton);
		
		ImageIcon marketIcon = new ImageIcon("src/image/marketbutton.png");
		marketButton.setIcon(marketIcon);
		marketButton.setMargin(new Insets(0,0,0,0));
		marketButton.setBorder(null);
		marketButton.setFocusPainted(false);
		marketButton.setFocusable(true);
		marketButton.setContentAreaFilled(false);
		buttonSubPanel.add(marketButton);
		
		ImageIcon manageIcon = new ImageIcon("src/image/managebutton.png");
		manageButton.setIcon(manageIcon);
		manageButton.setMargin(new Insets(0,0,0,0));
		manageButton.setBorder(null);
		manageButton.setFocusPainted(false);
		manageButton.setFocusable(true);
		manageButton.setContentAreaFilled(false);
		buttonSubPanel.add(manageButton);
		
		ImageIcon exitIcon = new ImageIcon("src/image/exitbutton.png");
		exitButton.setIcon(exitIcon);
		exitButton.setMargin(new Insets(0,0,0,0));
		exitButton.setBorder(null);
		exitButton.setFocusPainted(false);
		exitButton.setFocusable(true);
		exitButton.setContentAreaFilled(false);
		buttonSubPanel.add(exitButton);
		
	}
	
	protected void paintComponent(Graphics g) {
		  ImageIcon background = new ImageIcon("src/image/background.jpg");
		  
		  g.drawImage(background.getImage(),0,0,getSize().width,getSize().height,this);
		  
	}
	
}

class panelSeason extends JPanel{
	JButton selectButton = new JButton();
	JButton calendarButton = new JButton();
	JButton rulesButton = new JButton();
	JButton backButton = new JButton();
	
	public panelSeason() {
		
		this.setLayout(new BorderLayout());
		
		JPanel blankPanel1 = new JPanel();
		JPanel blankPanel2 = new JPanel();
		blankPanel1.setVisible(false);
		blankPanel2.setVisible(false);
		
		JPanel buttonSubPanel = new JPanel();
		GridLayout gridLayout = new GridLayout(6,1,0,0);
		buttonSubPanel.setLayout(gridLayout);
		buttonSubPanel.setSize(200,450);
		buttonSubPanel.setOpaque(false);
		this.add(BorderLayout.WEST,buttonSubPanel);
		
		ImageIcon selectIcon = new ImageIcon("src/image/selectbutton.png");
		selectButton.setIcon(selectIcon);
		selectButton.setMargin(new Insets(0,0,0,0));
		selectButton.setBorder(null);
		selectButton.setFocusPainted(false);
		selectButton.setFocusable(true);
		selectButton.setContentAreaFilled(false);
		buttonSubPanel.add(selectButton);
		
		ImageIcon calendarIcon = new ImageIcon("src/image/calendarbutton.png");
		calendarButton.setIcon(calendarIcon);
		calendarButton.setMargin(new Insets(0,0,0,0));
		calendarButton.setBorder(null);
		calendarButton.setFocusPainted(false);
		calendarButton.setFocusable(true);
		calendarButton.setContentAreaFilled(false);
		buttonSubPanel.add(calendarButton);
		
		ImageIcon rulesIcon = new ImageIcon("src/image/rulesbutton.png");
		rulesButton.setIcon(rulesIcon);
		rulesButton.setMargin(new Insets(0,0,0,0));
		rulesButton.setBorder(null);
		rulesButton.setFocusPainted(false);
		rulesButton.setFocusable(true);
		rulesButton.setContentAreaFilled(false);
		buttonSubPanel.add(rulesButton);
		
		buttonSubPanel.add(blankPanel1);
		buttonSubPanel.add(blankPanel2);
		
		ImageIcon backIcon = new ImageIcon("src/image/backbutton.png");
		backButton.setIcon(backIcon);
		backButton.setMargin(new Insets(0,0,0,0));
		backButton.setBorder(null);
		backButton.setFocusPainted(false);
		backButton.setFocusable(true);
		backButton.setContentAreaFilled(false);
		buttonSubPanel.add(backButton);
		
	}
	
	protected void paintComponent(Graphics g) {
		  ImageIcon background = new ImageIcon("src/image/background.jpg");
		  
		  g.drawImage(background.getImage(),0,0,getSize().width,getSize().height,this);
		  
	}
}
