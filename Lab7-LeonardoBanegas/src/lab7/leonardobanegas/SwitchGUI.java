package lab7.leonardobanegas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SwitchGUI extends javax.swing.JFrame {

    ArrayList<Switch> switches = new ArrayList();

    public SwitchGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrameSwitch1 = new javax.swing.JFrame();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        PanelPrincipal1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PanelGestionar1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfRouterIP = new javax.swing.JTextField();
        tfRouterMascara = new javax.swing.JTextField();
        tfRouterProtocolo = new javax.swing.JTextField();
        tfRouterVT = new javax.swing.JTextField();
        tfRouterVR = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfPCIP = new javax.swing.JTextField();
        tfPCMascara = new javax.swing.JTextField();
        btnCrearRouter1 = new javax.swing.JButton();
        btnCrearPC1 = new javax.swing.JButton();
        PanelMensajeria1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        tfMensajeriaIPOrigen = new javax.swing.JTextField();
        tfMensajeriaIPDestino = new javax.swing.JTextField();
        tfMensajeriaTitulo = new javax.swing.JTextField();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tfMensajeriaContenido = new javax.swing.JTextArea();
        btnenviarmensaje = new javax.swing.JButton();
        FrameSwitch2 = new javax.swing.JFrame();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        PanelPrincipal2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        PanelGestionar2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfRouterIP2 = new javax.swing.JTextField();
        tfRouterMascara2 = new javax.swing.JTextField();
        tfRouterProtocolo2 = new javax.swing.JTextField();
        tfRouterVT2 = new javax.swing.JTextField();
        tfRouterVR2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tfPCIP2 = new javax.swing.JTextField();
        tfPCMascara2 = new javax.swing.JTextField();
        btnCrearRouter2 = new javax.swing.JButton();
        btnCrearPC2 = new javax.swing.JButton();
        PanelMensajeria2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        tfNombreSwitch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfVelTrans = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfVelRecep = new javax.swing.JTextField();
        btnCrearSwitch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tfRouter1WAN = new javax.swing.JTextField();
        tfRouter2WAN = new javax.swing.JTextField();
        btnWan = new javax.swing.JButton();

        FrameSwitch1.setPreferredSize(new java.awt.Dimension(800, 600));
        FrameSwitch1.setSize(new java.awt.Dimension(800, 600));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dispositivo", "IP Address", "Gateaway"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout PanelPrincipal1Layout = new javax.swing.GroupLayout(PanelPrincipal1);
        PanelPrincipal1.setLayout(PanelPrincipal1Layout);
        PanelPrincipal1Layout.setHorizontalGroup(
            PanelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipal1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        PanelPrincipal1Layout.setVerticalGroup(
            PanelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipal1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Principal", PanelPrincipal1);

        jLabel1.setText("IP");

        jLabel2.setText("Mascara");

        jLabel6.setText("Protocolo");

        jLabel7.setText("VT");

        jLabel8.setText("VR");

        jLabel9.setText("Router");

        jLabel10.setText("PC");

        jLabel11.setText("IP");

        jLabel12.setText("Mascara");

        btnCrearRouter1.setText("Crear");
        btnCrearRouter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearRouter1MouseClicked(evt);
            }
        });

        btnCrearPC1.setText("Crear");
        btnCrearPC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearPC1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelGestionar1Layout = new javax.swing.GroupLayout(PanelGestionar1);
        PanelGestionar1.setLayout(PanelGestionar1Layout);
        PanelGestionar1Layout.setHorizontalGroup(
            PanelGestionar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGestionar1Layout.createSequentialGroup()
                .addGroup(PanelGestionar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGestionar1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(PanelGestionar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(67, 67, 67)
                        .addGroup(PanelGestionar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfRouterMascara)
                            .addComponent(tfRouterIP)
                            .addComponent(tfRouterProtocolo)
                            .addComponent(tfRouterVT)
                            .addComponent(tfRouterVR, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                        .addGap(65, 65, 65)
                        .addGroup(PanelGestionar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)))
                    .addGroup(PanelGestionar1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(PanelGestionar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrearRouter1)
                            .addGroup(PanelGestionar1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel9)))))
                .addGap(51, 51, 51)
                .addGroup(PanelGestionar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGestionar1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelGestionar1Layout.createSequentialGroup()
                        .addGroup(PanelGestionar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPCIP)
                            .addComponent(tfPCMascara, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addGap(54, 54, 54))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGestionar1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrearPC1)
                .addGap(158, 158, 158))
        );
        PanelGestionar1Layout.setVerticalGroup(
            PanelGestionar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGestionar1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelGestionar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addGroup(PanelGestionar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfRouterIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tfPCIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(PanelGestionar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfRouterMascara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tfPCMascara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PanelGestionar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfRouterProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(btnCrearPC1)
                .addGap(1, 1, 1)
                .addGroup(PanelGestionar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfRouterVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PanelGestionar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfRouterVR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnCrearRouter1)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Gestionar", PanelGestionar1);

        jLabel24.setText("Mensaje");

        jLabel25.setText("IP Origen");

        jLabel26.setText("IP Destino");

        jLabel27.setText("Titulo");

        jLabel28.setText("Contenido");

        tfMensajeriaContenido.setColumns(20);
        tfMensajeriaContenido.setRows(5);
        jScrollPane3.setViewportView(tfMensajeriaContenido);

        scrollPane1.add(jScrollPane3);

        btnenviarmensaje.setText("Enviar");

        javax.swing.GroupLayout PanelMensajeria1Layout = new javax.swing.GroupLayout(PanelMensajeria1);
        PanelMensajeria1.setLayout(PanelMensajeria1Layout);
        PanelMensajeria1Layout.setHorizontalGroup(
            PanelMensajeria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMensajeria1Layout.createSequentialGroup()
                .addGroup(PanelMensajeria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMensajeria1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel24))
                    .addGroup(PanelMensajeria1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(PanelMensajeria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGap(42, 42, 42)
                        .addGroup(PanelMensajeria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfMensajeriaIPOrigen)
                            .addComponent(tfMensajeriaIPDestino)
                            .addComponent(tfMensajeriaTitulo)
                            .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                    .addGroup(PanelMensajeria1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnenviarmensaje)))
                .addContainerGap(472, Short.MAX_VALUE))
        );
        PanelMensajeria1Layout.setVerticalGroup(
            PanelMensajeria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMensajeria1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel24)
                .addGap(38, 38, 38)
                .addGroup(PanelMensajeria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tfMensajeriaIPOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(PanelMensajeria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tfMensajeriaIPDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelMensajeria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tfMensajeriaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(PanelMensajeria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnenviarmensaje)
                .addGap(96, 96, 96))
        );

        jTabbedPane2.addTab("Mensajeria", PanelMensajeria1);

        javax.swing.GroupLayout FrameSwitch1Layout = new javax.swing.GroupLayout(FrameSwitch1.getContentPane());
        FrameSwitch1.getContentPane().setLayout(FrameSwitch1Layout);
        FrameSwitch1Layout.setHorizontalGroup(
            FrameSwitch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameSwitch1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        FrameSwitch1Layout.setVerticalGroup(
            FrameSwitch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameSwitch1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        FrameSwitch2.setPreferredSize(new java.awt.Dimension(800, 600));
        FrameSwitch2.setSize(new java.awt.Dimension(800, 600));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dispositivo", "IP Address", "Gateaway"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout PanelPrincipal2Layout = new javax.swing.GroupLayout(PanelPrincipal2);
        PanelPrincipal2.setLayout(PanelPrincipal2Layout);
        PanelPrincipal2Layout.setHorizontalGroup(
            PanelPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipal2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        PanelPrincipal2Layout.setVerticalGroup(
            PanelPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipal2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Principal", PanelPrincipal2);

        jLabel13.setText("IP");

        jLabel14.setText("Mascara");

        jLabel15.setText("Protocolo");

        jLabel16.setText("VT");

        jLabel17.setText("VR");

        jLabel18.setText("Router");

        jLabel19.setText("PC");

        jLabel20.setText("IP");

        jLabel21.setText("Mascara");

        btnCrearRouter2.setText("Crear");
        btnCrearRouter2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearRouter2MouseClicked(evt);
            }
        });

        btnCrearPC2.setText("Crear");
        btnCrearPC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearPC2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelGestionar2Layout = new javax.swing.GroupLayout(PanelGestionar2);
        PanelGestionar2.setLayout(PanelGestionar2Layout);
        PanelGestionar2Layout.setHorizontalGroup(
            PanelGestionar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGestionar2Layout.createSequentialGroup()
                .addGroup(PanelGestionar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGestionar2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(PanelGestionar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(67, 67, 67)
                        .addGroup(PanelGestionar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfRouterMascara2)
                            .addComponent(tfRouterIP2)
                            .addComponent(tfRouterProtocolo2)
                            .addComponent(tfRouterVT2)
                            .addComponent(tfRouterVR2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                        .addGap(65, 65, 65)
                        .addGroup(PanelGestionar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)))
                    .addGroup(PanelGestionar2Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(PanelGestionar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrearRouter2)
                            .addGroup(PanelGestionar2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel18)))))
                .addGap(51, 51, 51)
                .addGroup(PanelGestionar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGestionar2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelGestionar2Layout.createSequentialGroup()
                        .addGroup(PanelGestionar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPCIP2)
                            .addComponent(tfPCMascara2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addGap(54, 54, 54))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGestionar2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrearPC2)
                .addGap(158, 158, 158))
        );
        PanelGestionar2Layout.setVerticalGroup(
            PanelGestionar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGestionar2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelGestionar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(26, 26, 26)
                .addGroup(PanelGestionar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfRouterIP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(tfPCIP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(PanelGestionar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tfRouterMascara2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(tfPCMascara2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PanelGestionar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tfRouterProtocolo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(btnCrearPC2)
                .addGap(1, 1, 1)
                .addGroup(PanelGestionar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tfRouterVT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PanelGestionar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tfRouterVR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnCrearRouter2)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Gestionar", PanelGestionar2);

        javax.swing.GroupLayout PanelMensajeria2Layout = new javax.swing.GroupLayout(PanelMensajeria2);
        PanelMensajeria2.setLayout(PanelMensajeria2Layout);
        PanelMensajeria2Layout.setHorizontalGroup(
            PanelMensajeria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
        );
        PanelMensajeria2Layout.setVerticalGroup(
            PanelMensajeria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Mensajeria", PanelMensajeria2);

        javax.swing.GroupLayout FrameSwitch2Layout = new javax.swing.GroupLayout(FrameSwitch2.getContentPane());
        FrameSwitch2.getContentPane().setLayout(FrameSwitch2Layout);
        FrameSwitch2Layout.setHorizontalGroup(
            FrameSwitch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameSwitch2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        FrameSwitch2Layout.setVerticalGroup(
            FrameSwitch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameSwitch2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        setSize(new java.awt.Dimension(500, 500));

        jLabel3.setText("Nombre");

        jLabel4.setText("Velocidad de Transmision");

        jLabel5.setText("Velocidad de Recepcion");

        btnCrearSwitch.setText("Crear Switch");
        btnCrearSwitch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearSwitchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfNombreSwitch)
                    .addComponent(tfVelTrans)
                    .addComponent(tfVelRecep, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnCrearSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombreSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfVelTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfVelRecep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnCrearSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LAN", jPanel1);

        jLabel22.setText("IP Router 1");

        jLabel23.setText("IP Router 2");

        btnWan.setText("Crear Wan");
        btnWan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfRouter2WAN, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(tfRouter1WAN))
                .addGap(105, 105, 105))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btnWan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tfRouter1WAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tfRouter2WAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(btnWan)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("WAN", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearSwitchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearSwitchMouseClicked
        String nombre = tfNombreSwitch.getText();
        int vt = Integer.parseInt(tfVelTrans.getText());
        int vr = Integer.parseInt(tfVelRecep.getText());
        switches.add(new Switch(nombre, vt, vr));
        if (switches.size() == 1) {
            FrameSwitch1.setTitle(nombre);
            FrameSwitch1.setVisible(true);
        } else if (switches.size() == 2) {
            FrameSwitch2.setTitle(nombre);
            FrameSwitch2.setVisible(true);
        }

    }//GEN-LAST:event_btnCrearSwitchMouseClicked

    private void btnCrearRouter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearRouter1MouseClicked
        String IP = tfRouterIP.getText();
        String mascara = tfRouterMascara.getText();
        String protocolo = tfRouterProtocolo.getText();
        int VT = Integer.parseInt(tfRouterVT.getText());
        int VR = Integer.parseInt(tfRouterVR.getText());
        switches.get(0).setRouter(new Router(IP, mascara, protocolo, VT, VR));

        DefaultTableModel modelotabla = (DefaultTableModel) jTable1.getModel();
        Object[] newrow = {"Router", IP, ""};
        modelotabla.addRow(newrow);
        jTable1.setModel(modelotabla);
        tfRouterIP.setText("");
        tfRouterMascara.setText("");
        tfRouterProtocolo.setText("");
        tfRouterVT.setText("");
        tfRouterVR.setText("");
    }//GEN-LAST:event_btnCrearRouter1MouseClicked

    private void btnCrearPC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearPC1MouseClicked
        String IP = tfPCIP.getText();
        String mascara = tfPCMascara.getText();
        switches.get(0).getPcs().add(new PC(IP, mascara, switches.get(0).getRouter().getDireccionIP()));

        DefaultTableModel modelotabla = (DefaultTableModel) jTable1.getModel();
        Object[] newrow = {"PC", IP, switches.get(0).getRouter().getDireccionIP()};
        modelotabla.addRow(newrow);
        jTable1.setModel(modelotabla);
        tfPCIP.setText("");
        tfPCMascara.setText("");
    }//GEN-LAST:event_btnCrearPC1MouseClicked

    private void btnCrearRouter2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearRouter2MouseClicked
        String IP = tfRouterIP2.getText();
        String mascara = tfRouterMascara2.getText();
        String protocolo = tfRouterProtocolo2.getText();
        int VT = Integer.parseInt(tfRouterVT2.getText());
        int VR = Integer.parseInt(tfRouterVR2.getText());
        switches.get(1).setRouter(new Router(IP, mascara, protocolo, VT, VR));

        DefaultTableModel modelotabla = (DefaultTableModel) jTable2.getModel();
        Object[] newrow = {"Router", IP, ""};
        modelotabla.addRow(newrow);
        jTable2.setModel(modelotabla);

        tfRouterIP2.setText("");
        tfRouterMascara2.setText("");
        tfRouterProtocolo2.setText("");
        tfRouterVT2.setText("");
        tfRouterVR2.setText("");
    }//GEN-LAST:event_btnCrearRouter2MouseClicked

    private void btnCrearPC2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearPC2MouseClicked
        String IP = tfPCIP2.getText();
        String mascara = tfPCMascara2.getText();
        switches.get(1).getPcs().add(new PC(IP, mascara, switches.get(1).getRouter().getDireccionIP()));

        DefaultTableModel modelotabla = (DefaultTableModel) jTable2.getModel();
        Object[] newrow = {"PC", IP, switches.get(1).getRouter().getDireccionIP()};
        modelotabla.addRow(newrow);
        jTable2.setModel(modelotabla);

        tfPCIP2.setText("");
        tfPCMascara2.setText("");
    }//GEN-LAST:event_btnCrearPC2MouseClicked

    private void btnWanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWanMouseClicked
        if ((tfRouter1WAN.getText() == switches.get(0).getRouter().getDireccionIP())
                && tfRouter2WAN.getText() == switches.get(1).getRouter().getDireccionIP()) {
            JOptionPane.showMessageDialog(this, "WAN creada con Exito");
        } else if ((tfRouter1WAN.getText() == switches.get(1).getRouter().getDireccionIP())
                && tfRouter2WAN.getText() == switches.get(0).getRouter().getDireccionIP()) {
            JOptionPane.showMessageDialog(this, "WAN creada con Exito");
        } else {
            JOptionPane.showMessageDialog(this, "IPs No Existen");
        }
    }//GEN-LAST:event_btnWanMouseClicked

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SwitchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SwitchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SwitchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SwitchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SwitchGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame FrameSwitch1;
    private javax.swing.JFrame FrameSwitch2;
    private javax.swing.JPanel PanelGestionar1;
    private javax.swing.JPanel PanelGestionar2;
    private javax.swing.JPanel PanelMensajeria1;
    private javax.swing.JPanel PanelMensajeria2;
    private javax.swing.JPanel PanelPrincipal1;
    private javax.swing.JPanel PanelPrincipal2;
    private javax.swing.JButton btnCrearPC1;
    private javax.swing.JButton btnCrearPC2;
    private javax.swing.JButton btnCrearRouter1;
    private javax.swing.JButton btnCrearRouter2;
    private javax.swing.JButton btnCrearSwitch;
    private javax.swing.JButton btnWan;
    private javax.swing.JButton btnenviarmensaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTextArea tfMensajeriaContenido;
    private javax.swing.JTextField tfMensajeriaIPDestino;
    private javax.swing.JTextField tfMensajeriaIPOrigen;
    private javax.swing.JTextField tfMensajeriaTitulo;
    private javax.swing.JTextField tfNombreSwitch;
    private javax.swing.JTextField tfPCIP;
    private javax.swing.JTextField tfPCIP2;
    private javax.swing.JTextField tfPCMascara;
    private javax.swing.JTextField tfPCMascara2;
    private javax.swing.JTextField tfRouter1WAN;
    private javax.swing.JTextField tfRouter2WAN;
    private javax.swing.JTextField tfRouterIP;
    private javax.swing.JTextField tfRouterIP2;
    private javax.swing.JTextField tfRouterMascara;
    private javax.swing.JTextField tfRouterMascara2;
    private javax.swing.JTextField tfRouterProtocolo;
    private javax.swing.JTextField tfRouterProtocolo2;
    private javax.swing.JTextField tfRouterVR;
    private javax.swing.JTextField tfRouterVR2;
    private javax.swing.JTextField tfRouterVT;
    private javax.swing.JTextField tfRouterVT2;
    private javax.swing.JTextField tfVelRecep;
    private javax.swing.JTextField tfVelTrans;
    // End of variables declaration//GEN-END:variables
}
