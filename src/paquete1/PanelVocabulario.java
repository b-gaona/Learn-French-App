package paquete1;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class PanelVocabulario extends javax.swing.JPanel {

    private boolean opcionAnimal = false, opcionLugar = false, opcionTrabajo = false, opcionComida = false;
    public static boolean bandera = false;
    private int contPregunta = 0;
    public int respuestaCorrecta = 0;
    public static Ventana v2 = new Ventana();
    public static VentanaAcentos vs;
    public String[] numero1 = new String[100];
    public String[] numero2 = new String[100];
    public boolean bandera2 = false;

    public PanelVocabulario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonGrupo = new javax.swing.ButtonGroup();
        botonVolver = new javax.swing.JButton();
        etiquetaTitulo = new javax.swing.JLabel();
        botonInfo = new javax.swing.JButton();
        etiquetaInstrucciones = new javax.swing.JLabel();
        botonAnimales = new javax.swing.JButton();
        botonComida = new javax.swing.JButton();
        botonLugares = new javax.swing.JButton();
        botonTrabajo = new javax.swing.JButton();
        botonIniciar = new javax.swing.JButton();
        panelDeJuego = new javax.swing.JPanel();
        etiquetaSeleccion = new javax.swing.JLabel();
        etiquetaImagen = new javax.swing.JLabel();
        numPregunta = new javax.swing.JLabel();
        insertarRespuesta = new javax.swing.JTextField();
        botonSiguiente = new javax.swing.JButton();
        botonVolverAJugar = new javax.swing.JButton();
        botonVerResultados = new javax.swing.JButton();
        botonAcentos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        botonGrupo.add(botonAnimales);
        botonGrupo.add(botonComida);
        botonGrupo.add(botonLugares);
        botonGrupo.add(botonTrabajo);

        setBackground(new java.awt.Color(0, 102, 102));
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
        etiquetaTitulo.setText("Vocabulaire");
        add(etiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

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

        botonAnimales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/animales.png"))); // NOI18N
        botonAnimales.setBorder(null);
        botonAnimales.setBorderPainted(false);
        botonAnimales.setContentAreaFilled(false);
        botonAnimales.setFocusPainted(false);
        botonAnimales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAnimalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAnimalesMouseExited(evt);
            }
        });
        botonAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnimalesActionPerformed(evt);
            }
        });
        add(botonAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 100));

        botonComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comida.png"))); // NOI18N
        botonComida.setBorder(null);
        botonComida.setBorderPainted(false);
        botonComida.setContentAreaFilled(false);
        botonComida.setFocusPainted(false);
        botonComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonComidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonComidaMouseExited(evt);
            }
        });
        botonComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComidaActionPerformed(evt);
            }
        });
        add(botonComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 100, 100));

        botonLugares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lugares.png"))); // NOI18N
        botonLugares.setBorder(null);
        botonLugares.setBorderPainted(false);
        botonLugares.setContentAreaFilled(false);
        botonLugares.setFocusPainted(false);
        botonLugares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonLugaresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonLugaresMouseExited(evt);
            }
        });
        botonLugares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLugaresActionPerformed(evt);
            }
        });
        add(botonLugares, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 100, 100));

        botonTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesion.png"))); // NOI18N
        botonTrabajo.setBorder(null);
        botonTrabajo.setBorderPainted(false);
        botonTrabajo.setContentAreaFilled(false);
        botonTrabajo.setFocusPainted(false);
        botonTrabajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonTrabajoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonTrabajoMouseExited(evt);
            }
        });
        botonTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTrabajoActionPerformed(evt);
            }
        });
        add(botonTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 100, 100));

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
        });
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });
        add(botonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        panelDeJuego.setBackground(new Color(0,0,0,0));
        panelDeJuego.setVisible(false);
        panelDeJuego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaSeleccion.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        etiquetaSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaSeleccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaSeleccion.setText("jLabel1");
        panelDeJuego.add(etiquetaSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 260, -1));
        panelDeJuego.add(etiquetaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 220, 220));

        numPregunta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        numPregunta.setForeground(new java.awt.Color(255, 153, 0));
        numPregunta.setText(" / 10");
        panelDeJuego.add(numPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        insertarRespuesta.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        insertarRespuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                insertarRespuestaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                insertarRespuestaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                insertarRespuestaKeyTyped(evt);
            }
        });
        panelDeJuego.add(insertarRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 180, 40));

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
        panelDeJuego.add(botonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

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
        panelDeJuego.add(botonVolverAJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

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
        panelDeJuego.add(botonVerResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 110, -1));

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
        });
        botonAcentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcentosActionPerformed(evt);
            }
        });
        panelDeJuego.add(botonAcentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        add(panelDeJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 460, 290));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("<html>  Selecciona entre \"Animales\", \"Comida\", \"Lugares\" y \"Trabajos\". Tendrás que escribir en   francés lo que se muestre. Recuerda en los trabajos usar el 'le' y en la comida 'du' , 'de la' y 'des' depende del caso.<html>");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 690, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoFrancia.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        new Ventana().Eliminar();
        if (bandera) {
            vs.dispose();
            bandera = false;
        }
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInfoActionPerformed
        JOptionPane.showMessageDialog(null, " Seleccione un campo y despues relacione las palabras con imagenes.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonInfoActionPerformed

    private void botonAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnimalesActionPerformed
        if (contPregunta == 0) {
            botonAnimales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/animalSombreado.png")));
            botonComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comida.png")));
            botonLugares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lugares.png")));
            botonTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesion.png")));
            opcionComida = false;
            opcionTrabajo = false;
            opcionLugar = false;
            opcionAnimal = true;
        }
    }//GEN-LAST:event_botonAnimalesActionPerformed

    private void botonComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComidaActionPerformed
        if (contPregunta == 0) {
            botonAnimales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/animales.png")));
            botonComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comidaSombreada.png")));
            botonLugares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lugares.png")));
            botonTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesion.png")));
            opcionComida = true;
            opcionTrabajo = false;
            opcionLugar = false;
            opcionAnimal = false;
        }
    }//GEN-LAST:event_botonComidaActionPerformed

    private void botonLugaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLugaresActionPerformed
        if (contPregunta == 0) {
            botonAnimales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/animales.png")));
            botonComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comida.png")));
            botonLugares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lugaresSombreados.png")));
            botonTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesion.png")));
            opcionComida = false;
            opcionTrabajo = false;
            opcionLugar = true;
            opcionAnimal = false;
        }
    }//GEN-LAST:event_botonLugaresActionPerformed

    private void botonTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTrabajoActionPerformed
        if (contPregunta == 0) {
            botonAnimales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/animales.png")));
            botonComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comida.png")));
            botonLugares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lugares.png")));
            botonTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trabajosSombreados.png")));
            opcionComida = false;
            opcionTrabajo = true;
            opcionLugar = false;
            opcionAnimal = false;
        }
    }//GEN-LAST:event_botonTrabajoActionPerformed

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        if ((opcionComida || opcionLugar || opcionAnimal || opcionTrabajo) && contPregunta == 0) {
            this.repaint();
            this.revalidate();
            botonSiguiente.setVisible(true);
            agregarInformacionALosCampos();
            comprobacionRespuestas();
            panelDeJuego.setVisible(true);
            if (opcionComida) {
                etiquetaSeleccion.setText("La nourriture");
            } else if (opcionLugar) {
                etiquetaSeleccion.setText("Les lieux");
            } else if (opcionAnimal) {
                etiquetaSeleccion.setText("Les animaux");
            } else if (opcionTrabajo) {
                etiquetaSeleccion.setText("Les professions");
            }
            bandera2 = true;
        }
    }//GEN-LAST:event_botonIniciarActionPerformed

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
                reconocimiento = "Oh no, solo has sacado cuatro respuestas correctas. ";
                break;
            case 5:
                reconocimiento = "Oh no, solo has sacado cinco respuestas correctas. ";
                break;
            case 6:
                reconocimiento = "Oh no, solo has sacado seis respuestas correctas. ";
                break;
            case 7:
                reconocimiento = "Eres bueno, pero puedes hacerlo mejor, has sacado siete respuestas correctas. ";
                break;
            case 8:
                reconocimiento = "Eres impresionante, has sacado ocho respuestas correctas. ";
                break;
            case 9:
                reconocimiento = "Eres increíble, has sacado nueve respuestas correctas. ";
                break;
            case 10:
                reconocimiento = "Felicitaciones!!, has sacado todas las respuestas correctas. ";
                break;
        }
        JOptionPane.showMessageDialog(null, reconocimiento + "\nPuedes verificar tus respuestas en el boton 'Ver mis resultados'.");

        botonVerResultados.setVisible(true);
        botonVolverAJugar.setVisible(true);
    }

    private void agregarInformacionALosCampos() {
        contPregunta++;
        numPregunta.setText(contPregunta + " / 10");
        botonSiguiente.setText("Siguiente");
        comprobacionRespuestas();

        if (contPregunta >= 10) {
            numPregunta.setText("10 / 10");
            botonSiguiente.setText("Finalizar");
        }
        if (contPregunta > 10) {
            darResultados();
        }

        if (opcionAnimal == true && contPregunta <= 10) {
            agregarImagenesAnimales();
        } else if (opcionLugar == true && contPregunta <= 10) {
            agregarImagenesLugares();
        } else if (opcionComida == true && contPregunta <= 10) {
            agregarImagenesComidas();
        } else if (opcionTrabajo == true && contPregunta <= 10) {
            agregarImagenesTrabajos();
        }
        insertarRespuesta.setText("");
    }

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        this.revalidate();
        this.repaint();
        agregarInformacionALosCampos();
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void comprobacionRespuestas() {
        if (opcionAnimal) {
            numero1[contPregunta - 1] = v2.Animal();
            numero2[contPregunta - 1] = insertarRespuesta.getText();
            if (contPregunta == 11) {
                for (int i = 0; i <= 11; i++) {
                    System.out.println(numero1[i + 1] + "  " + numero2[i + 1]);
                    try {
                        if (numero1[i + 1].equalsIgnoreCase(numero2[i + 1])) {
                            respuestaCorrecta++;
                        }
                    } catch (java.lang.NullPointerException ex) {
                        System.err.println(ex);
                    }
                }
                insertarRespuesta.setText("");
            }
        } else if (opcionLugar) {
            numero1[contPregunta - 1] = v2.Lugar();
            numero2[contPregunta - 1] = insertarRespuesta.getText();
            if (contPregunta == 11) {
                for (int i = 0; i <= 11; i++) {
                    System.out.println(numero1[i + 1] + "  " + numero2[i + 1]);
                    try {
                        if (numero1[i + 1].equalsIgnoreCase(numero2[i + 1])) {
                            respuestaCorrecta++;
                        }
                    } catch (java.lang.NullPointerException ex) {
                        System.err.println(ex);
                    }
                }
                insertarRespuesta.setText("");
            }
        } else if (opcionTrabajo) {
            numero1[contPregunta - 1] = v2.Trabajo();
            numero2[contPregunta - 1] = insertarRespuesta.getText();
            if (contPregunta == 11) {
                for (int i = 0; i <= 11; i++) {
                    System.out.println(numero1[i + 1] + "  " + numero2[i + 1]);
                    try {
                        if (numero1[i + 1].equalsIgnoreCase(numero2[i + 1])) {
                            respuestaCorrecta++;
                        }
                    } catch (java.lang.NullPointerException ex) {
                        System.err.println(ex);
                    }
                }
                insertarRespuesta.setText("");
            }
        } else if (opcionComida) {
            numero1[contPregunta - 1] = v2.Comida();
            numero2[contPregunta - 1] = insertarRespuesta.getText();
            if (contPregunta == 11) {
                for (int i = 0; i <= 11; i++) {
                    System.out.println(numero1[i + 1] + "  " + numero2[i + 1]);
                    try {
                        if (numero1[i + 1].equalsIgnoreCase(numero2[i + 1])) {
                            respuestaCorrecta++;
                        }
                    } catch (java.lang.NullPointerException ex) {
                        System.err.println(ex);
                    }
                }
                insertarRespuesta.setText("");
            }
        }
    }

    private void agregarImagenesAnimales() {
        try {
            etiquetaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/animales/" + v2.randomAnimal() + ".png"))); // NOI18N
            etiquetaImagen.setPreferredSize(new java.awt.Dimension(220, 220));
            add(etiquetaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));
            panelDeJuego.add(etiquetaImagen);
        } catch (IllegalArgumentException ex) {
            System.err.println(ex);
        }
    }

    private void agregarImagenesLugares() {
        try {
            etiquetaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lugares/" + v2.randomLugares() + ".png"))); // NOI18N
            etiquetaImagen.setPreferredSize(new java.awt.Dimension(220, 220));
            add(etiquetaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));
            panelDeJuego.add(etiquetaImagen);
        } catch (IllegalArgumentException ex) {
            System.err.println(ex);
        }
    }

    private void agregarImagenesComidas() {
        try {
            etiquetaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comida/" + v2.randomComidas() + ".png"))); // NOI18N
            etiquetaImagen.setPreferredSize(new java.awt.Dimension(220, 220));
            add(etiquetaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));
            panelDeJuego.add(etiquetaImagen);
        } catch (IllegalArgumentException ex) {
            System.err.println(ex);
        }
    }

    private void agregarImagenesTrabajos() {
        try {
            etiquetaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trabajos/" + v2.randomTrabajos() + ".png"))); // NOI18N
            etiquetaImagen.setPreferredSize(new java.awt.Dimension(220, 220));
            add(etiquetaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));
            panelDeJuego.add(etiquetaImagen);
        } catch (IllegalArgumentException ex) {
            System.err.println(ex);
        }
    }

    private void botonVolverAJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverAJugarActionPerformed
        contPregunta = 0;
        respuestaCorrecta = 0;
        botonSiguiente.setEnabled(true);
        botonSiguiente.setText("Iniciar");
        numPregunta.setText("  / 10");
        panelDeJuego.setVisible(false);
        botonIniciar.setEnabled(true);
        botonVolverAJugar.setVisible(false);
        etiquetaImagen.setIcon(null);
        insertarRespuesta.setText("");
        botonVerResultados.setVisible(false);
        botonIniciar.setBackground(new JButton().getBackground());
        bandera2 = false;
    }//GEN-LAST:event_botonVolverAJugarActionPerformed

    private void insertarRespuestaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insertarRespuestaKeyReleased
        if (evt.getKeyChar() == '\n') {
            this.revalidate();
            this.repaint();
            contPregunta++;
            numPregunta.setText(contPregunta + " / 10");
            botonSiguiente.setText("Siguiente");
            comprobacionRespuestas();
            botonSiguiente.setBackground(new JButton().getBackground());
            if (contPregunta >= 10) {
                numPregunta.setText("10 / 10");
                botonSiguiente.setText("Finalizar");
            }
            if (contPregunta > 10) {
                darResultados();
            }
            if (opcionAnimal == true && contPregunta <= 10) {
                agregarImagenesAnimales();
            } else if (opcionLugar == true && contPregunta <= 10) {
                agregarImagenesLugares();
            } else if (opcionComida == true && contPregunta <= 10) {
                agregarImagenesComidas();
            } else if (opcionTrabajo == true && contPregunta <= 10) {
                agregarImagenesTrabajos();
            }
            insertarRespuesta.setText("");
        }
    }//GEN-LAST:event_insertarRespuestaKeyReleased

    private void botonVerResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerResultadosActionPerformed
        String texto = "";
        String verificar;
        for (int i = 0; i <= 11; i++) {
            if (i < 10) {
                verificar = numero1[i + 1].equalsIgnoreCase(numero2[i + 1]) ? "" : "INCORRECTA:   ";
                texto += verificar + numero1[i + 1] + " = " + numero2[i + 1] + "\n";
            }
        }
        if (respuestaCorrecta == 1) {
            JOptionPane.showMessageDialog(null, "Has sacado " + respuestaCorrecta + " respuesta correcta.\n" + texto);
        } else {
            JOptionPane.showMessageDialog(null, "Has sacado " + respuestaCorrecta + " respuestas correctas.\n" + texto);
        }
    }//GEN-LAST:event_botonVerResultadosActionPerformed

    private void botonAcentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcentosActionPerformed
        if (!VentanaAcentos.isShowing) {
            vs = new VentanaAcentos(v2, false);
            vs.setLocation(1050, 180);
            vs.setVisible(true); //para que se vea
            bandera = true;
        }
    }//GEN-LAST:event_botonAcentosActionPerformed

    private void botonAnimalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnimalesMouseEntered
        if (!opcionAnimal) {
            javax.swing.ImageIcon gifCelebration = new javax.swing.ImageIcon(getClass().getResource("/imagenes/animales.png"));
            botonAnimales.setIcon(new ImageIcon(gifCelebration.getImage().getScaledInstance(botonAnimales.getWidth() - 10, botonAnimales.getHeight() - 10, Image.SCALE_REPLICATE)));
        }
    }//GEN-LAST:event_botonAnimalesMouseEntered

    private void botonAnimalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnimalesMouseExited
        if (!opcionAnimal) {
            javax.swing.ImageIcon gifCelebration = new javax.swing.ImageIcon(getClass().getResource("/imagenes/animales.png"));
            botonAnimales.setIcon(new ImageIcon(gifCelebration.getImage().getScaledInstance(botonAnimales.getWidth(), botonAnimales.getHeight(), Image.SCALE_REPLICATE)));
        }
    }//GEN-LAST:event_botonAnimalesMouseExited

    private void botonLugaresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLugaresMouseEntered
        if (!opcionLugar) {
            javax.swing.ImageIcon gifCelebration = new javax.swing.ImageIcon(getClass().getResource("/imagenes/lugares.png"));
            botonLugares.setIcon(new ImageIcon(gifCelebration.getImage().getScaledInstance(botonLugares.getWidth() - 10, botonLugares.getHeight() - 10, Image.SCALE_REPLICATE)));
        }
    }//GEN-LAST:event_botonLugaresMouseEntered

    private void botonLugaresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLugaresMouseExited
        if (!opcionLugar) {
            javax.swing.ImageIcon gifCelebration = new javax.swing.ImageIcon(getClass().getResource("/imagenes/lugares.png"));
            botonLugares.setIcon(new ImageIcon(gifCelebration.getImage().getScaledInstance(botonLugares.getWidth(), botonLugares.getHeight(), Image.SCALE_REPLICATE)));
        }
    }//GEN-LAST:event_botonLugaresMouseExited

    private void botonComidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComidaMouseEntered
        if (!opcionComida) {
            javax.swing.ImageIcon gifCelebration = new javax.swing.ImageIcon(getClass().getResource("/imagenes/comida.png"));
            botonComida.setIcon(new ImageIcon(gifCelebration.getImage().getScaledInstance(botonComida.getWidth() - 10, botonComida.getHeight() - 10, Image.SCALE_REPLICATE)));
        }
    }//GEN-LAST:event_botonComidaMouseEntered

    private void botonComidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComidaMouseExited
        if (!opcionComida) {
            javax.swing.ImageIcon gifCelebration = new javax.swing.ImageIcon(getClass().getResource("/imagenes/comida.png"));
            botonComida.setIcon(new ImageIcon(gifCelebration.getImage().getScaledInstance(botonComida.getWidth(), botonComida.getHeight(), Image.SCALE_REPLICATE)));
        }
    }//GEN-LAST:event_botonComidaMouseExited

    private void botonTrabajoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTrabajoMouseEntered
        if (!opcionTrabajo) {
            javax.swing.ImageIcon gifCelebration = new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesion.png"));
            botonTrabajo.setIcon(new ImageIcon(gifCelebration.getImage().getScaledInstance(botonTrabajo.getWidth() - 10, botonTrabajo.getHeight() - 10, Image.SCALE_REPLICATE)));
        }
    }//GEN-LAST:event_botonTrabajoMouseEntered

    private void botonTrabajoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTrabajoMouseExited
        if (!opcionTrabajo) {
            javax.swing.ImageIcon gifCelebration = new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesion.png"));
            botonTrabajo.setIcon(new ImageIcon(gifCelebration.getImage().getScaledInstance(botonTrabajo.getWidth(), botonTrabajo.getHeight(), Image.SCALE_REPLICATE)));
        }
    }//GEN-LAST:event_botonTrabajoMouseExited

    private void botonVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverMouseEntered
        botonVolver.setBackground(new Color(180, 150, 255));
    }//GEN-LAST:event_botonVolverMouseEntered

    private void botonVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverMouseExited
        botonVolver.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_botonVolverMouseExited

    private void botonIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarMouseEntered
        botonIniciar.setBackground(new Color(180, 150, 255));
    }//GEN-LAST:event_botonIniciarMouseEntered

    private void botonIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarMouseExited
        if (!bandera2) {
            botonIniciar.setBackground(new JButton().getBackground());
        }
    }//GEN-LAST:event_botonIniciarMouseExited

    private void botonVolverAJugarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverAJugarMouseEntered
        botonVolverAJugar.setBackground(new Color(180, 150, 255));
    }//GEN-LAST:event_botonVolverAJugarMouseEntered

    private void botonVolverAJugarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverAJugarMouseExited
        botonVolverAJugar.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_botonVolverAJugarMouseExited

    private void botonSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguienteMouseEntered
        botonSiguiente.setBackground(new Color(180, 150, 255));
    }//GEN-LAST:event_botonSiguienteMouseEntered

    private void botonSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguienteMouseExited
        botonSiguiente.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_botonSiguienteMouseExited

    private void botonAcentosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAcentosMouseEntered
        botonAcentos.setBackground(new Color(180, 150, 255));
    }//GEN-LAST:event_botonAcentosMouseEntered

    private void botonAcentosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAcentosMouseExited
        if (!bandera) {
            botonAcentos.setBackground(new JButton().getBackground());
        }
    }//GEN-LAST:event_botonAcentosMouseExited

    private void botonVolverAJugarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverAJugarMouseReleased
        botonVolverAJugar.setBackground(new Color(167, 151, 255));
    }//GEN-LAST:event_botonVolverAJugarMouseReleased

    private void botonSiguienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiguienteMouseReleased
        botonSiguiente.setBackground(new Color(167, 151, 255));
    }//GEN-LAST:event_botonSiguienteMouseReleased

    private void insertarRespuestaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insertarRespuestaKeyPressed
        if (evt.getKeyChar() == '\n') {
            botonSiguiente.setBackground(new Color(167, 151, 255));
        }
    }//GEN-LAST:event_insertarRespuestaKeyPressed

    private void insertarRespuestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insertarRespuestaKeyTyped
        if (insertarRespuesta.getText().equals("") && Character.isSpaceChar(evt.getKeyChar())) {
            evt.consume();
        }
        if (insertarRespuesta.getText().endsWith(" ") && Character.isSpaceChar(evt.getKeyChar())) {
            evt.consume();
        }
        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_insertarRespuestaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botonAcentos;
    private javax.swing.JButton botonAnimales;
    private javax.swing.JButton botonComida;
    private javax.swing.ButtonGroup botonGrupo;
    private javax.swing.JButton botonInfo;
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonLugares;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JButton botonTrabajo;
    private javax.swing.JButton botonVerResultados;
    private javax.swing.JButton botonVolver;
    private javax.swing.JButton botonVolverAJugar;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JLabel etiquetaInstrucciones;
    private javax.swing.JLabel etiquetaSeleccion;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JTextField insertarRespuesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel numPregunta;
    private javax.swing.JPanel panelDeJuego;
    // End of variables declaration//GEN-END:variables
}
