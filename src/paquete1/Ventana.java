package paquete1;

import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import java.awt.Desktop;
import java.awt.Image;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Brandon Gaona
 */
public class Ventana extends javax.swing.JFrame {

    String[] francais1 = {"Accepter", "Acheter", "Aimer", "Allumer", "Annoncer", "Arrêter", "Arriver", "Associer", "Attacher", "Avancer",
        "Briller", "Chercher", "Commander", "Commencer", "Comparer", "Compléter", "Conseiller", "Continuer", "Cuisiner", "Demander", "Détester",
        "Deviner", "Dîner", "Discuter", "Donner", "Écouter", "Embrasser", "Fêter", "Garder", "Indiquer", "Inviter", "Jeter", "Jouer", "Marcher",
        "Multiplier", "Oublier", "Parler", "Penser", "Porter", "Posséder", "Préférer", "Présenter", "Proposer", "Quitter", "Refuser", "Regarder",
        "Rentrer", "Répéter", "Réserver", "Rester", "S'énerver", "S'excuser", "S'habiller", "S'informer", "S'amuser", "Se laver", "Se lever",
        "Se maquiller", "Se ressembler", "Se tromper", "Sembler", "S'installer", "Sonner", "Tomber", "Travailler", "Traverser", "Trouver", "Visiter", "Danser", "Dessiner",
        "Manger", "Sauter", "Chanter", "Nettoyer", "Ajouter", "Appeler", "Frapper", "Nager", "Changer", "Fermer"};

    String[] spanish1 = {"Aceptar", "Comprar", "Amar", "Encender", "Anunciar", "Parar", "Llegar", "Asociar", "Adjuntar", "Avanzar",
        "Brillar", "Buscar", "Ordenar", "Comenzar", "Comparar", "Completar", "Aconsejar", "Continuar", "Cocinar", "Preguntar", "Detestar",
        "Adivinar", "Cenar", "Discutir", "Dar", "Escuchar", "Besar", "Celebrar", "Mantener", "Indicar", "Invitar", "Tirar", "Jugar", "Caminar",
        "Multiplicar", "Olvidar", "Hablar", "Pensar", "Llevar", "Poseer", "Preferir", "Presentar", "Proponer", "Dejar", "Rechazar", "Mirar",
        "Regresar", "Repetir", "Reservar", "Quedarse", "Enfadarse", "Disculparse", "Vestirse", "Informarse", "Disfrutar", "Lavarse", "Levantarse",
        "Maquillarse", "Parecerse", "Equivocarse", "Aparecer", "Instalarse", "Tocar", "Caer", "Trabajar", "Cruzar", "Encontrar", "Visitar", "Bailar", "Dibujar",
        "Comer", "Saltar", "Cantar", "Limpiar", "Agregar", "Llamar", "Golpear", "Nadar", "Cambiar", "Cerrar"};

    String[] francais2 = {"Abolir", "Abrutir", "Accomplir", "Agir", "Agrandir", "Applaudir", "Arrondir", "Bâtir", "Choisir", "Convertir", "Définir",
        "Démolir", "Enfouir", "Enfuir", "Établir", "Finir", "Fraîchir", "Grossir", "Guérir", "Haïr", "Impartir", "Mûrir", "Nourrir", "Punir", "Pourrir", "Réagir",
        "Redéfinir", "Réfléchir", "Remplir", "Rétablir", "Réussir", "Rôtir", "Rougir", "Salir", "Subir", "Vernir", "Vieillir", "Vomir", "Divertir", "Maigrir", "Obéir", "Réunir"};

    String[] spanish2 = {"Suprimir", "Aturdir", "Llevar a cabo", "Accionar", "Agrandar", "Aplaudir", "Redondear", "Construir", "Elegir", "Convertir",
        "Definir", "Demoler", "Enterrar", "Escapar", "Establecer", "Terminar", "Refrescar", "Engordar", "Sanar", "Odiar", "Impartir", "Madurar", "Alimentar", "Podrir", "Castigar", "Reaccionar",
        "Redefinir", "Reflexionar", "Llenar", "Reestablecer", "Lograr", "Asar", "Enrojecer", "Ensuciar", "Soportar", "Barnizar", "Envejecer", "Vomitar", "Divertir", "Adelgazar", "Obedecer", "Reunir"};

    String[] francais3 = {"Être", "Avoir", "Aller", "Attendre", "Courir", "Croire", "Devoir", "Dire", "Dormir", "Entendre", "Faire", "Falloir", "Lire", "Mettre", "Ouvrir", "Perdre",
        "Pouvoir", "Prendre", "Rendre", "Répondre", "Rire", "Savoir", "Sentir", "Tenir", "Vivre", "Voir", "Vouloir", "Apprendre", "Asseoir", "Boire", "Comprendre", "Conclure", "Conduire",
        "Connaître", "Bâtir", "Craindre", "Découvrir", "Défendre", "Dépendre", "Descendre", "Détruire", "Joindre", "Mentir", "Mourir", "Offrir", "Partir", "Permettre", "Plaire", "Pleuvoir",
        "Recevoir", "Sortir", "Sourire", "Suivre", "Surprendre", "Traduire", "Valoir", "Vendre", "Écrire"};

    String[] spanish3 = {"Ser o estar", "Tener", "Ir", "Esperar", "Correr", "Creer", "Deber", "Decir", "Dormir", "Oir", "Hacer", "Hacer falta", "Leer", "Poner", "Abrir", "Perder", "Poder",
        "Tomar", "Devolver", "Responder", "Reir", "Saber", "Sentir", "Sujetar", "Vivir", "Ver", "Querer", "Aprender", "Sentar", "Beber", "Entender", "Concluir", "Conducir", "Conocer", "Construir",
        "Temer", "Descubrir", "Defender", "Depender", "Bajar", "Destruir", "Juntar", "Mentir", "Morir", "Ofrecer", "Irse", "Permitir", "Gustar", "Llover", "Recibir", "Salir", "Sonreir", "Seguir",
        "Sorprender", "Traducir", "Valer", "Vender", "Escribir"};

    String[] animales1 = {"abeja", "aragna", "ballena", "caballo", "cerdo", "cocodrilo", "delfin", "elefante", "gallina", "gato", "hormiga", "jirafa", "leon", "mariposa", "mono", "mosca",
        "oso", "oveja", "pajaro", "pato", "perro", "pinguino", "rana", "raton", "serpiente", "tiburon", "tigre", "tortuga", "vaca"};

    String[] animales2 = {"L'abeille", "L'araignée", "La baleine", "Le cheval", "Le cochon", "Le crocodile", "Le dauphin", "L'éléphant", "La poule", "Le chat", "La fourmi", "La girafe", "Le lion", "Le papillon",
        "Le singe", "La mouche", "L'ours", "La brebis", "L'oiseau", "Le canard", "Le chien", "Le pingouin", "Le crapaud", "La souris", "Le serpent", "Le requin", "Le tigre", "La tortue", "La vache"};

    String[] lugares1 = {"aeropuerto", "banco", "biblioteca", "calle", "carcel", "casa", "cine", "escuela", "estacionamiento", "estadio", "fabrica", "farmacia", "gasolinera", "hospital",
        "hotel", "iglesia", "lavanderia", "parque", "puente", "restaurante", "tienda", "zapateria", "zoologico"};

    String[] lugares2 = {"l'aéroport", "la banque", "la bibliothèque", "la rue", "la prison", "la maison", "le cinéma", "l'école", "le parking", "le stade", "l'usine", "la pharmacie", "la station-service", "l'hôpital",
        "l'hôtel", "l'église", "la laverie", "le parc", "le pont", "le restaurant", "la boutique", "le magasin de chaussures", "le zoo"};

    String[] trabajos1 = {"abogado", "astronauta", "bailarin", "bombero", "camarero", "cantante", "carpintero", "chef", "dentista", "doctor", "electricista",
        "escritor", "estudiante", "fotografo", "juez", "maestro", "panadero", "payaso", "piloto", "pintor", "policia", "sacerdote"};

    String[] trabajos2 = {"l'avocat", "l'astronaute", "le danseur", "le pompier", "le serveur", "le chanteur", "le charpentier", "le chef", "le dentiste", "le docteur", "l'électricien",
        "l'écrivain", "l'étudiant", "le photographe", "le juge", "le professeur", "le boulanger", "le clown", "le pilote", "le peintre", "le policier", "le curé"};

    String[] comidas1 = {"zanahoria", "vino", "uvas", "tomate", "te", "sopa", "sandwich", "sandia", "sal", "queso", "pollo", "platano", "pizza", "pigna", "pimienta",
        "pescado", "pastel", "papasFritas", "papa", "pan", "naranja", "mermelada", "manzana", "mantequilla", "limon", "lechuga", "leche", "jugo", "huevo", "harina",
        "hamburguesa", "galleta", "frijoles", "ensalada", "dulce", "chocolate", "chile", "cerveza", "cebolla", "carne", "cacahuate", "azucar", "arroz", "ajo", "agua",
        "aceite"};

    String[] comidas2 = {"des carottes", "du vin", "des raisins", "de la tomate", "du thé", "de la soupe", "du sandwich", "de la pasteque", "du sel", "du fromage", "du poulet", "de la banane", "de la pizza", "de l'ananas", "du poivre",
        "du poisson", "du gâteau", "des frites", "de la pomme de terre", "du pain", "de l'orange", "de la confiture", "de la pomme", "du beurre", "du citron", "de la laitue", "du lait", "du jus", "d'oeuf", "de la farine",
        "d'hamburger", "du cookie", "des haricots", "de la salade", "du bonbon", "du chocolat", "du piment", "de la bière", "de l'oignon", "de la viande", "des arachides", "du sucre", "du riz", "de l'ail", "de l'eau",
        "de l'huile"};

    PanelPrimerGrupo panelPrimerGrupo = new PanelPrimerGrupo();
    PanelSegundoGrupo panelSegundoGrupo = new PanelSegundoGrupo();
    PanelTercerGrupo panelTercerGrupo = new PanelTercerGrupo();
    PanelVocabulario p5 = new PanelVocabulario();

    public boolean bandera = false, bandera1 = false, bandera2 = false, bandera22 = false, bandera3 = false, bandera33 = false;
    public int cont = 0, cont1 = 0, cont2 = 0, cont22 = 0, cont3 = 0, cont33 = 0;
    public int arreglo[] = new int[francais1.length]; //Random1
    public int arreglo1[] = new int[spanish1.length]; //Random11
    public int arreglo2[] = new int[francais2.length]; //Random2
    public int arreglo22[] = new int[spanish2.length]; //Random22
    public int arreglo3[] = new int[francais3.length]; //Random3
    public int arreglo33[] = new int[spanish3.length]; //Random33
    //PARA LAS IMAGENES
    public boolean ban1 = false, ban2 = false, ban3 = false, ban4 = false;
    public int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0;
    public int arregloAnimal[] = new int[animales1.length]; //Arreglo para animal
    public int arregloLugar[] = new int[lugares1.length]; //Arreglo para lugar 
    public int arregloTrabajo[] = new int[trabajos1.length]; //Arreglo para trabajo
    public int arregloComida[] = new int[comidas1.length]; //Arreglo para comida

    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        escogeUno = new javax.swing.JLabel();
        botonSegundo = new javax.swing.JButton();
        botonTercero = new javax.swing.JButton();
        botonVocabulario = new javax.swing.JButton();
        botonPrimero = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        etiquetaFondoPrincipal = new javax.swing.JLabel();
        barraDeMenu = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        menuConjugacion = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Verbos en Francés");
        setUndecorated(true);
        setResizable(false);

        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escogeUno.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 48)); // NOI18N
        escogeUno.setText("Escoge uno: ");
        panelPrincipal.add(escogeUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 63));

        botonSegundo.setBackground(new java.awt.Color(204, 255, 255));
        botonSegundo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        botonSegundo.setText("Verbos del segundo grupo");
        botonSegundo.setFocusPainted(false);
        botonSegundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSegundoActionPerformed(evt);
            }
        });
        panelPrincipal.add(botonSegundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 170, 340, 68));

        botonTercero.setBackground(new java.awt.Color(204, 255, 255));
        botonTercero.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        botonTercero.setText("Verbos del tercer grupo");
        botonTercero.setFocusPainted(false);
        botonTercero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTerceroActionPerformed(evt);
            }
        });
        panelPrincipal.add(botonTercero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 340, 68));

        botonVocabulario.setBackground(new java.awt.Color(204, 255, 255));
        botonVocabulario.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        botonVocabulario.setText("Vocabulario básico");
        botonVocabulario.setFocusPainted(false);
        botonVocabulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVocabularioActionPerformed(evt);
            }
        });
        panelPrincipal.add(botonVocabulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 340, 68));

        botonPrimero.setBackground(new java.awt.Color(204, 255, 255));
        botonPrimero.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        botonPrimero.setText("Verbos del primer grupo");
        botonPrimero.setFocusPainted(false);
        botonPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrimeroActionPerformed(evt);
            }
        });
        panelPrincipal.add(botonPrimero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 340, 68));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("BUGR2021");
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        etiquetaFondoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoParis.jpg"))); // NOI18N
        panelPrincipal.add(etiquetaFondoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 440));

        menu1.setText("Menú");

        menuConjugacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/link.png"))); // NOI18N
        menuConjugacion.setText("Conjugacion de Verbos");
        menuConjugacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConjugacionActionPerformed(evt);
            }
        });
        menu1.add(menuConjugacion);
        menu1.add(jSeparator1);

        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        menuSalir.setText("Salir de la aplicación");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menu1.add(menuSalir);

        barraDeMenu.add(menu1);

        setJMenuBar(barraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void Icono() {
        Image icon = new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage();
        setIconImage(icon);
    }

    public String generarRandom1() { //FRANCES A ESPAÑOL
        if (bandera == false) {
            int i = 0;
            arreglo[i] = (int) (Math.random() * (francais1.length - 0) + 0);
            for (i = 1; i < francais1.length; i++) {
                arreglo[i] = (int) (Math.random() * (francais1.length - 0) + 0);
                for (int j = 0; j < i; j++) {
                    if (arreglo[i] == arreglo[j]) {
                        i--;
                    }
                }
            }
            bandera = true;
        }
        cont++;
        if (cont == francais1.length) {
            bandera = false;
            cont = 0;
        } //PARA QUE NO DE ERROR DE ARREGLO
        return francais1[arreglo[cont]];
    }

    public String generarIgualdad1() { //SU ESPAÑOL
        return spanish1[arreglo[cont]];
    }

    public String generarRandom11() { //ESPAÑOL A FRANCES
        if (bandera1 == false) {
            int i = 0;
            arreglo1[i] = (int) (Math.random() * (spanish1.length - 0) + 0);
            for (i = 1; i < spanish1.length; i++) {
                arreglo1[i] = (int) (Math.random() * (spanish1.length - 0) + 0);
                for (int j = 0; j < i; j++) {
                    if (arreglo1[i] == arreglo1[j]) {
                        i--;
                    }
                }
            }
            bandera1 = true;
        }
        cont1++;
        if (cont1 == spanish1.length) {
            bandera1 = false;
            cont1 = 0;
        } //PARA QUE NO DE ERROR DE ARREGLO
        return spanish1[arreglo1[cont1]];
    }

    public String generarIgualdad11() { //SU FRANCES
        return francais1[arreglo1[cont1]];
    }

    public String generarRandom2() { //FRANCES A ESPAÑOL
        if (bandera2 == false) {
            int i = 0;
            arreglo2[i] = (int) (Math.random() * (francais2.length - 0) + 0);
            for (i = 1; i < francais2.length; i++) {
                arreglo2[i] = (int) (Math.random() * (francais2.length - 0) + 0);
                for (int j = 0; j < i; j++) {
                    if (arreglo2[i] == arreglo2[j]) {
                        i--;
                    }
                }
            }
            bandera2 = true;
        }
        cont2++;
        if (cont2 == francais2.length) {
            bandera2 = false;
            cont2 = 0;
        } //PARA QUE NO DE ERROR DE ARREGLO
        return francais2[arreglo2[cont2]];
    }

    public String generarIgualdad2() { //SU ESPAÑOL
        return spanish2[arreglo2[cont2]];
    }

    public String generarRandom22() { //ESPAÑOL A FRANCES
        if (bandera22 == false) {
            int i = 0;
            arreglo22[i] = (int) (Math.random() * (spanish2.length - 0) + 0);
            for (i = 1; i < spanish2.length; i++) {
                arreglo22[i] = (int) (Math.random() * (spanish2.length - 0) + 0);
                for (int j = 0; j < i; j++) {
                    if (arreglo22[i] == arreglo22[j]) {
                        i--;
                    }
                }
            }
            bandera22 = true;
        }
        cont22++;
        if (cont22 == spanish2.length) {
            bandera22 = false;
            cont22 = 0;
        } //PARA QUE NO DE ERROR DE ARREGLO
        return spanish2[arreglo22[cont22]];
    }

    public String generarIgualdad22() { //SU FRANCES
        return francais2[arreglo22[cont22]];
    }

    public String generarRandom3() { //FRANCES A ESPAÑOL
        if (bandera3 == false) {
            int i = 0;
            arreglo3[i] = (int) (Math.random() * (francais3.length - 0) + 0);
            for (i = 1; i < francais3.length; i++) {
                arreglo3[i] = (int) (Math.random() * (francais3.length - 0) + 0);
                for (int j = 0; j < i; j++) {
                    if (arreglo3[i] == arreglo3[j]) {
                        i--;
                    }
                }
            }
            bandera3 = true;
        }
        cont3++;
        if (cont3 == francais3.length) {
            bandera3 = false;
            cont3 = 0;
        } //PARA QUE NO DE ERROR DE ARREGLO
        return francais3[arreglo3[cont3]];
    }

    public String generarIgualdad3() { //SU ESPAÑOL
        return spanish3[arreglo3[cont3]];
    }

    public String generarRandom33() { //ESPAÑOL A FRANCES
        if (bandera33 == false) {
            int i = 0;
            arreglo33[i] = (int) (Math.random() * (spanish3.length - 0) + 0);
            for (i = 1; i < spanish3.length; i++) {
                arreglo33[i] = (int) (Math.random() * (spanish3.length - 0) + 0);
                for (int j = 0; j < i; j++) {
                    if (arreglo33[i] == arreglo33[j]) {
                        i--;
                    }
                }
            }
            bandera33 = true;
        }
        cont33++;
        if (cont33 == spanish3.length) {
            bandera33 = false;
            cont33 = 0;
        } //PARA QUE NO DE ERROR DE ARREGLO
        return spanish3[arreglo33[cont33]];
    }

    public String generarIgualdad33() { //SU FRANCES
        return francais3[arreglo33[cont33]];
    }

    public String randomAnimal() {
        if (ban1 == false) {
            int i = 0;
            arregloAnimal[i] = (int) (Math.random() * (animales1.length - 0) + 0);
            for (i = 1; i < animales1.length; i++) {
                arregloAnimal[i] = (int) (Math.random() * (animales1.length - 0) + 0);
                for (int j = 0; j < i; j++) {
                    if (arregloAnimal[i] == arregloAnimal[j]) {
                        i--;
                    }
                }
            }
            ban1 = true;
        }
        contador1++;
        if (contador1 == animales1.length) {
            ban1 = false;
            contador1 = 0;
        } //PARA QUE NO DE ERROR DE ARREGLO
        return animales1[arregloAnimal[contador1]];
    }

    public String Animal() {
        return animales2[arregloAnimal[contador1]];
    }

    public String randomLugares() {
        if (ban2 == false) {
            int i = 0;
            arregloLugar[i] = (int) (Math.random() * (lugares1.length - 0) + 0);
            for (i = 1; i < lugares1.length; i++) {
                arregloLugar[i] = (int) (Math.random() * (lugares1.length - 0) + 0);
                for (int j = 0; j < i; j++) {
                    if (arregloLugar[i] == arregloLugar[j]) {
                        i--;
                    }
                }
            }
            ban2 = true;
        }
        contador2++;
        if (contador2 == lugares1.length) {
            ban2 = false;
            contador2 = 0;
        } //PARA QUE NO DE ERROR DE ARREGLO
        return lugares1[arregloLugar[contador2]];
    }

    public String Lugar() {
        return lugares2[arregloLugar[contador2]];
    }

    public String randomTrabajos() {
        if (ban3 == false) {
            int i = 0;
            arregloTrabajo[i] = (int) (Math.random() * (trabajos1.length - 0) + 0);
            for (i = 1; i < trabajos1.length; i++) {
                arregloTrabajo[i] = (int) (Math.random() * (trabajos1.length - 0) + 0);
                for (int j = 0; j < i; j++) {
                    if (arregloTrabajo[i] == arregloTrabajo[j]) {
                        i--;
                    }
                }
            }
            ban3 = true;
        }
        contador3++;
        if (contador3 == trabajos1.length) {
            ban3 = false;
            contador3 = 0;
        } //PARA QUE NO DE ERROR DE ARREGLO
        return trabajos1[arregloTrabajo[contador3]];
    }

    public String Trabajo() {
        return trabajos2[arregloTrabajo[contador3]];
    }

    public String randomComidas() {
        if (ban4 == false) {
            int i = 0;
            arregloComida[i] = (int) (Math.random() * (comidas1.length - 0) + 0);
            for (i = 1; i < comidas1.length; i++) {
                arregloComida[i] = (int) (Math.random() * (comidas1.length - 0) + 0);
                for (int j = 0; j < i; j++) {
                    if (arregloComida[i] == arregloComida[j]) {
                        i--;
                    }
                }
            }
            ban4 = true;
        }
        contador4++;
        if (contador4 == comidas1.length) {
            ban4 = false;
            contador4 = 0;
        } //PARA QUE NO DE ERROR DE ARREGLO
        return comidas1[arregloComida[contador4]];
    }

    public String Comida() {
        return comidas2[arregloComida[contador4]];
    }

    private void botonPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrimeroActionPerformed
        panelPrimerGrupo.setSize(720, 440);
        panelPrincipal.removeAll();
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        v1.setContentPane(panelPrimerGrupo);
        v1.revalidate();
    }//GEN-LAST:event_botonPrimeroActionPerformed

    private void botonVocabularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVocabularioActionPerformed
        p5.setSize(720, 440);
        panelPrincipal.removeAll();
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        v1.setContentPane(p5);
        v1.revalidate();
    }//GEN-LAST:event_botonVocabularioActionPerformed

    //Instrucciones de como agregas un panel y quitas uno ya existente
    private void botonTerceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTerceroActionPerformed
        //Codigo para abrir un panel y eliminar el otro
        panelTercerGrupo.setSize(720, 440); //Le das el tamaño al panel
        panelPrincipal.removeAll(); //Le quitas todo al panel que tenias anteriormente
        panelPrincipal.revalidate(); //Revalidas para que cargue todo
        panelPrincipal.repaint(); //Llamas al metodo grafico
        v1.setContentPane(panelTercerGrupo); //Le agregas el panel que deseas
        v1.revalidate();
    }//GEN-LAST:event_botonTerceroActionPerformed

    private void botonSegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSegundoActionPerformed
        panelSegundoGrupo.setSize(720, 440);
        panelPrincipal.removeAll();
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        v1.setContentPane(panelSegundoGrupo);
        v1.revalidate();
    }//GEN-LAST:event_botonSegundoActionPerformed

    private void menuConjugacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConjugacionActionPerformed
        Desktop enlace = Desktop.getDesktop();
        try {
            enlace.browse(new URI("https://www.conjugacion.es/frances/"));
        } catch (IOException | URISyntaxException e) {
            e.getMessage();
        }
    }//GEN-LAST:event_menuConjugacionActionPerformed

    public void Eliminar() {
        this.panelPrincipal.revalidate();
        this.panelPrincipal.repaint();
        v1.setContentPane(panelPrincipal);
        v1.revalidate();
    }

    private void lookAndFeel() {
        Properties props = new Properties();
        props.put("logoString", " Menú");
        GraphiteLookAndFeel.setCurrentTheme(props);
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            v1.lookAndFeel();
            v1 = new Ventana();
            v1.Icono();
            v1.setVisible(true);
        });
    }

    public static Ventana v1 = new Ventana();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraDeMenu;
    private javax.swing.JButton botonPrimero;
    private javax.swing.JButton botonSegundo;
    private javax.swing.JButton botonTercero;
    private javax.swing.JButton botonVocabulario;
    private javax.swing.JLabel escogeUno;
    private javax.swing.JLabel etiquetaFondoPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenuItem menuConjugacion;
    private javax.swing.JMenuItem menuSalir;
    public javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
