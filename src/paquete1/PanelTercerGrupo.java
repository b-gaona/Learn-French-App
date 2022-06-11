package paquete1;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class PanelTercerGrupo extends javax.swing.JPanel {

    public boolean opcion1 = false, opcion2 = false;
    public static boolean bandera = false;
    public int contPregunta = 0;
    public static Ventana v2 = new Ventana();
    public static VentanaAcentos vs;
    public int respuestaCorrecta = 0;
    public String[] numero1 = new String[100];
    public String[] numero2 = new String[100];
    public String[] numero3 = new String[100];
    public boolean bandera2 = false;

    public PanelTercerGrupo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUpMenu = new javax.swing.JPopupMenu();
        itemAcentos = new javax.swing.JMenuItem();
        botonVolver = new javax.swing.JButton();
        etiquetaTitulo = new javax.swing.JLabel();
        botonInfo = new javax.swing.JButton();
        etiquetaInstrucciones = new javax.swing.JLabel();
        francaisASpanish = new javax.swing.JButton();
        spanishAFrancais = new javax.swing.JButton();
        botonIniciar = new javax.swing.JButton();
        panelDeJuego = new javax.swing.JPanel();
        numPreguntas = new javax.swing.JLabel();
        insertarPrimerCampo = new javax.swing.JTextField();
        insertarSegundoCampo = new javax.swing.JTextField();
        traduccion1 = new javax.swing.JLabel();
        traduccion2 = new javax.swing.JLabel();
        botonSiguiente = new javax.swing.JButton();
        botonVerResultados = new javax.swing.JButton();
        botonVolverAJugar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botonAcentos = new javax.swing.JButton();
        imagenTraduccion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        itemAcentos.setText("Acentos");

        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(720, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonVolver.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        botonVolver.setText("Volver");
        botonVolver.setFocusPainted(false);
        botonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonVolverMouseExited(evt);
            }
        });
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        etiquetaTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setText("Verbes du troisième groupe");
        add(etiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        botonInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoInfo.png"))); // NOI18N
        botonInfo.setBorder(null);
        botonInfo.setBorderPainted(false);
        botonInfo.setContentAreaFilled(false);
        botonInfo.setFocusPainted(false);
        botonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInfoActionPerformed(evt);
            }
        });
        add(botonInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        etiquetaInstrucciones.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaInstrucciones.setForeground(new java.awt.Color(255, 153, 0));
        etiquetaInstrucciones.setText("INSTRUCCIONES:");
        add(etiquetaInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        francaisASpanish.setFont(new java.awt.Font("HP Simplified", 1, 24)); // NOI18N
        francaisASpanish.setText("Francés / Español");
        francaisASpanish.setFocusPainted(false);
        francaisASpanish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                francaisASpanishMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                francaisASpanishMouseExited(evt);
            }
        });
        francaisASpanish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                francaisASpanishActionPerformed(evt);
            }
        });
        add(francaisASpanish, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 240, 50));

        spanishAFrancais.setFont(new java.awt.Font("HP Simplified", 1, 24)); // NOI18N
        spanishAFrancais.setText("Español / Francés");
        spanishAFrancais.setFocusPainted(false);
        spanishAFrancais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                spanishAFrancaisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                spanishAFrancaisMouseExited(evt);
            }
        });
        spanishAFrancais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spanishAFrancaisActionPerformed(evt);
            }
        });
        add(spanishAFrancais, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, 50));

        botonIniciar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        botonIniciar.setText("Comenzar");
        botonIniciar.setFocusPainted(false);
        botonIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonIniciarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonIniciarMouseReleased(evt);
            }
        });
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });
        add(botonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        panelDeJuego.setBackground(new Color(0,0,0,0));
        panelDeJuego.setVisible(false);
        panelDeJuego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numPreguntas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        numPreguntas.setForeground(new java.awt.Color(255, 153, 0));
        numPreguntas.setText(" / 15");
        panelDeJuego.add(numPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        insertarPrimerCampo.setEditable(false);
        insertarPrimerCampo.setColumns(10);
        insertarPrimerCampo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        panelDeJuego.add(insertarPrimerCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        insertarSegundoCampo.setColumns(10);
        insertarSegundoCampo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        insertarSegundoCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                insertarSegundoCampoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                insertarSegundoCampoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                insertarSegundoCampoKeyTyped(evt);
            }
        });
        panelDeJuego.add(insertarSegundoCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        traduccion1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        traduccion1.setForeground(new java.awt.Color(255, 153, 0));
        traduccion1.setText("jLabel1");
        panelDeJuego.add(traduccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        traduccion2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        traduccion2.setForeground(new java.awt.Color(255, 153, 0));
        traduccion2.setText("jLabel2");
        panelDeJuego.add(traduccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        botonSiguiente.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        botonSiguiente.setText("Siguiente");
        botonSiguiente.setFocusPainted(false);
        botonSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonSiguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSiguienteMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonSiguienteMouseReleased(evt);
            }
        });
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });
        panelDeJuego.add(botonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        botonVerResultados.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        botonVerResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/banderaFrancia.png"))); // NOI18N
        botonVerResultados.setText("Ver resultados");
        botonVerResultados.setBorder(null);
        botonVerResultados.setContentAreaFilled(false);
        botonVerResultados.setDisabledIcon(null);
        botonVerResultados.setFocusPainted(false);
        botonVerResultados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonVerResultados.setVisible(false);
        botonVerResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerResultadosActionPerformed(evt);
            }
        });
        panelDeJuego.add(botonVerResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 110, -1));

        botonVolverAJugar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        botonVolverAJugar.setText("Volver a jugar");
        botonVolverAJugar.setFocusPainted(false);
        botonVolverAJugar.setVisible(false);
        botonVolverAJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonVolverAJugarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonVolverAJugarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonVolverAJugarMouseReleased(evt);
            }
        });
        botonVolverAJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverAJugarActionPerformed(evt);
            }
        });
        panelDeJuego.add(botonVolverAJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        javax.swing.ImageIcon gifCelebration = new javax.swing.ImageIcon(getClass().getResource("/imagenes/tuPeux.jpg"));
        jLabel2.setIcon(new ImageIcon(gifCelebration.getImage().getScaledInstance(160, 210, Image.SCALE_REPLICATE)));
        panelDeJuego.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 160, 210));

        botonAcentos.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        botonAcentos.setText("Acentos");
        botonAcentos.setFocusPainted(false);
        botonAcentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAcentosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAcentosMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonAcentosMouseReleased(evt);
            }
        });
        botonAcentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcentosActionPerformed(evt);
            }
        });
        panelDeJuego.add(botonAcentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        add(panelDeJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 420, 320));

        imagenTraduccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/traduccion.png"))); // NOI18N
        imagenTraduccion.setPreferredSize(new java.awt.Dimension(150, 150));
        add(imagenTraduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 110, 110));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("<html>  Selecciona uno de los botones, después de eso tendrás que traducir 15 verbos del primer    grupo de manera consecutiva. <html>");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 680, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoFrancia.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        new Ventana().Eliminar();
        if (bandera) {
            vs.dispose();
            bandera = false;
        }
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInfoActionPerformed
        JOptionPane.showMessageDialog(null, " Al tercer grupo pertenecen todos los demás verbos,\n esto es: aller, el resto de los verbos terminados en -ir \n (cuyo participio presente termine sólo en -ant) incluyendo\n todos los terminados en -oir y los terminados en -re.\n"
                + "\n El tercer grupo es considerado una conjugación \n irregular ya que no se ajusta a reglas uniformes.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonInfoActionPerformed

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        if (contPregunta == 0) {
            //CUANDO EL BOTON COMENZAR SEA PRESIONADO
            if (opcion1 || opcion2) {
                botonSiguiente.setVisible(true);
                agregarInformacionALosCampos();
                comprobacionDeRespuestas();
                //OPCION FRANCES A ESPAÑOL
                if (opcion1) {
                    panelDeJuego.setVisible(true);
                    traduccion1.setText("Francés");
                    traduccion2.setText("Español");
                }
                //OPCION ESPAÑOL A FRANCES
                if (opcion2) {
                    panelDeJuego.setVisible(true);
                    traduccion1.setText("Español");
                    traduccion2.setText("Francés");
                }
                bandera2 = true;
            }
        }
    }//GEN-LAST:event_botonIniciarActionPerformed

    private void francaisASpanishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_francaisASpanishActionPerformed
        //SI EL BOTON FRANCES A ESPAÑOL ESTA ACTIVADO, DESACTIVA EL OTRO BOTON
        if (contPregunta == 0) {
            francaisASpanish.setBackground(new Color(167, 151, 255));
            spanishAFrancais.setBackground(new JButton().getBackground());
            opcion1 = true;
            opcion2 = false;
            botonSiguiente.setText("Start");
        }
    }//GEN-LAST:event_francaisASpanishActionPerformed

    private void spanishAFrancaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spanishAFrancaisActionPerformed
        //SI EL BOTON ESPAÑOL A FRANCES ESTA ACTIVADO, DESACTIVA EL OTRO BOTON
        if (contPregunta == 0) {
            francaisASpanish.setBackground(new JButton().getBackground());
            spanishAFrancais.setBackground(new Color(167, 151, 255));
            opcion2 = true;
            opcion1 = false;
            botonSiguiente.setText("Start");
        }
    }//GEN-LAST:event_spanishAFrancaisActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        this.revalidate();
        this.repaint();
        agregarInformacionALosCampos();
        comprobacionDeRespuestas();
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void comprobacionDeRespuestas() {
        if (opcion1) {
            numero1[contPregunta - 1] = v2.generarIgualdad3();
            numero2[contPregunta - 1] = insertarSegundoCampo.getText();
            numero3[contPregunta - 1] = insertarPrimerCampo.getText();
        }
        if (opcion2) {
            numero1[contPregunta - 1] = v2.generarIgualdad33();
            numero2[contPregunta - 1] = insertarSegundoCampo.getText();
            numero3[contPregunta - 1] = insertarPrimerCampo.getText();
        }
        if (opcion1) {
            if (contPregunta == 16) {
                for (int i = 0; i <= 16; i++) {
                    System.out.println(numero1[i] + "  " + numero2[i + 1]);
                    try {
                        if (numero1[i].equalsIgnoreCase(numero2[i + 1])) {
                            respuestaCorrecta++;
                        }
                    } catch (java.lang.NullPointerException ex) {
                        System.err.println(ex);
                    }
                }
                insertarPrimerCampo.setText("");
                insertarSegundoCampo.setText("");
            }
        }

        if (opcion2) {
            if (contPregunta == 16) {
                for (int i = 0; i <= 16; i++) {
                    System.out.println(numero1[i] + "  " + numero2[i + 1]);
                    try {
                        if (numero1[i].equalsIgnoreCase(numero2[i + 1])) {
                            respuestaCorrecta++;
                        }
                    } catch (java.lang.NullPointerException ex) {
                        System.err.println(ex);
                    }
                }
                insertarPrimerCampo.setText("");
                insertarSegundoCampo.setText("");
            }
        }
        //Si el numero de preguntas es mayor o igual a 15 cambie el boton 
        if (contPregunta >= 15) {
            numPreguntas.setText("15 / 15");
            botonSiguiente.setText("Finalizar");

            if (contPregunta > 15) {
                darResultados();
            }
        }
        System.out.println(insertarSegundoCampo.getText());
        insertarSegundoCampo.setText("");
    }

    private void darResultados() {
        botonSiguiente.setVisible(false);
        String reconocimiento = null;
        
        switch (respuestaCorrecta) {
            case 0:
                reconocimiento = "Oh no, has sacado todo mal:(. ";
                break;
            case 1:
                reconocimiento = "Oh no, solo has sacado una respuesta correcta. ";
                break;
            case 2:
                reconocimiento = "Oh no, solo has sacado dos respuestas correctas. ";
                break;
            case 3:
                reconocimiento = "Oh no, solo has sacado tres respuestas correctas. ";
                break;
            case 4:
                reconocimiento = "Oh no, solo has sacado cuatro respuestas correctas ";
                break;
            case 5:
                reconocimiento = "Oh no, solo has sacado cinco respuestas correctas. ";
                break;
            case 6:
                reconocimiento = "Oh no, solo has sacado seis respuestas correctas. ";
                break;
            case 7:
                reconocimiento = "Oh no, solo has sacado siete respuestas correctas. ";
                break;
            case 8:
                reconocimiento = "Oh no, solo has sacado ocho respuestas correctas. ";
                break;
            case 9:
                reconocimiento = "Estás mejorando, has sacado nueve respuestas correctas. ";
                break;
            case 10:
                reconocimiento = "Eres bueno, pero puedes hacerlo mejor,\n has sacado diez respuestas correctas. ";
                break;
            case 11:
                reconocimiento = "Excelente, has sacado once respuestas correctas. ";
                break;
            case 12:
                reconocimiento = "Magnifíco, has sacado doce respuestas correctas. ";
                break;
            case 13:
                reconocimiento = "Eres impresionante, has sacado trece respuestas correctas. ";
                break;
            case 14:
                reconocimiento = "Eres increíble, has sacado catorce respuestas correctas. ";
                break;
            case 15:
                reconocimiento = "Felicitaciones!!, has sacado todas las respuestas correctas. ";
                break;
        }
        JOptionPane.showMessageDialog(null, reconocimiento + "\nPuedes verificar tus respuestas en el boton 'Ver mis resultados'.");
        botonVerResultados.setVisible(true);
        botonVolverAJugar.setVisible(true);
    }

    private void agregarInformacionALosCampos() {
        //Si es seleccionado FRANCES
        if (opcion1 == true) {
            if (contPregunta <= 15) { //SIEMPRE Y CUANDO EL NUMERO NO SUPERE 15
                insertarPrimerCampo.setText(v2.generarRandom3()); //FRANCES
            }
        }
        //Si es seleccionado ESPAÑOL
        if (opcion2 == true) {
            if (contPregunta <= 15) { //SIEMPRE Y CUANDO EL NUMERO NO SUPERE 15
                insertarPrimerCampo.setText(v2.generarRandom33()); //ESPAÑOL 
            }
        }
        contPregunta++; //EMPEZABA EN 0 Y SE CONVIERTE EN UNO
        numPreguntas.setText(contPregunta + " / 15"); //SE MUESTRA EL NUMERO DE PREGUNTA
        botonSiguiente.setText("Siguiente"); //Cambiamos a siguiente por si es que es la segunda vez que se presiona
        botonVolverAJugar.setVisible(false);
        botonVerResultados.setVisible(false);
    }

    private void botonVolverAJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverAJugarActionPerformed
        contPregunta = 0;
        respuestaCorrecta = 0;
        botonSiguiente.setEnabled(true);
        botonSiguiente.setText("Start");
        insertarPrimerCampo.setText("");
        insertarSegundoCampo.setText("");
        numPreguntas.setText("  / 15");
        spanishAFrancais.setEnabled(true);
        francaisASpanish.setEnabled(true);
        botonVerResultados.setVisible(false);
        botonVolverAJugar.setVisible(false);
        panelDeJuego.setVisible(false);
        botonIniciar.setBackground(new JButton().getBackground());
        bandera2 = false;
    }//GEN-LAST:event_botonVolverAJugarActionPerformed

    //PARA MOSTRAR EN PANTALLA LAS RESPUESTAS CORRECTAS
    private void botonVerResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerResultadosActionPerformed
        String texto = "";
        String verificar;

        if (opcion1 == true) {
            for (int i = 0; i <= 16; i++) {
                if (i < 15) {
                    verificar = numero1[i].equalsIgnoreCase(numero2[i + 1]) ? "" : "INCORRECTA:   ";
                    texto += verificar + numero3[i] + " - " + numero1[i] + " = " + numero2[i + 1] + "          \n";
                }
            }
            if (respuestaCorrecta == 1) {
                JOptionPane.showMessageDialog(null, "Has sacado " + respuestaCorrecta + " respuesta correcta.\n" + texto);
            } else {
                JOptionPane.showMessageDialog(null, "Has sacado " + respuestaCorrecta + " respuestas correctas.\n" + texto);
            }
        } else if (opcion2 == true) {
            for (int i = 0; i <= 16; i++) {
                if (i < 15) {
                    verificar = numero1[i].equalsIgnoreCase(numero2[i + 1]) ? "" : "INCORRECTA:   ";
                    texto += verificar + numero3[i] + " - " + numero1[i] + " = " + numero2[i + 1] + "\n";
                }
            }
            if (respuestaCorrecta == 1) {
                JOptionPane.showMessageDialog(null, "Has sacado " + respuestaCorrecta + " respuesta correcta.\n" + texto);
            } else {
                JOptionPane.showMessageDialog(null, "Has sacado " + respuestaCorrecta + " respuestas correctas.\n" + texto);
            }
        }
    }//GEN-LAST:event_botonVerResultadosActionPerformed

    private void insertarSegundoCampoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insertarSegundoCampoKeyReleased
        if (evt.getKeyChar() == '\n') {
            this.revalidate();
            this.repaint();
            agregarInformacionALosCampos();
            comprobacionDeRespuestas();
            botonSiguiente.setBackground(new JButton().getBackground());
        }
    }//GEN-LAST:event_insertarSegundoCampoKeyReleased

    private void botonAcentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcentosActionPerformed
        if (!VentanaAcentos.isShowing) {
            vs = new VentanaAcentos(v2, false);
            vs.setLocation(1050, 180);
            vs.setVisible(true); //para que se vea
            bandera = true;
        }
    }//GEN-LAST:event_botonAcentosActionPerformed

    private void insertarSegundoCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insertarSegundoCampoKeyTyped
        if (insertarSegundoCampo.getText().equals("") && Character.isSpaceChar(evt.getKeyChar())) {
            evt.consume();
        }
        if (insertarSegundoCampo.getText().endsWith(" ") && Character.isSpaceChar(evt.getKeyChar())) {
            evt.consume();
        }
        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_insertarSegundoCampoKeyTyped

    private void botonVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverMouseEntered
        botonVolver.setBackground(new Color(180, 150, 255));
    }//GEN-LAST:event_botonVolverMouseEntered

    private void botonVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverMouseExited
        botonVolver.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_botonVolverMouseExited

    private void francaisASpanishMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_francaisASpanishMouseEntered
        francaisASpanish.setBackground(new Color(180, 150, 255));
    }//GEN-LAST:event_francaisASpanishMouseEntered

    private void francaisASpanishMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_francaisASpanishMouseExited
        if (!opcion1) {
            francaisASpanish.setBackground(new JButton().getBackground());
        } else {
            francaisASpanish.setBackground(new Color(167, 151, 255));
        }
    }//GEN-LAST:event_francaisASpanishMouseExited

    private void spanishAFrancaisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spanishAFrancaisMouseEntered
        spanishAFrancais.setBackground(new Color(180, 150, 255));
    }//GEN-LAST:event_spanishAFrancaisMouseEntered

    private void spanishAFrancaisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spanishAFrancaisMouseExited
        if (!opcion2) {
            spanishAFrancais.setBackground(new JButton().getBackground());
        } else {
            spanishAFrancais.setBackground(new Color(167, 151, 255));
        }
    }//GEN-LAST:event_spanishAFrancaisMouseExited

    private void botonIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarMouseEntered
        botonIniciar.setBackground(new Color(180, 150, 255));
    }//GEN-LAST:event_botonIniciarMouseEntered

    private void botonIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarMouseExited
        if (!bandera2) {
            botonIniciar.setBackground(new JButton().getBackground());
        }
    }//GEN-LAST:event_botonIniciarMouseExited

    private void botonIniciarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarMouseReleased
        botonIniciar.setBackground(new Color(167, 151, 255));
    }//GEN-LAST:event_botonIniciarMouseReleased

    private void botonAcentosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAcentosMouseEntered
        botonAcentos.setBackground(new Color(180, 150, 255));
    }//GEN-LAST:event_botonAcentosMouseEntered

    private void botonAcentosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAcentosMouseExited
        if (!bandera) {
            botonAcentos.setBackground(new JButton().getBackground());
        }
    }//GEN-LAST:event_botonAcentosMouseExited

    private void botonAcentosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAcentosMouseReleased
        botonAcentos.setBackground(new Color(167, 151, 255));
    }//GEN-LAST:event_botonAcentosMouseReleased

    private void botonVolverAJugarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverAJugarMouseEntered
        botonVolverAJugar.setBackground(new Color(180, 150, 255));
    }//GEN-LAST:event_botonVolverAJugarMouseEntered

    private void botonVolverAJugarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverAJugarMouseExited
        botonVolverAJugar.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_botonVolverAJugarMouseExited

    private void botonVolverAJugarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverAJugarMouseReleased
        botonVolverAJugar.setBackground(new Color(167, 151, 255));
    }//GEN-LAST:event_botonVolverAJugarMouseReleased

    private void botonSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguienteMouseEntered
        botonSiguiente.setBackground(new Color(180, 150, 255));
    }//GEN-LAST:event_botonSiguienteMouseEntered

    private void botonSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguienteMouseExited
        botonSiguiente.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_botonSiguienteMouseExited

    private void botonSiguienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguienteMouseReleased
        botonSiguiente.setBackground(new Color(167, 151, 255));
    }//GEN-LAST:event_botonSiguienteMouseReleased

    private void insertarSegundoCampoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insertarSegundoCampoKeyPressed
        if (evt.getKeyChar() == '\n') {
            botonSiguiente.setBackground(new Color(167, 151, 255));
        }
    }//GEN-LAST:event_insertarSegundoCampoKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botonAcentos;
    private javax.swing.JButton botonInfo;
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JButton botonVerResultados;
    private javax.swing.JButton botonVolver;
    private javax.swing.JButton botonVolverAJugar;
    private javax.swing.JLabel etiquetaInstrucciones;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JButton francaisASpanish;
    private javax.swing.JLabel imagenTraduccion;
    public javax.swing.JTextField insertarPrimerCampo;
    private javax.swing.JTextField insertarSegundoCampo;
    private javax.swing.JMenuItem itemAcentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel numPreguntas;
    private javax.swing.JPanel panelDeJuego;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JButton spanishAFrancais;
    private javax.swing.JLabel traduccion1;
    private javax.swing.JLabel traduccion2;
    // End of variables declaration//GEN-END:variables
}
