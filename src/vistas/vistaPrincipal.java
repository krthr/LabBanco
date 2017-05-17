package vistas;

import javax.swing.UIManager;
import labbanco.LabBanco;

public class vistaPrincipal extends javax.swing.JFrame {

    public vistaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaAñadirCaa = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        guardarCajaBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        selTipoTrans = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cantDinero = new javax.swing.JSpinner();
        ventanaAñadirCliente = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        guardarCajaBtn1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        idTextCliente = new javax.swing.JTextField();
        selTipoTrans1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        ventanaVerCaja = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtIDCaja = new javax.swing.JLabel();
        txtTipoTrans = new javax.swing.JLabel();
        despacharClienteBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        clientesTable = new javax.swing.JTable();
        volverBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        verCajaBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cajasTable = new javax.swing.JTable();
        añadirClienteBtn = new javax.swing.JButton();
        eliminarCajaBtn = new javax.swing.JButton();
        añadirCajaBtn = new javax.swing.JButton();

        ventanaAñadirCaa.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        ventanaAñadirCaa.setTitle("Añadir nueva caja - Banco");
        ventanaAñadirCaa.setMinimumSize(new java.awt.Dimension(271, 253));
        ventanaAñadirCaa.setPreferredSize(new java.awt.Dimension(271, 253));
        ventanaAñadirCaa.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(194, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nueva caja");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        guardarCajaBtn.setText("Guardar");
        guardarCajaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCajaBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        selTipoTrans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONSIGNACIÓN", "RETIRO", "PAGO DE SERVICIOS" }));

        jLabel4.setText("Tipo de transacción");

        jLabel5.setText("Cantidad de dinero");

        cantDinero.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout ventanaAñadirCaaLayout = new javax.swing.GroupLayout(ventanaAñadirCaa.getContentPane());
        ventanaAñadirCaa.getContentPane().setLayout(ventanaAñadirCaaLayout);
        ventanaAñadirCaaLayout.setHorizontalGroup(
            ventanaAñadirCaaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ventanaAñadirCaaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaAñadirCaaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardarCajaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ventanaAñadirCaaLayout.createSequentialGroup()
                        .addGroup(ventanaAñadirCaaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventanaAñadirCaaLayout.createSequentialGroup()
                                .addGroup(ventanaAñadirCaaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ventanaAñadirCaaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(selTipoTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ventanaAñadirCaaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cantDinero, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ventanaAñadirCaaLayout.setVerticalGroup(
            ventanaAñadirCaaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaAñadirCaaLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ventanaAñadirCaaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(3, 3, 3)
                .addGroup(ventanaAñadirCaaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selTipoTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardarCajaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        ventanaAñadirCliente.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        ventanaAñadirCliente.setTitle("Añadir nueva caja - Banco");
        ventanaAñadirCliente.setMinimumSize(new java.awt.Dimension(271, 233));
        ventanaAñadirCliente.setPreferredSize(new java.awt.Dimension(271, 233));
        ventanaAñadirCliente.setResizable(false);

        jPanel3.setBackground(new java.awt.Color(194, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nuevo cliente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        guardarCajaBtn1.setText("Guardar");
        guardarCajaBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCajaBtn1ActionPerformed(evt);
            }
        });

        jLabel7.setText("ID");

        selTipoTrans1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONSIGNACIÓN", "RETIRO", "PAGO DE SERVICIOS" }));

        jLabel8.setText("Tipo de transacción");

        javax.swing.GroupLayout ventanaAñadirClienteLayout = new javax.swing.GroupLayout(ventanaAñadirCliente.getContentPane());
        ventanaAñadirCliente.getContentPane().setLayout(ventanaAñadirClienteLayout);
        ventanaAñadirClienteLayout.setHorizontalGroup(
            ventanaAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ventanaAñadirClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardarCajaBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ventanaAñadirClienteLayout.createSequentialGroup()
                        .addGroup(ventanaAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(idTextCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ventanaAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(selTipoTrans1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ventanaAñadirClienteLayout.setVerticalGroup(
            ventanaAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaAñadirClienteLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ventanaAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(3, 3, 3)
                .addGroup(ventanaAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTextCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selTipoTrans1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(guardarCajaBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ventanaVerCaja.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ventanaVerCaja.setTitle("Banco - Laboratorio");
        ventanaVerCaja.setAlwaysOnTop(true);
        ventanaVerCaja.setResizable(false);

        jPanel4.setBackground(new java.awt.Color(194, 0, 0));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Caja");

        txtIDCaja.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtIDCaja.setForeground(new java.awt.Color(255, 255, 255));
        txtIDCaja.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtIDCaja.setText("ID:");

        txtTipoTrans.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtTipoTrans.setForeground(new java.awt.Color(255, 255, 255));
        txtTipoTrans.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTipoTrans.setText("TIPOTRANSC");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIDCaja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipoTrans)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        despacharClienteBtn.setText("Despachar cliente");
        despacharClienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despacharClienteBtnActionPerformed(evt);
            }
        });

        clientesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientesTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(clientesTable);

        volverBtn.setText("<");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ventanaVerCajaLayout = new javax.swing.GroupLayout(ventanaVerCaja.getContentPane());
        ventanaVerCaja.getContentPane().setLayout(ventanaVerCajaLayout);
        ventanaVerCajaLayout.setHorizontalGroup(
            ventanaVerCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ventanaVerCajaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaVerCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(despacharClienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ventanaVerCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(volverBtn)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        ventanaVerCajaLayout.setVerticalGroup(
            ventanaVerCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaVerCajaLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(despacharClienteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(volverBtn)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco - Laboratorio");
        setAlwaysOnTop(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(194, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Banco");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(524, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        verCajaBtn.setText("Ver");
        verCajaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCajaBtnActionPerformed(evt);
            }
        });

        cajasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cant. Dinero", "Tipo Transacc."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cajasTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(cajasTable);

        añadirClienteBtn.setText("Añadir cliente");
        añadirClienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirClienteBtnActionPerformed(evt);
            }
        });

        eliminarCajaBtn.setText("Eliminar");
        eliminarCajaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCajaBtnActionPerformed(evt);
            }
        });

        añadirCajaBtn.setText("Añadir caja");
        añadirCajaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirCajaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(añadirCajaBtn)
                        .addGap(18, 18, 18)
                        .addComponent(añadirClienteBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(verCajaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarCajaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añadirClienteBtn)
                    .addComponent(añadirCajaBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(verCajaBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarCajaBtn)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     * @param evt
     */
    private void añadirClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirClienteBtnActionPerformed
        if (LabBanco.getPtrCaja() == null) {
            LabBanco.showError(this, "ERROR", "No ha agregado cajas a la lista.");
        } else {
            this.setVisible(false);
            ventanaAñadirCliente.setVisible(true);
        }
    }//GEN-LAST:event_añadirClienteBtnActionPerformed

    /**
     * Añadir nueva caja.
     *
     * @param evt
     */
    private void guardarCajaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCajaBtnActionPerformed
        if (idText.getText().length() > 0) {
            LabBanco.agregarCaja(this, idText.getText(), selTipoTrans.getSelectedItem().toString(), Integer.parseInt(cantDinero.getValue() + ""));
            LabBanco.updateCajaTable(cajasTable);

            LabBanco.showMessage(this, "Caja agregada con éxito.");

            this.setVisible(true);
            ventanaAñadirCaa.setVisible(false);

            idText.setText("");
            cantDinero.setValue(0);
            selTipoTrans.setSelectedIndex(0);
        } else {
            LabBanco.showError(this, "ERROR", "Por favor, escriba el ID de la caja.");
        }
    }//GEN-LAST:event_guardarCajaBtnActionPerformed

    /**
     *
     * @param evt
     */
    private void añadirCajaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirCajaBtnActionPerformed
        this.setVisible(false);
        ventanaAñadirCaa.setVisible(true);
    }//GEN-LAST:event_añadirCajaBtnActionPerformed

    /**
     *
     * @param evt
     */
    private void verCajaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCajaBtnActionPerformed
        if (cajasTable.getSelectedRow() != -1) {

        } else {
            LabBanco.showError(this, "ERROR", "No ha seleccionado ninguna caja.");
        }
    }//GEN-LAST:event_verCajaBtnActionPerformed

    private void eliminarCajaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCajaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarCajaBtnActionPerformed

    private void guardarCajaBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCajaBtn1ActionPerformed
        LabBanco.agregarCliente(this, idTextCliente.getText(), selTipoTrans1.getSelectedItem().toString());

        this.setVisible(true);
        ventanaAñadirCliente.setVisible(false);

        idTextCliente.setText("");
        selTipoTrans1.setSelectedIndex(0);
    }//GEN-LAST:event_guardarCajaBtn1ActionPerformed

    private void despacharClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despacharClienteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_despacharClienteBtnActionPerformed

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volverBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirCajaBtn;
    private javax.swing.JButton añadirClienteBtn;
    private javax.swing.JTable cajasTable;
    private javax.swing.JSpinner cantDinero;
    private javax.swing.JTable clientesTable;
    private javax.swing.JButton despacharClienteBtn;
    private javax.swing.JButton eliminarCajaBtn;
    private javax.swing.JButton guardarCajaBtn;
    private javax.swing.JButton guardarCajaBtn1;
    private javax.swing.JTextField idText;
    private javax.swing.JTextField idTextCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> selTipoTrans;
    private javax.swing.JComboBox<String> selTipoTrans1;
    private javax.swing.JLabel txtIDCaja;
    private javax.swing.JLabel txtTipoTrans;
    private javax.swing.JFrame ventanaAñadirCaa;
    private javax.swing.JFrame ventanaAñadirCliente;
    private javax.swing.JFrame ventanaVerCaja;
    private javax.swing.JButton verCajaBtn;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
