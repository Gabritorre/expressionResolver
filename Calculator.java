
public class Calculator extends javax.swing.JFrame {
	public String operazioneTotale = new String();
	public int openBrackets = 0;
	public int closeBrackets = 0;
	
	//Creates new form nuovoFrame
	public Calculator() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		somma = new javax.swing.JButton();
		uguale = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		sottrazione = new javax.swing.JButton();
		moltiplicazione = new javax.swing.JButton();
		divisione = new javax.swing.JButton();
		punto = new javax.swing.JButton();
		numeroNepero = new javax.swing.JButton();
		potenza = new javax.swing.JButton();
		logaritmo = new javax.swing.JButton();
		coseno = new javax.swing.JButton();
		logaritmoNaturale = new javax.swing.JButton();
		radice = new javax.swing.JButton();
		fattoriale = new javax.swing.JButton();
		chiusaParentesi = new javax.swing.JButton();
		PI = new javax.swing.JButton();
		valoreAssoluto = new javax.swing.JButton();
		seno = new javax.swing.JButton();
		apertaParentesi = new javax.swing.JButton();
		cancellaTutto = new javax.swing.JButton();
		backSpace = new javax.swing.JButton();
		jButton0 = new javax.swing.JButton();
		negativeNumber = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton1.setBackground(new java.awt.Color(30, 26, 26));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("1");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setBackground(new java.awt.Color(30, 26, 26));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("2");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new java.awt.Color(30, 26, 26));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("3");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setBackground(new java.awt.Color(30, 26, 26));
		jButton4.setForeground(new java.awt.Color(255, 255, 255));
		jButton4.setText("4");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		somma.setBackground(new java.awt.Color(30, 26, 26));
		somma.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
		somma.setForeground(new java.awt.Color(255, 255, 255));
		somma.setText("+");
		somma.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sommaActionPerformed(evt);
			}
		});

		uguale.setBackground(new java.awt.Color(12, 98, 166));
		uguale.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
		uguale.setForeground(new java.awt.Color(255, 255, 255));
		uguale.setText("=");
		uguale.setToolTipText("");
		uguale.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ugualeActionPerformed(evt);
			}
		});

		jTextField1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

		jButton5.setBackground(new java.awt.Color(30, 26, 26));
		jButton5.setForeground(new java.awt.Color(255, 255, 255));
		jButton5.setText("5");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setBackground(new java.awt.Color(30, 26, 26));
		jButton6.setForeground(new java.awt.Color(255, 255, 255));
		jButton6.setText("6");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setBackground(new java.awt.Color(30, 26, 26));
		jButton7.setForeground(new java.awt.Color(255, 255, 255));
		jButton7.setText("7");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton8.setBackground(new java.awt.Color(30, 26, 26));
		jButton8.setForeground(new java.awt.Color(255, 255, 255));
		jButton8.setText("8");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		jButton9.setBackground(new java.awt.Color(30, 26, 26));
		jButton9.setForeground(new java.awt.Color(255, 255, 255));
		jButton9.setText("9");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		sottrazione.setBackground(new java.awt.Color(30, 26, 26));
		sottrazione.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
		sottrazione.setForeground(new java.awt.Color(255, 255, 255));
		sottrazione.setText("-");
		sottrazione.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sottrazioneActionPerformed(evt);
			}
		});

		moltiplicazione.setBackground(new java.awt.Color(30, 26, 26));
		moltiplicazione.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
		moltiplicazione.setForeground(new java.awt.Color(255, 255, 255));
		moltiplicazione.setText("*");
		moltiplicazione.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				moltiplicazioneActionPerformed(evt);
			}
		});

		divisione.setBackground(new java.awt.Color(30, 26, 26));
		divisione.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
		divisione.setForeground(new java.awt.Color(255, 255, 255));
		divisione.setText("/");
		divisione.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				divisioneActionPerformed(evt);
			}
		});

		punto.setBackground(new java.awt.Color(55, 55, 55));
		punto.setForeground(new java.awt.Color(255, 255, 255));
		punto.setText(".");
		punto.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				puntoActionPerformed(evt);
			}
		});

		numeroNepero.setBackground(new java.awt.Color(55, 55, 55));
		numeroNepero.setForeground(new java.awt.Color(255, 255, 255));
		numeroNepero.setText("e");
		numeroNepero.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				numeroNeperoActionPerformed(evt);
			}
		});

		potenza.setBackground(new java.awt.Color(55, 55, 55));
		potenza.setForeground(new java.awt.Color(255, 255, 255));
		potenza.setText("x^");
		potenza.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				potenzaActionPerformed(evt);
			}
		});

		logaritmo.setBackground(new java.awt.Color(55, 55, 55));
		logaritmo.setForeground(new java.awt.Color(255, 255, 255));
		logaritmo.setText("log");
		logaritmo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				logaritmoActionPerformed(evt);
			}
		});

		coseno.setBackground(new java.awt.Color(55, 55, 55));
		coseno.setForeground(new java.awt.Color(255, 255, 255));
		coseno.setText("cos");
		coseno.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cosenoActionPerformed(evt);
			}
		});

		logaritmoNaturale.setBackground(new java.awt.Color(55, 55, 55));
		logaritmoNaturale.setForeground(new java.awt.Color(255, 255, 255));
		logaritmoNaturale.setText("ln");
		logaritmoNaturale.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				logaritmoNaturaleActionPerformed(evt);
			}
		});

		radice.setBackground(new java.awt.Color(55, 55, 55));
		radice.setForeground(new java.awt.Color(255, 255, 255));
		radice.setText("√");
		radice.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				radiceActionPerformed(evt);
			}
		});

		fattoriale.setBackground(new java.awt.Color(55, 55, 55));
		fattoriale.setForeground(new java.awt.Color(255, 255, 255));
		fattoriale.setText("n!");
		fattoriale.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				fattorialeActionPerformed(evt);
			}
		});

		chiusaParentesi.setBackground(new java.awt.Color(55, 55, 55));
		chiusaParentesi.setForeground(new java.awt.Color(255, 255, 255));
		chiusaParentesi.setText(")");
		chiusaParentesi.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				chiusaParentesiActionPerformed(evt);
			}
		});

		PI.setBackground(new java.awt.Color(55, 55, 55));
		PI.setForeground(new java.awt.Color(255, 255, 255));
		PI.setText("π");
		PI.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				PIActionPerformed(evt);
			}
		});

		valoreAssoluto.setBackground(new java.awt.Color(55, 55, 55));
		valoreAssoluto.setForeground(new java.awt.Color(255, 255, 255));
		valoreAssoluto.setText("|x|");
		valoreAssoluto.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				valoreAssolutoActionPerformed(evt);
			}
		});

		seno.setBackground(new java.awt.Color(55, 55, 55));
		seno.setForeground(new java.awt.Color(255, 255, 255));
		seno.setText("sin");
		seno.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				senoActionPerformed(evt);
			}
		});

		apertaParentesi.setBackground(new java.awt.Color(55, 55, 55));
		apertaParentesi.setForeground(new java.awt.Color(255, 255, 255));
		apertaParentesi.setText("(");
		apertaParentesi.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				apertaParentesiActionPerformed(evt);
			}
		});

		cancellaTutto.setBackground(new java.awt.Color(69, 15, 15));
		cancellaTutto.setForeground(new java.awt.Color(255, 255, 255));
		cancellaTutto.setText("C");
		cancellaTutto.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cancellaTuttoActionPerformed(evt);
			}
		});

		backSpace.setBackground(new java.awt.Color(30, 26, 26));
		backSpace.setForeground(new java.awt.Color(255, 255, 255));
		backSpace.setText("<-");
		backSpace.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backSpaceActionPerformed(evt);
			}
		});

		jButton0.setBackground(new java.awt.Color(30, 26, 26));
		jButton0.setForeground(new java.awt.Color(255, 255, 255));
		jButton0.setText("0");
		jButton0.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton0ActionPerformed(evt);
			}
		});

		negativeNumber.setBackground(new java.awt.Color(55, 55, 55));
		negativeNumber.setForeground(new java.awt.Color(255, 255, 255));
		negativeNumber.setText("-n");
		negativeNumber.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				negativeNumberActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap(47, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addComponent(seno, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(coseno, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addComponent(valoreAssoluto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(fattoriale, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addComponent(apertaParentesi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(chiusaParentesi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addComponent(PI, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(radice, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(negativeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(30, 30, 30)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(30, 30, 30)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
									.addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
									.addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(40, 40, 40)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addGroup(layout.createSequentialGroup()
										.addGap(58, 58, 58)
										.addComponent(uguale, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
									.addGroup(layout.createSequentialGroup()
										.addComponent(moltiplicazione, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(divisione, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
							.addGroup(layout.createSequentialGroup()
								.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(40, 40, 40)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
									.addGroup(layout.createSequentialGroup()
										.addComponent(cancellaTutto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(backSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
									.addGroup(layout.createSequentialGroup()
										.addComponent(somma, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(sottrazione, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
						.addGap(45, 45, 45))
					.addGroup(layout.createSequentialGroup()
						.addComponent(numeroNepero, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(potenza, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(logaritmoNaturale, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(logaritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))))
			.addGroup(layout.createSequentialGroup()
				.addGap(155, 155, 155)
				.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(0, 0, 0))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addGap(5, 5, 5)
				.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(numeroNepero, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(potenza, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(logaritmoNaturale, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(logaritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(chiusaParentesi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(apertaParentesi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(cancellaTutto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(backSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
							.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(somma, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(sottrazione, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
							.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(moltiplicazione, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(divisione, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(fattoriale, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(valoreAssoluto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
					.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(coseno, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(seno, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(uguale, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(radice, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(PI, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(negativeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addContainerGap(35, Short.MAX_VALUE))
		);

		pack();
	}// </editor-fold>//GEN-END:initComponents
	
	private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
		if(operazioneTotale.equals("0")){
			operazioneTotale = "0";
		}
		else{
			operazioneTotale = operazioneTotale.concat("0");
		}

		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_jButton0ActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		if(operazioneTotale.equals("0")){
			operazioneTotale = "1";
		}
		else{
			operazioneTotale = operazioneTotale.concat("1");
		}
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_jButton1ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
		if(operazioneTotale.equals("0")){
			operazioneTotale = "2";
		}
		else{
			operazioneTotale = operazioneTotale.concat("2");
		}
		
		jTextField1.setText(operazioneTotale); 
	}//GEN-LAST:event_jButton2ActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
		if(operazioneTotale.equals("0")){
			operazioneTotale = "3";
		}
		else{
			operazioneTotale = operazioneTotale.concat("3");
		}
		
		jTextField1.setText(operazioneTotale); 
	}//GEN-LAST:event_jButton3ActionPerformed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
		if(operazioneTotale.equals("0")){
			operazioneTotale = "4";
		}
		else{
			operazioneTotale = operazioneTotale.concat("4");
		}
		
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_jButton4ActionPerformed

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
		if(operazioneTotale.equals("0")){
			operazioneTotale = "5";
		}
		else{
			operazioneTotale = operazioneTotale.concat("5");
		}
		
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_jButton5ActionPerformed

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
		if(operazioneTotale.equals("0")){
			operazioneTotale = "6";
		}
		else{
			operazioneTotale = operazioneTotale.concat("6");
		}
		
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_jButton6ActionPerformed

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
	if(operazioneTotale.equals("0")){
			operazioneTotale = "7";
		}
		else{
			operazioneTotale = operazioneTotale.concat("7");
		}
		
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_jButton7ActionPerformed

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
		if(operazioneTotale.equals("0")){
			operazioneTotale = "8";
		}
		else{
			operazioneTotale = operazioneTotale.concat("8");
		}
		
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_jButton8ActionPerformed

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
		if(operazioneTotale.equals("0")){
			operazioneTotale = "9";
		}
		else{
			operazioneTotale = operazioneTotale.concat("9");
		}
		
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_jButton9ActionPerformed

	private void sommaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sommaActionPerformed
		operazioneTotale = operazioneTotale.concat("+");
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_sommaActionPerformed

	private void sottrazioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sottrazioneActionPerformed
		operazioneTotale = operazioneTotale.concat("-");
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_sottrazioneActionPerformed

	private void moltiplicazioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moltiplicazioneActionPerformed
		operazioneTotale = operazioneTotale.concat("*");
			jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_moltiplicazioneActionPerformed

	private void divisioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisioneActionPerformed
		operazioneTotale = operazioneTotale.concat("/");
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_divisioneActionPerformed

	private void ugualeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ugualeActionPerformed
		if(openBrackets == closeBrackets){
			Expression calcolatore = new Expression(operazioneTotale);
			double risultato = calcolatore.analizzaStringa(openBrackets);
			operazioneTotale = operazioneTotale.concat(" = " + risultato);
			jTextField1.setText(operazioneTotale);
			operazioneTotale = "";
		}
		else{
			System.out.println("missing parentheses");
		}
	}//GEN-LAST:event_ugualeActionPerformed

	private void potenzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenzaActionPerformed
		operazioneTotale = operazioneTotale.concat("^");
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_potenzaActionPerformed

	private void radiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiceActionPerformed
		operazioneTotale = operazioneTotale.concat("√");
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_radiceActionPerformed

	private void numeroNeperoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroNeperoActionPerformed
		operazioneTotale = operazioneTotale.concat("e");
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_numeroNeperoActionPerformed

	private void logaritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logaritmoActionPerformed
		operazioneTotale = operazioneTotale.concat("log");
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_logaritmoActionPerformed

	private void cosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosenoActionPerformed
		operazioneTotale = operazioneTotale.concat("cos");
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_cosenoActionPerformed

	private void senoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senoActionPerformed
		operazioneTotale = operazioneTotale.concat("sin");
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_senoActionPerformed

	private void fattorialeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fattorialeActionPerformed
		operazioneTotale = operazioneTotale.concat("!");
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_fattorialeActionPerformed

	private void apertaParentesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apertaParentesiActionPerformed
		operazioneTotale = operazioneTotale.concat("(");
		jTextField1.setText(operazioneTotale);
		openBrackets++;
	}//GEN-LAST:event_apertaParentesiActionPerformed

	private void chiusaParentesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiusaParentesiActionPerformed
		operazioneTotale = operazioneTotale.concat(")");
		jTextField1.setText(operazioneTotale);
		closeBrackets++;
	}//GEN-LAST:event_chiusaParentesiActionPerformed

	private void PIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PIActionPerformed
		operazioneTotale = operazioneTotale.concat("π");
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_PIActionPerformed

	private void cancellaTuttoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancellaTuttoActionPerformed
		operazioneTotale = "";
		openBrackets = 0;
		closeBrackets = 0;
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_cancellaTuttoActionPerformed

	private void backSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backSpaceActionPerformed
		if(!operazioneTotale.isEmpty()){
			if(operazioneTotale.charAt(operazioneTotale.length()-1) == '('){
				openBrackets--;
			}
			else if(operazioneTotale.charAt(operazioneTotale.length()-1) == ')'){
				closeBrackets--;
			}
			operazioneTotale = operazioneTotale.substring(0, operazioneTotale.length()-1);
			jTextField1.setText(operazioneTotale);   
		}
	}//GEN-LAST:event_backSpaceActionPerformed

	private void logaritmoNaturaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logaritmoNaturaleActionPerformed
		operazioneTotale = operazioneTotale.concat("ln");
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_logaritmoNaturaleActionPerformed

	private void valoreAssolutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valoreAssolutoActionPerformed
		operazioneTotale = operazioneTotale.concat("abs");
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_valoreAssolutoActionPerformed

	private void negativeNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negativeNumberActionPerformed
		operazioneTotale = operazioneTotale.concat("-");
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_negativeNumberActionPerformed

	private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
		operazioneTotale = operazioneTotale.concat(".");
		jTextField1.setText(operazioneTotale);
	}//GEN-LAST:event_puntoActionPerformed

	//@param args the command line arguments
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		*/
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Calculator().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton PI;
	private javax.swing.JButton apertaParentesi;
	private javax.swing.JButton backSpace;
	private javax.swing.JButton cancellaTutto;
	private javax.swing.JButton chiusaParentesi;
	private javax.swing.JButton coseno;
	private javax.swing.JButton divisione;
	private javax.swing.JButton fattoriale;
	private javax.swing.JButton jButton0;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JButton logaritmo;
	private javax.swing.JButton logaritmoNaturale;
	private javax.swing.JButton moltiplicazione;
	private javax.swing.JButton negativeNumber;
	private javax.swing.JButton numeroNepero;
	private javax.swing.JButton potenza;
	private javax.swing.JButton punto;
	private javax.swing.JButton radice;
	private javax.swing.JButton seno;
	private javax.swing.JButton somma;
	private javax.swing.JButton sottrazione;
	private javax.swing.JButton uguale;
	private javax.swing.JButton valoreAssoluto;
	// End of variables declaration//GEN-END:variables
}
