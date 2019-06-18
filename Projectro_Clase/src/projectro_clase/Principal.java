package projectro_clase;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import Organigrama.*;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import javax.print.*;
import javax.swing.filechooser.*;
import Chat.*;

public class Principal extends javax.swing.JFrame {

    private ArrayList<JPanel> organigrama = new ArrayList();
    private int contadorInicio = 0;
    private int contadorFin = 0;
    private Color color;
    private String nombreFlujo;
    private String nombreClase;
    private String copia = null;
    private File archivo = null;

    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);

    }

    public ArrayList<JPanel> getOrganigrma() {
        return organigrama;
    }

    public Color getColor() {
        return color;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Login = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bt_Login = new javax.swing.JButton();
        rb_Login_Administrador = new javax.swing.JRadioButton();
        rb_Login_Analista = new javax.swing.JRadioButton();
        rb_Login_Jefe = new javax.swing.JRadioButton();
        rb_Login_Gerente = new javax.swing.JRadioButton();
        tf_Usuario = new javax.swing.JTextField();
        pf_Contraseña = new javax.swing.JPasswordField();
        rb_Login_Recursos_Humanos = new javax.swing.JRadioButton();
        bg_Opciones_Login = new javax.swing.ButtonGroup();
        jd_Crear_Gerente = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bt_Agregar_Gerente = new javax.swing.JButton();
        tf_Agregar_Gerente = new javax.swing.JTextField();
        pf_Agregar_Gerente = new javax.swing.JPasswordField();
        tf_Correo_Gerente = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jd_Crear_Jefe = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bt_Agregar_Jefe = new javax.swing.JButton();
        tf_Agregar_Jefe = new javax.swing.JTextField();
        pf_Agregar_Jefe = new javax.swing.JPasswordField();
        jLabel57 = new javax.swing.JLabel();
        tf_Correo_Jefe = new javax.swing.JTextField();
        jd_Crear_Analista = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bt_Agregar_Analista = new javax.swing.JButton();
        tf_Agregar_Analista = new javax.swing.JTextField();
        pf_Agregar_Analista = new javax.swing.JPasswordField();
        jLabel58 = new javax.swing.JLabel();
        tf_Correo_Analista = new javax.swing.JTextField();
        jd_Crear_Recursos_Humanos = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        bt_Agregar_Recursos_Humanos = new javax.swing.JButton();
        tf_Agregar_Recursos_Humanos = new javax.swing.JTextField();
        pf_Agregar_Recursos_Humanos = new javax.swing.JPasswordField();
        jLabel59 = new javax.swing.JLabel();
        tf_Correo_Recursos_Humanos = new javax.swing.JTextField();
        jd_Crear_Departamentos = new javax.swing.JDialog();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        bt_Crear_Departamento = new javax.swing.JButton();
        tf_Nombre_Departamento = new javax.swing.JTextField();
        jScrollPane30 = new javax.swing.JScrollPane();
        jl_Recursos_Humanos = new javax.swing.JList<>();
        jLabel62 = new javax.swing.JLabel();
        jd_Listar_Gerentes = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        jl_Amigos = new javax.swing.JLabel();
        cb_Gerentes = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_Gerentes = new javax.swing.JTable();
        bt_Volver_Gerentes = new javax.swing.JButton();
        bt_Limpiar_Listar_Gerentes = new javax.swing.JButton();
        bt_Eliminar_Listar_Gerenter = new javax.swing.JButton();
        jd_Listar_Jefes = new javax.swing.JDialog();
        jLabel17 = new javax.swing.JLabel();
        jl_Amigos1 = new javax.swing.JLabel();
        cb_Jefes = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_Jefes = new javax.swing.JTable();
        bt_Volver_Jefes = new javax.swing.JButton();
        bt_Limpiar_Listar_Jefes = new javax.swing.JButton();
        bt_Eliminar_Listar_Jefes = new javax.swing.JButton();
        jd_Listar_Analistas = new javax.swing.JDialog();
        jl_Amigos2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cb_Analistas = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_Analistas = new javax.swing.JTable();
        bt_Volver_Analistas = new javax.swing.JButton();
        bt_Limpiar_Listar_Analistas = new javax.swing.JButton();
        bt_Eliminar_Listar_Analistas = new javax.swing.JButton();
        jd_Listar_Recursos_Humanos = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla_Recursos_Humanos = new javax.swing.JTable();
        jl_Amigos3 = new javax.swing.JLabel();
        cb_Recursos_Humanos = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        bt_Volver_Recusos_Humanos = new javax.swing.JButton();
        bt_Limpiar_Listar_Admins = new javax.swing.JButton();
        bt_Eliminar_Listar_Recursos_Humanos = new javax.swing.JButton();
        jd_Listar_Departamentos = new javax.swing.JDialog();
        jScrollPane27 = new javax.swing.JScrollPane();
        jl_Departamentos = new javax.swing.JList<>();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        bt_Volver_Departamentos = new javax.swing.JButton();
        bt_Eliminar_Departamento = new javax.swing.JButton();
        bt_Agregar_Area_Departamento = new javax.swing.JButton();
        bt_Agregar_Area = new javax.swing.JButton();
        jd_Administracion_Compañia = new javax.swing.JDialog();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        tf_Nombre_Compañia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Mision_Compañia = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        ta_Vision_Compañia = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        ta_Objetivos_Compañia = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        ta_Politicas_Compañia = new javax.swing.JTextArea();
        jScrollPane17 = new javax.swing.JScrollPane();
        ta_Telefonos_Compañia = new javax.swing.JTextArea();
        tf_Correo_Electronico_Compañia = new javax.swing.JTextField();
        bt_Modificar_Info_Compañia = new javax.swing.JButton();
        bt_Actualizar_Info_Compañia = new javax.swing.JButton();
        bt_Obtener_Info_Compañia = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        ta_Direccion_Exacta_Compañia = new javax.swing.JTextArea();
        jLabel37 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        tf_nombre_Director = new javax.swing.JTextField();
        jd_Modificar_Gerentes = new javax.swing.JDialog();
        jl_Amigos4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cb_Gerentes1 = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabla_Gerentes1 = new javax.swing.JTable();
        bt_Modificar_Gerentes = new javax.swing.JButton();
        bt_Modificar_Eliminar_Gerentes_tabla = new javax.swing.JButton();
        bt_Modificar_Limpiar_Gerentes_tabla = new javax.swing.JButton();
        bt_Modificar_Volver_Gerentes_tabla = new javax.swing.JButton();
        jd_Modificar_Jefes = new javax.swing.JDialog();
        bt_Modificar_Jefes = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabla_Jefes1 = new javax.swing.JTable();
        jl_Amigos5 = new javax.swing.JLabel();
        cb_Jefes1 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        bt_Modificar_Eliminar_Jefes_tabla = new javax.swing.JButton();
        bt_Modificar_Limpiar_Jefes_tabla = new javax.swing.JButton();
        bt_Modificar_Volver_Jefes_tabla = new javax.swing.JButton();
        jd_Modificar_Analistas = new javax.swing.JDialog();
        bt_Modificar_Analista = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabla_Analistas1 = new javax.swing.JTable();
        jl_Amigos6 = new javax.swing.JLabel();
        cb_Analistas1 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        bt_Modificar_Eliminar_Analista_tabla = new javax.swing.JButton();
        bt_Modificar_Limpiar_Analistas_tabla = new javax.swing.JButton();
        bt_Modificar_Volver_Analistas_tabla = new javax.swing.JButton();
        jd_Modificar_Recursos_Humanos = new javax.swing.JDialog();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabla_Recursos_Humanos1 = new javax.swing.JTable();
        bt_Modificar_Recursos_Humanos = new javax.swing.JButton();
        jl_Amigos7 = new javax.swing.JLabel();
        cb_Recursos_Humanos1 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        bt_Modificar_Eliminar_Recusos_Humanos_tabla = new javax.swing.JButton();
        bt_Modificar_Limpiar_Recursos_Humanos_tabla = new javax.swing.JButton();
        bt_Modificar_Volver_Recusros_Humanos_tabla = new javax.swing.JButton();
        jd_Eliminar_Gerentes = new javax.swing.JDialog();
        jl_Amigos8 = new javax.swing.JLabel();
        cb_Gerentes2 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tabla_Gerentes2 = new javax.swing.JTable();
        bt_Eliminar_Gerentes = new javax.swing.JButton();
        bt_Limpiar_Eliminar_Gerentes = new javax.swing.JButton();
        bt_Eliminar_Volver_Gerentes = new javax.swing.JButton();
        jd_Eliminar_Jefes = new javax.swing.JDialog();
        bt_Eliminar_Jefes = new javax.swing.JButton();
        bt_Limpiar_Eliminar_Jefes = new javax.swing.JButton();
        bt_Eliminar_Volver_Jefes = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        tabla_Jefes2 = new javax.swing.JTable();
        jl_Amigos9 = new javax.swing.JLabel();
        cb_Jefes2 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jd_Eliminar_Analistas = new javax.swing.JDialog();
        jScrollPane12 = new javax.swing.JScrollPane();
        tabla_Analistas2 = new javax.swing.JTable();
        bt_Eliminar_Analistas = new javax.swing.JButton();
        bt_Limpiar_Eliminar_Analistas = new javax.swing.JButton();
        bt_Eliminar_Volver_Analistas = new javax.swing.JButton();
        jl_Amigos10 = new javax.swing.JLabel();
        cb_Analistas2 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jd_Eliminar_Recursos_Humanos = new javax.swing.JDialog();
        bt_Eliminar_Recursos_Humanos = new javax.swing.JButton();
        bt_Limpiar_Eliminar_Admins = new javax.swing.JButton();
        bt_Eliminar_Volver_Admins = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        tabla_Recursos_Humanos2 = new javax.swing.JTable();
        jl_Amigos11 = new javax.swing.JLabel();
        cb_Recursos_Humanos2 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jd_Solicitar_Vacaciones_Analistas = new javax.swing.JDialog();
        bt_Solicitar_Vacaiones = new javax.swing.JButton();
        jScrollPane20 = new javax.swing.JScrollPane();
        ta_Solicitud_Vacaciones = new javax.swing.JTextArea();
        jLabel41 = new javax.swing.JLabel();
        jd_Solicitud_Permisos_Analistas = new javax.swing.JDialog();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        ta_Solicitud_Permisos = new javax.swing.JTextArea();
        bt_Solicitar_Permisos = new javax.swing.JButton();
        jd_Solicitud_Insistencias_Analistas = new javax.swing.JDialog();
        bt_Solicitar_Insistencia = new javax.swing.JButton();
        jScrollPane24 = new javax.swing.JScrollPane();
        ta_Solicitud_Insistencias = new javax.swing.JTextArea();
        jLabel49 = new javax.swing.JLabel();
        jd_Solicitudes_Vacaciones_Jefes = new javax.swing.JDialog();
        bt_Solicitar_Vacaciones_Jefes = new javax.swing.JButton();
        jScrollPane31 = new javax.swing.JScrollPane();
        ta_Solicitud_Vacaciones_Jefes = new javax.swing.JTextArea();
        jLabel67 = new javax.swing.JLabel();
        jd_Solicitudes_Permisos_Jefes = new javax.swing.JDialog();
        bt_Solicitar_Permisos_Jefes = new javax.swing.JButton();
        jScrollPane32 = new javax.swing.JScrollPane();
        ta_Solicitud_Permisos_Jefes = new javax.swing.JTextArea();
        jLabel68 = new javax.swing.JLabel();
        jd_Solicitudes_Insistencias_Jefes = new javax.swing.JDialog();
        bt_Solicitar_Insistencias_Jefes = new javax.swing.JButton();
        jScrollPane33 = new javax.swing.JScrollPane();
        ta_Solicitud_Insistencias_Jefes = new javax.swing.JTextArea();
        jLabel69 = new javax.swing.JLabel();
        jd_Solicitudes_Vacaciones_Gerentes = new javax.swing.JDialog();
        bt_Solicitar_Vacaciones_Gerentes = new javax.swing.JButton();
        jScrollPane34 = new javax.swing.JScrollPane();
        ta_Solicitud_Vacaciones_Gerentes = new javax.swing.JTextArea();
        jLabel70 = new javax.swing.JLabel();
        jd_Solicitudes_Permisos_Gerentes = new javax.swing.JDialog();
        bt_Solicitar_Permisos_Gerentes = new javax.swing.JButton();
        jScrollPane35 = new javax.swing.JScrollPane();
        ta_Solicitud_Permisos_Gerentes = new javax.swing.JTextArea();
        jLabel71 = new javax.swing.JLabel();
        jd_Solicitudes_Insistencias_Gerentes = new javax.swing.JDialog();
        bt_Solicitar_Insistencias_Gerentes = new javax.swing.JButton();
        jScrollPane36 = new javax.swing.JScrollPane();
        ta_Solicitud_Insistencias_Gerentes = new javax.swing.JTextArea();
        jLabel72 = new javax.swing.JLabel();
        jd_Administrar_Bitacora = new javax.swing.JDialog();
        jLabel40 = new javax.swing.JLabel();
        bt_Bitacora = new javax.swing.JButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        ta_Bitacora = new javax.swing.JTextArea();
        jd_Contratacion = new javax.swing.JDialog();
        bt_Contrato = new javax.swing.JButton();
        jScrollPane21 = new javax.swing.JScrollPane();
        jl_Departamentos1 = new javax.swing.JList<>();
        jScrollPane23 = new javax.swing.JScrollPane();
        jl_Jefes = new javax.swing.JList<>();
        jScrollPane25 = new javax.swing.JScrollPane();
        jl_Analistas = new javax.swing.JList<>();
        jScrollPane26 = new javax.swing.JScrollPane();
        jl_Areas = new javax.swing.JList<>();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        jl_Gerente = new javax.swing.JList<>();
        jLabel50 = new javax.swing.JLabel();
        bt_Reclutado = new javax.swing.JButton();
        jd_Organigrama = new javax.swing.JDialog();
        jp_Opciones = new javax.swing.JPanel();
        bt_Inicio = new javax.swing.JButton();
        bt_Proceso = new javax.swing.JButton();
        bt_Fin = new javax.swing.JButton();
        bt_Cargo = new javax.swing.JButton();
        bt_Separadores = new javax.swing.JButton();
        pn_Organigrama = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        bt_Cerrar_Organigrama = new javax.swing.JButton();
        pp_Organigrama = new javax.swing.JPopupMenu();
        jmi_Abrir_Organigrama = new javax.swing.JMenuItem();
        jmi_Guardar_Organigrama = new javax.swing.JMenuItem();
        jmi_GuardarC_DF = new javax.swing.JMenuItem();
        jmi_Eliminar_Organigrama = new javax.swing.JMenuItem();
        jmi_Imprimir_Orgranigama = new javax.swing.JMenuItem();
        jmi_Organigrama_JPG = new javax.swing.JMenuItem();
        jd_Conexcion_Banco = new javax.swing.JDialog();
        jLabel53 = new javax.swing.JLabel();
        cb_Banco = new javax.swing.JComboBox<>();
        bt_Saldo_Banco = new javax.swing.JButton();
        bt_Pagar_Empleados = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        tf_Saldo_Empleado = new javax.swing.JTextField();
        tf_Correo_Empleado = new javax.swing.JTextField();
        tb_Sistema = new javax.swing.JToolBar();
        bt_Login_Sistema = new javax.swing.JButton();
        bt_LogOut = new javax.swing.JButton();
        jmb_Opciones_Sistema = new javax.swing.JMenuBar();
        jm_Sistema = new javax.swing.JMenu();
        jmi_Login = new javax.swing.JMenuItem();
        jmi_LogOut = new javax.swing.JMenuItem();
        jm_Administrador = new javax.swing.JMenu();
        jm_Adminstar_Roles = new javax.swing.JMenu();
        jm_Agregar_Role = new javax.swing.JMenu();
        jmi_Agregar_Gerente = new javax.swing.JMenuItem();
        jmi_Agregar_Jefe = new javax.swing.JMenuItem();
        jmi_Agregar_Analista = new javax.swing.JMenuItem();
        jmi_Agregar_Recusos_Humanos = new javax.swing.JMenuItem();
        jm_Listar_Role = new javax.swing.JMenu();
        jmi_Listar_Gerentes = new javax.swing.JMenuItem();
        jmi_Listar_Jefes = new javax.swing.JMenuItem();
        jmi_Listar_Analistas = new javax.swing.JMenuItem();
        jmi_Listar_Recursos_Humanos = new javax.swing.JMenuItem();
        jm_Modificar_Role = new javax.swing.JMenu();
        jmi_Modificar_Gerentes = new javax.swing.JMenuItem();
        jmi_Modificar_Jefes = new javax.swing.JMenuItem();
        jmi_Modificar_Analistas = new javax.swing.JMenuItem();
        jmi_Modificar_Recursos_Humanos = new javax.swing.JMenuItem();
        jm_Eliminar_Role = new javax.swing.JMenu();
        jmi_Eliminar_Gerente = new javax.swing.JMenuItem();
        jmi_Eliminar_Jefe = new javax.swing.JMenuItem();
        jmi_Eliminar_Analista = new javax.swing.JMenuItem();
        jmi_Eliminar_Recursos_Humanos = new javax.swing.JMenuItem();
        jm_Administracion_Compañia = new javax.swing.JMenu();
        jm_Departamentos = new javax.swing.JMenu();
        jmi_Crear_Departamento = new javax.swing.JMenuItem();
        jmi_Listar_Departamentos = new javax.swing.JMenuItem();
        jmi_Administracion_Informacion = new javax.swing.JMenuItem();
        jmi_Bitacora_Sistema = new javax.swing.JMenuItem();
        jmi_Graficas = new javax.swing.JMenuItem();
        jmi_Buzon_Empresa = new javax.swing.JMenuItem();
        jm_Recusos_Humanos = new javax.swing.JMenu();
        jmi_Contratacion = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmi_Banco = new javax.swing.JMenuItem();
        jm_Analista = new javax.swing.JMenu();
        jm_Marcas_Entradas = new javax.swing.JMenu();
        jmi_Permisos_Analistas = new javax.swing.JMenuItem();
        jmi_Solicitar_Instancia_Analistas = new javax.swing.JMenuItem();
        jmi_Solicitar_Vacaciones_Analistas = new javax.swing.JMenuItem();
        jmi_Chat_Areas = new javax.swing.JMenuItem();
        jmi_Diagrama_Autorizaciones = new javax.swing.JMenuItem();
        jmi_Boleta_Pagos = new javax.swing.JMenuItem();
        jmi_Chat_Analistas = new javax.swing.JMenuItem();
        jm_Gerente = new javax.swing.JMenu();
        jmi_Permisos_Gerentes = new javax.swing.JMenuItem();
        jmi_Solicitar_Instancia_Gerentes = new javax.swing.JMenuItem();
        jmi_Solicitar_Vacaciones_Gerentes = new javax.swing.JMenuItem();
        jm_Jefe = new javax.swing.JMenu();
        jm_Marcas_Entradas1 = new javax.swing.JMenu();
        jmi_Permisos_Jefes = new javax.swing.JMenuItem();
        jmi_Solicitar_Instancia_Jefes = new javax.swing.JMenuItem();
        jmi_Solicitar_Vacaciones_Jefes = new javax.swing.JMenuItem();
        jmi_Organigrama = new javax.swing.JMenuItem();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Login del Sistema");

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        bt_Login.setText("Login");
        bt_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LoginActionPerformed(evt);
            }
        });

        bg_Opciones_Login.add(rb_Login_Administrador);
        rb_Login_Administrador.setSelected(true);
        rb_Login_Administrador.setText("Administrador");

        bg_Opciones_Login.add(rb_Login_Analista);
        rb_Login_Analista.setText("Analista");

        bg_Opciones_Login.add(rb_Login_Jefe);
        rb_Login_Jefe.setText("Jefe");

        bg_Opciones_Login.add(rb_Login_Gerente);
        rb_Login_Gerente.setText("Gerente");

        bg_Opciones_Login.add(rb_Login_Recursos_Humanos);
        rb_Login_Recursos_Humanos.setText("Recursos Humanos");

        javax.swing.GroupLayout jd_LoginLayout = new javax.swing.GroupLayout(jd_Login.getContentPane());
        jd_Login.getContentPane().setLayout(jd_LoginLayout);
        jd_LoginLayout.setHorizontalGroup(
            jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jd_LoginLayout.createSequentialGroup()
                        .addComponent(rb_Login_Administrador)
                        .addGap(18, 18, 18)
                        .addComponent(rb_Login_Analista)
                        .addGap(18, 18, 18)
                        .addComponent(rb_Login_Gerente)
                        .addGap(18, 18, 18)
                        .addComponent(rb_Login_Jefe)
                        .addGap(18, 18, 18)
                        .addComponent(rb_Login_Recursos_Humanos)))
                .addGap(63, 63, 63))
            .addGroup(jd_LoginLayout.createSequentialGroup()
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_LoginLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(bt_Login))
                    .addGroup(jd_LoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jd_LoginLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(pf_Contraseña))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_LoginLayout.setVerticalGroup(
            jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_Login_Administrador)
                    .addComponent(rb_Login_Analista)
                    .addComponent(rb_Login_Gerente)
                    .addComponent(rb_Login_Jefe)
                    .addComponent(rb_Login_Recursos_Humanos))
                .addGap(18, 18, 18)
                .addComponent(bt_Login)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Agregar Gerente");

        jLabel5.setText("Usuario");

        jLabel6.setText("Contraseña");

        bt_Agregar_Gerente.setText("Agregar");
        bt_Agregar_Gerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Agregar_GerenteActionPerformed(evt);
            }
        });

        jLabel56.setText("Correo Electronico");

        javax.swing.GroupLayout jd_Crear_GerenteLayout = new javax.swing.GroupLayout(jd_Crear_Gerente.getContentPane());
        jd_Crear_Gerente.getContentPane().setLayout(jd_Crear_GerenteLayout);
        jd_Crear_GerenteLayout.setHorizontalGroup(
            jd_Crear_GerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_GerenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Crear_GerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Crear_GerenteLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Agregar_Gerente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(bt_Agregar_Gerente)
                    .addGroup(jd_Crear_GerenteLayout.createSequentialGroup()
                        .addGroup(jd_Crear_GerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel56))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_Crear_GerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_Correo_Gerente)
                            .addComponent(pf_Agregar_Gerente, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jd_Crear_GerenteLayout.setVerticalGroup(
            jd_Crear_GerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_GerenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addGroup(jd_Crear_GerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_Agregar_Gerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jd_Crear_GerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(pf_Agregar_Gerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jd_Crear_GerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Correo_Gerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addGap(18, 30, Short.MAX_VALUE)
                .addComponent(bt_Agregar_Gerente)
                .addGap(28, 28, 28))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Agregar Jefe");

        jLabel8.setText("Usuario");

        jLabel9.setText("Contraseña");

        bt_Agregar_Jefe.setText("Agregar");
        bt_Agregar_Jefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Agregar_JefeActionPerformed(evt);
            }
        });

        jLabel57.setText("Correo Electronico");

        javax.swing.GroupLayout jd_Crear_JefeLayout = new javax.swing.GroupLayout(jd_Crear_Jefe.getContentPane());
        jd_Crear_Jefe.getContentPane().setLayout(jd_Crear_JefeLayout);
        jd_Crear_JefeLayout.setHorizontalGroup(
            jd_Crear_JefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_JefeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Crear_JefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_Agregar_Jefe)
                    .addGroup(jd_Crear_JefeLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pf_Agregar_Jefe, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_Crear_JefeLayout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_Correo_Jefe, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_Crear_JefeLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_Agregar_Jefe, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jd_Crear_JefeLayout.setVerticalGroup(
            jd_Crear_JefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_JefeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(45, 45, 45)
                .addGroup(jd_Crear_JefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_Agregar_Jefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jd_Crear_JefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pf_Agregar_Jefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jd_Crear_JefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Correo_Jefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addGap(18, 18, 18)
                .addComponent(bt_Agregar_Jefe)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Agregar Analista");

        jLabel11.setText("Usuario");

        jLabel12.setText("Contraseña");

        bt_Agregar_Analista.setText("Agregar");
        bt_Agregar_Analista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Agregar_AnalistaActionPerformed(evt);
            }
        });

        jLabel58.setText("Correo Electronico");

        javax.swing.GroupLayout jd_Crear_AnalistaLayout = new javax.swing.GroupLayout(jd_Crear_Analista.getContentPane());
        jd_Crear_Analista.getContentPane().setLayout(jd_Crear_AnalistaLayout);
        jd_Crear_AnalistaLayout.setHorizontalGroup(
            jd_Crear_AnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_AnalistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Crear_AnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_Agregar_Analista)
                    .addGroup(jd_Crear_AnalistaLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pf_Agregar_Analista, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_Crear_AnalistaLayout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_Correo_Analista, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10)
                    .addGroup(jd_Crear_AnalistaLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Agregar_Analista, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jd_Crear_AnalistaLayout.setVerticalGroup(
            jd_Crear_AnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_AnalistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(52, 52, 52)
                .addGroup(jd_Crear_AnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_Agregar_Analista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jd_Crear_AnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(pf_Agregar_Analista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jd_Crear_AnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Correo_Analista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_Agregar_Analista)
                .addGap(27, 27, 27))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Agregar Personal de Recursos Humanos");

        jLabel14.setText("Usuario");

        jLabel15.setText("Contraseña");

        bt_Agregar_Recursos_Humanos.setText("Agregar");
        bt_Agregar_Recursos_Humanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Agregar_Recursos_HumanosActionPerformed(evt);
            }
        });

        jLabel59.setText("Correo Electronico");

        javax.swing.GroupLayout jd_Crear_Recursos_HumanosLayout = new javax.swing.GroupLayout(jd_Crear_Recursos_Humanos.getContentPane());
        jd_Crear_Recursos_Humanos.getContentPane().setLayout(jd_Crear_Recursos_HumanosLayout);
        jd_Crear_Recursos_HumanosLayout.setHorizontalGroup(
            jd_Crear_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_Recursos_HumanosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Crear_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_Agregar_Recursos_Humanos)
                    .addGroup(jd_Crear_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Crear_Recursos_HumanosLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_Agregar_Recursos_Humanos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Crear_Recursos_HumanosLayout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGap(18, 18, 18)
                            .addComponent(pf_Agregar_Recursos_Humanos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13)
                    .addGroup(jd_Crear_Recursos_HumanosLayout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_Correo_Recursos_Humanos, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_Crear_Recursos_HumanosLayout.setVerticalGroup(
            jd_Crear_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_Recursos_HumanosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(33, 33, 33)
                .addGroup(jd_Crear_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_Agregar_Recursos_Humanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jd_Crear_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(pf_Agregar_Recursos_Humanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Crear_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Correo_Recursos_Humanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(bt_Agregar_Recursos_Humanos)
                .addContainerGap())
        );

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel38.setText("Creacion de Departamentos");

        jLabel39.setText("Nombre de la Gerencia");

        bt_Crear_Departamento.setText("Crear Departamento");
        bt_Crear_Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Crear_DepartamentoActionPerformed(evt);
            }
        });

        jl_Recursos_Humanos.setModel(new DefaultListModel());
        jScrollPane30.setViewportView(jl_Recursos_Humanos);

        jLabel62.setText("Seleccion un Personal de recursos humanos");

        javax.swing.GroupLayout jd_Crear_DepartamentosLayout = new javax.swing.GroupLayout(jd_Crear_Departamentos.getContentPane());
        jd_Crear_Departamentos.getContentPane().setLayout(jd_Crear_DepartamentosLayout);
        jd_Crear_DepartamentosLayout.setHorizontalGroup(
            jd_Crear_DepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_DepartamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Crear_DepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Crear_DepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel38)
                        .addGroup(jd_Crear_DepartamentosLayout.createSequentialGroup()
                            .addComponent(jLabel39)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_Nombre_Departamento)))
                    .addComponent(bt_Crear_Departamento)
                    .addComponent(jLabel62)
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_Crear_DepartamentosLayout.setVerticalGroup(
            jd_Crear_DepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_DepartamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38)
                .addGap(18, 18, 18)
                .addGroup(jd_Crear_DepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(tf_Nombre_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_Crear_Departamento))
        );

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("Listado de Gerentes");

        jl_Amigos.setText("Gerentes");

        cb_Gerentes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_GerentesItemStateChanged(evt);
            }
        });

        tabla_Gerentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contraseña", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_Gerentes.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(tabla_Gerentes);
        tabla_Gerentes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        bt_Volver_Gerentes.setText("Volver");
        bt_Volver_Gerentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Volver_GerentesActionPerformed(evt);
            }
        });

        bt_Limpiar_Listar_Gerentes.setText("Limpiar la Tabla");
        bt_Limpiar_Listar_Gerentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Limpiar_Listar_GerentesActionPerformed(evt);
            }
        });

        bt_Eliminar_Listar_Gerenter.setText("Eliminar Gerente Repetido de la tabla");
        bt_Eliminar_Listar_Gerenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Eliminar_Listar_GerenterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_Listar_GerentesLayout = new javax.swing.GroupLayout(jd_Listar_Gerentes.getContentPane());
        jd_Listar_Gerentes.getContentPane().setLayout(jd_Listar_GerentesLayout);
        jd_Listar_GerentesLayout.setHorizontalGroup(
            jd_Listar_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Listar_GerentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_Listar_GerentesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jd_Listar_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Listar_GerentesLayout.createSequentialGroup()
                        .addComponent(bt_Volver_Gerentes)
                        .addGap(27, 27, 27)
                        .addComponent(bt_Limpiar_Listar_Gerentes)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Eliminar_Listar_Gerenter))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_Listar_GerentesLayout.createSequentialGroup()
                        .addComponent(jl_Amigos)
                        .addGap(29, 29, 29)
                        .addComponent(cb_Gerentes, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 119, Short.MAX_VALUE))
        );
        jd_Listar_GerentesLayout.setVerticalGroup(
            jd_Listar_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Listar_GerentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_Listar_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Amigos)
                    .addComponent(cb_Gerentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jd_Listar_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Listar_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_Limpiar_Listar_Gerentes)
                        .addComponent(bt_Eliminar_Listar_Gerenter))
                    .addComponent(bt_Volver_Gerentes))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Listado de Jefes");

        jl_Amigos1.setText("Jefes");

        cb_Jefes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_JefesItemStateChanged(evt);
            }
        });

        tabla_Jefes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contraseña", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tabla_Jefes.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(tabla_Jefes);
        tabla_Jefes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        bt_Volver_Jefes.setText("Volver");
        bt_Volver_Jefes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Volver_JefesActionPerformed(evt);
            }
        });

        bt_Limpiar_Listar_Jefes.setText("Limpiar la Tabla");
        bt_Limpiar_Listar_Jefes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Limpiar_Listar_JefesActionPerformed(evt);
            }
        });

        bt_Eliminar_Listar_Jefes.setText("Eliminar Jefe Repetido de la tabla");
        bt_Eliminar_Listar_Jefes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Eliminar_Listar_JefesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_Listar_JefesLayout = new javax.swing.GroupLayout(jd_Listar_Jefes.getContentPane());
        jd_Listar_Jefes.getContentPane().setLayout(jd_Listar_JefesLayout);
        jd_Listar_JefesLayout.setHorizontalGroup(
            jd_Listar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Listar_JefesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jd_Listar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_Listar_JefesLayout.createSequentialGroup()
                        .addComponent(jl_Amigos1)
                        .addGap(29, 29, 29)
                        .addComponent(cb_Jefes, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jd_Listar_JefesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Listar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jd_Listar_JefesLayout.createSequentialGroup()
                        .addComponent(bt_Volver_Jefes)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Limpiar_Listar_Jefes)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Eliminar_Listar_Jefes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_Listar_JefesLayout.setVerticalGroup(
            jd_Listar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Listar_JefesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_Listar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Amigos1)
                    .addComponent(cb_Jefes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_Listar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Listar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_Limpiar_Listar_Jefes)
                        .addComponent(bt_Eliminar_Listar_Jefes))
                    .addComponent(bt_Volver_Jefes))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jl_Amigos2.setText("Analista");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setText("Listado de Analistas");

        cb_Analistas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_AnalistasItemStateChanged(evt);
            }
        });

        tabla_Analistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contraseña", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tabla_Analistas.setColumnSelectionAllowed(true);
        jScrollPane4.setViewportView(tabla_Analistas);
        tabla_Analistas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        bt_Volver_Analistas.setText("Volver");
        bt_Volver_Analistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Volver_AnalistasActionPerformed(evt);
            }
        });

        bt_Limpiar_Listar_Analistas.setText("Limpiar la Tabla");
        bt_Limpiar_Listar_Analistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Limpiar_Listar_AnalistasActionPerformed(evt);
            }
        });

        bt_Eliminar_Listar_Analistas.setText("Eliminar Analistas Repetido de la tabla");
        bt_Eliminar_Listar_Analistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Eliminar_Listar_AnalistasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_Listar_AnalistasLayout = new javax.swing.GroupLayout(jd_Listar_Analistas.getContentPane());
        jd_Listar_Analistas.getContentPane().setLayout(jd_Listar_AnalistasLayout);
        jd_Listar_AnalistasLayout.setHorizontalGroup(
            jd_Listar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Listar_AnalistasLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jd_Listar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_Listar_AnalistasLayout.createSequentialGroup()
                        .addComponent(jl_Amigos2)
                        .addGap(29, 29, 29)
                        .addComponent(cb_Analistas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jd_Listar_AnalistasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Listar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jd_Listar_AnalistasLayout.createSequentialGroup()
                        .addComponent(bt_Volver_Analistas)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Limpiar_Listar_Analistas)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Eliminar_Listar_Analistas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_Listar_AnalistasLayout.setVerticalGroup(
            jd_Listar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Listar_AnalistasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_Listar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Amigos2)
                    .addComponent(cb_Analistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jd_Listar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Listar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_Limpiar_Listar_Analistas)
                        .addComponent(bt_Eliminar_Listar_Analistas))
                    .addComponent(bt_Volver_Analistas))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        tabla_Recursos_Humanos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contraseña", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_Recursos_Humanos.setColumnSelectionAllowed(true);
        jScrollPane5.setViewportView(tabla_Recursos_Humanos);
        tabla_Recursos_Humanos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jl_Amigos3.setText("Personal de Recusos Humanos");

        cb_Recursos_Humanos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_Recursos_HumanosItemStateChanged(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setText("Listado de Personal de Recursos Humanos");

        bt_Volver_Recusos_Humanos.setText("Volver");
        bt_Volver_Recusos_Humanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Volver_Recusos_HumanosActionPerformed(evt);
            }
        });

        bt_Limpiar_Listar_Admins.setText("Limpiar la Tabla");
        bt_Limpiar_Listar_Admins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Limpiar_Listar_AdminsActionPerformed(evt);
            }
        });

        bt_Eliminar_Listar_Recursos_Humanos.setText("Eliminar Personla de Recursos Humanos Repetido de la tabla");
        bt_Eliminar_Listar_Recursos_Humanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Eliminar_Listar_Recursos_HumanosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_Listar_Recursos_HumanosLayout = new javax.swing.GroupLayout(jd_Listar_Recursos_Humanos.getContentPane());
        jd_Listar_Recursos_Humanos.getContentPane().setLayout(jd_Listar_Recursos_HumanosLayout);
        jd_Listar_Recursos_HumanosLayout.setHorizontalGroup(
            jd_Listar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Listar_Recursos_HumanosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jd_Listar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_Listar_Recursos_HumanosLayout.createSequentialGroup()
                        .addComponent(jl_Amigos3)
                        .addGap(29, 29, 29)
                        .addComponent(cb_Recursos_Humanos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jd_Listar_Recursos_HumanosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Listar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(jd_Listar_Recursos_HumanosLayout.createSequentialGroup()
                        .addComponent(bt_Volver_Recusos_Humanos)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Limpiar_Listar_Admins)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Eliminar_Listar_Recursos_Humanos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_Listar_Recursos_HumanosLayout.setVerticalGroup(
            jd_Listar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Listar_Recursos_HumanosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_Listar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Amigos3)
                    .addComponent(cb_Recursos_Humanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_Listar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Listar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_Limpiar_Listar_Admins)
                        .addComponent(bt_Eliminar_Listar_Recursos_Humanos))
                    .addComponent(bt_Volver_Recusos_Humanos))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jl_Departamentos.setModel(new DefaultListModel());
        jScrollPane27.setViewportView(jl_Departamentos);

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel54.setText("Listado de Departamentos Creados");

        jLabel55.setText("Departamentos");

        bt_Volver_Departamentos.setText("Cerrar Ventana");
        bt_Volver_Departamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Volver_DepartamentosActionPerformed(evt);
            }
        });

        bt_Eliminar_Departamento.setText("Eliminar Departamento");
        bt_Eliminar_Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Eliminar_DepartamentoActionPerformed(evt);
            }
        });

        bt_Agregar_Area_Departamento.setText("Agregar una area al Departamaneto");
        bt_Agregar_Area_Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Agregar_Area_DepartamentoActionPerformed(evt);
            }
        });

        bt_Agregar_Area.setText("Agregar Area Al departamento");

        javax.swing.GroupLayout jd_Listar_DepartamentosLayout = new javax.swing.GroupLayout(jd_Listar_Departamentos.getContentPane());
        jd_Listar_Departamentos.getContentPane().setLayout(jd_Listar_DepartamentosLayout);
        jd_Listar_DepartamentosLayout.setHorizontalGroup(
            jd_Listar_DepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Listar_DepartamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Listar_DepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Listar_DepartamentosLayout.createSequentialGroup()
                        .addGroup(jd_Listar_DepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Agregar_Area))
                    .addGroup(jd_Listar_DepartamentosLayout.createSequentialGroup()
                        .addComponent(bt_Volver_Departamentos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_Eliminar_Departamento)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Agregar_Area_Departamento)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_Listar_DepartamentosLayout.setVerticalGroup(
            jd_Listar_DepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Listar_DepartamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54)
                .addGap(18, 18, 18)
                .addComponent(jLabel55)
                .addGap(18, 18, 18)
                .addGroup(jd_Listar_DepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Agregar_Area))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jd_Listar_DepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Volver_Departamentos)
                    .addComponent(bt_Eliminar_Departamento)
                    .addComponent(bt_Agregar_Area_Departamento))
                .addContainerGap())
        );

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel28.setText("Administracion de Informacion de la Empresa");

        jLabel29.setText("Nombre de La Compañia");

        jLabel30.setText("Mision");

        jLabel31.setText("Correo Electronico");

        jLabel32.setText("Objetivos");

        jLabel33.setText("Vision");

        jLabel34.setText("Politicas");

        jLabel35.setText("Telefonos");

        ta_Mision_Compañia.setColumns(20);
        ta_Mision_Compañia.setRows(5);
        jScrollPane1.setViewportView(ta_Mision_Compañia);

        ta_Vision_Compañia.setColumns(20);
        ta_Vision_Compañia.setRows(5);
        jScrollPane14.setViewportView(ta_Vision_Compañia);

        ta_Objetivos_Compañia.setColumns(20);
        ta_Objetivos_Compañia.setRows(5);
        jScrollPane15.setViewportView(ta_Objetivos_Compañia);

        ta_Politicas_Compañia.setColumns(20);
        ta_Politicas_Compañia.setRows(5);
        jScrollPane16.setViewportView(ta_Politicas_Compañia);

        ta_Telefonos_Compañia.setColumns(20);
        ta_Telefonos_Compañia.setRows(5);
        jScrollPane17.setViewportView(ta_Telefonos_Compañia);

        bt_Modificar_Info_Compañia.setText("Modificar");
        bt_Modificar_Info_Compañia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Modificar_Info_CompañiaActionPerformed(evt);
            }
        });

        bt_Actualizar_Info_Compañia.setText("Actualizar");
        bt_Actualizar_Info_Compañia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Actualizar_Info_CompañiaActionPerformed(evt);
            }
        });

        bt_Obtener_Info_Compañia.setText("Obtener Infromacion");
        bt_Obtener_Info_Compañia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Obtener_Info_CompañiaActionPerformed(evt);
            }
        });

        jLabel36.setText("Direccion Exacta");

        ta_Direccion_Exacta_Compañia.setColumns(20);
        ta_Direccion_Exacta_Compañia.setRows(5);
        jScrollPane18.setViewportView(ta_Direccion_Exacta_Compañia);

        jLabel37.setText("Escriba En los espacios para midificar o agregar algo");

        jLabel42.setText("Nombre del Director");

        javax.swing.GroupLayout jd_Administracion_CompañiaLayout = new javax.swing.GroupLayout(jd_Administracion_Compañia.getContentPane());
        jd_Administracion_Compañia.getContentPane().setLayout(jd_Administracion_CompañiaLayout);
        jd_Administracion_CompañiaLayout.setHorizontalGroup(
            jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Administracion_CompañiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Administracion_CompañiaLayout.createSequentialGroup()
                        .addGroup(jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addGroup(jd_Administracion_CompañiaLayout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_Correo_Electronico_Compañia, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jd_Administracion_CompañiaLayout.createSequentialGroup()
                        .addGroup(jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jd_Administracion_CompañiaLayout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Administracion_CompañiaLayout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane17))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Administracion_CompañiaLayout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane16))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Administracion_CompañiaLayout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane15))
                            .addGroup(jd_Administracion_CompañiaLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Administracion_CompañiaLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_Nombre_Compañia, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Administracion_CompañiaLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane14)))
                        .addGroup(jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_Administracion_CompañiaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                                .addGroup(jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bt_Obtener_Info_Compañia, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(bt_Actualizar_Info_Compañia))
                                    .addGroup(jd_Administracion_CompañiaLayout.createSequentialGroup()
                                        .addComponent(bt_Modificar_Info_Compañia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel37)))
                                .addGap(120, 120, 120))
                            .addGroup(jd_Administracion_CompañiaLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_nombre_Director, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jd_Administracion_CompañiaLayout.setVerticalGroup(
            jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Administracion_CompañiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addGroup(jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_Modificar_Info_Compañia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(tf_Nombre_Compañia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37)))
                .addGroup(jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Administracion_CompañiaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel30))
                    .addGroup(jd_Administracion_CompañiaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_Administracion_CompañiaLayout.createSequentialGroup()
                                .addComponent(bt_Actualizar_Info_Compañia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_Obtener_Info_Compañia))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Administracion_CompañiaLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel33))
                    .addGroup(jd_Administracion_CompañiaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel42)
                                .addComponent(tf_nombre_Director, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(37, 37, 37)
                .addGroup(jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(tf_Correo_Electronico_Compañia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jd_Administracion_CompañiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addContainerGap())
        );

        jl_Amigos4.setText("Gerentes");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setText("Modificacion de Gerentes");

        cb_Gerentes1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_Gerentes1ItemStateChanged(evt);
            }
        });

        tabla_Gerentes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contraseña", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tabla_Gerentes1.setColumnSelectionAllowed(true);
        jScrollPane6.setViewportView(tabla_Gerentes1);
        tabla_Gerentes1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        bt_Modificar_Gerentes.setText("Modificar");
        bt_Modificar_Gerentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Modificar_GerentesActionPerformed(evt);
            }
        });

        bt_Modificar_Eliminar_Gerentes_tabla.setText("Eliminar de la Tabla");
        bt_Modificar_Eliminar_Gerentes_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Modificar_Eliminar_Gerentes_tablaActionPerformed(evt);
            }
        });

        bt_Modificar_Limpiar_Gerentes_tabla.setText("Limpiar la Tabla");
        bt_Modificar_Limpiar_Gerentes_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Modificar_Limpiar_Gerentes_tablaActionPerformed(evt);
            }
        });

        bt_Modificar_Volver_Gerentes_tabla.setText("Volver");
        bt_Modificar_Volver_Gerentes_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Modificar_Volver_Gerentes_tablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_Modificar_GerentesLayout = new javax.swing.GroupLayout(jd_Modificar_Gerentes.getContentPane());
        jd_Modificar_Gerentes.getContentPane().setLayout(jd_Modificar_GerentesLayout);
        jd_Modificar_GerentesLayout.setHorizontalGroup(
            jd_Modificar_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Modificar_GerentesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jd_Modificar_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_Modificar_GerentesLayout.createSequentialGroup()
                        .addComponent(jl_Amigos4)
                        .addGap(29, 29, 29)
                        .addComponent(cb_Gerentes1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jd_Modificar_GerentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Modificar_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jd_Modificar_GerentesLayout.createSequentialGroup()
                        .addComponent(bt_Modificar_Gerentes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_Modificar_Eliminar_Gerentes_tabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_Modificar_Limpiar_Gerentes_tabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Modificar_Volver_Gerentes_tabla)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_Modificar_GerentesLayout.setVerticalGroup(
            jd_Modificar_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Modificar_GerentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_Modificar_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Amigos4)
                    .addComponent(cb_Gerentes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_Modificar_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Modificar_Gerentes)
                    .addComponent(bt_Modificar_Eliminar_Gerentes_tabla)
                    .addComponent(bt_Modificar_Limpiar_Gerentes_tabla)
                    .addComponent(bt_Modificar_Volver_Gerentes_tabla))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        bt_Modificar_Jefes.setText("Modificar");
        bt_Modificar_Jefes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Modificar_JefesActionPerformed(evt);
            }
        });

        tabla_Jefes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contraseña", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_Jefes1.setColumnSelectionAllowed(true);
        jScrollPane7.setViewportView(tabla_Jefes1);
        tabla_Jefes1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jl_Amigos5.setText("Jefes");

        cb_Jefes1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_Jefes1ItemStateChanged(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setText("Modificacion de Jefes");

        bt_Modificar_Eliminar_Jefes_tabla.setText("Eliminar de la Tabla");
        bt_Modificar_Eliminar_Jefes_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Modificar_Eliminar_Jefes_tablaActionPerformed(evt);
            }
        });

        bt_Modificar_Limpiar_Jefes_tabla.setText("Limpiar la Tabla");
        bt_Modificar_Limpiar_Jefes_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Modificar_Limpiar_Jefes_tablaActionPerformed(evt);
            }
        });

        bt_Modificar_Volver_Jefes_tabla.setText("Volver");
        bt_Modificar_Volver_Jefes_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Modificar_Volver_Jefes_tablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_Modificar_JefesLayout = new javax.swing.GroupLayout(jd_Modificar_Jefes.getContentPane());
        jd_Modificar_Jefes.getContentPane().setLayout(jd_Modificar_JefesLayout);
        jd_Modificar_JefesLayout.setHorizontalGroup(
            jd_Modificar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Modificar_JefesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jd_Modificar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_Modificar_JefesLayout.createSequentialGroup()
                        .addComponent(jl_Amigos5)
                        .addGap(29, 29, 29)
                        .addComponent(cb_Jefes1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jd_Modificar_JefesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Modificar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jd_Modificar_JefesLayout.createSequentialGroup()
                        .addComponent(bt_Modificar_Jefes)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Modificar_Eliminar_Jefes_tabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_Modificar_Limpiar_Jefes_tabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Modificar_Volver_Jefes_tabla)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_Modificar_JefesLayout.setVerticalGroup(
            jd_Modificar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Modificar_JefesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_Modificar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Amigos5)
                    .addComponent(cb_Jefes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_Modificar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Modificar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_Modificar_Eliminar_Jefes_tabla)
                        .addComponent(bt_Modificar_Limpiar_Jefes_tabla)
                        .addComponent(bt_Modificar_Volver_Jefes_tabla))
                    .addComponent(bt_Modificar_Jefes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_Modificar_Analista.setText("Modificar");
        bt_Modificar_Analista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Modificar_AnalistaActionPerformed(evt);
            }
        });

        tabla_Analistas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contraseña", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_Analistas1.setColumnSelectionAllowed(true);
        jScrollPane8.setViewportView(tabla_Analistas1);
        tabla_Analistas1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jl_Amigos6.setText("Analistas");

        cb_Analistas1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_Analistas1ItemStateChanged(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setText("Modificacio de Analistas");

        bt_Modificar_Eliminar_Analista_tabla.setText("Eliminar de la Tabla");
        bt_Modificar_Eliminar_Analista_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Modificar_Eliminar_Analista_tablaActionPerformed(evt);
            }
        });

        bt_Modificar_Limpiar_Analistas_tabla.setText("Limpiar la Tabla");
        bt_Modificar_Limpiar_Analistas_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Modificar_Limpiar_Analistas_tablaActionPerformed(evt);
            }
        });

        bt_Modificar_Volver_Analistas_tabla.setText("Volver");
        bt_Modificar_Volver_Analistas_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Modificar_Volver_Analistas_tablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_Modificar_AnalistasLayout = new javax.swing.GroupLayout(jd_Modificar_Analistas.getContentPane());
        jd_Modificar_Analistas.getContentPane().setLayout(jd_Modificar_AnalistasLayout);
        jd_Modificar_AnalistasLayout.setHorizontalGroup(
            jd_Modificar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Modificar_AnalistasLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jd_Modificar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_Modificar_AnalistasLayout.createSequentialGroup()
                        .addComponent(jl_Amigos6)
                        .addGap(29, 29, 29)
                        .addComponent(cb_Analistas1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jd_Modificar_AnalistasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Modificar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(jd_Modificar_AnalistasLayout.createSequentialGroup()
                        .addComponent(bt_Modificar_Analista)
                        .addGap(33, 33, 33)
                        .addComponent(bt_Modificar_Eliminar_Analista_tabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_Modificar_Limpiar_Analistas_tabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Modificar_Volver_Analistas_tabla)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_Modificar_AnalistasLayout.setVerticalGroup(
            jd_Modificar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Modificar_AnalistasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_Modificar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Amigos6)
                    .addComponent(cb_Analistas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_Modificar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Modificar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_Modificar_Eliminar_Analista_tabla)
                        .addComponent(bt_Modificar_Limpiar_Analistas_tabla)
                        .addComponent(bt_Modificar_Volver_Analistas_tabla))
                    .addComponent(bt_Modificar_Analista))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla_Recursos_Humanos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contraseña", "String"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tabla_Recursos_Humanos1.setColumnSelectionAllowed(true);
        jScrollPane9.setViewportView(tabla_Recursos_Humanos1);
        tabla_Recursos_Humanos1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        bt_Modificar_Recursos_Humanos.setText("Modificar");
        bt_Modificar_Recursos_Humanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Modificar_Recursos_HumanosActionPerformed(evt);
            }
        });

        jl_Amigos7.setText("Personal");

        cb_Recursos_Humanos1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_Recursos_Humanos1ItemStateChanged(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setText("Modificacion de Personal de Recursos Humanos");

        bt_Modificar_Eliminar_Recusos_Humanos_tabla.setText("Eliminar de la Tabla");
        bt_Modificar_Eliminar_Recusos_Humanos_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Modificar_Eliminar_Recusos_Humanos_tablaActionPerformed(evt);
            }
        });

        bt_Modificar_Limpiar_Recursos_Humanos_tabla.setText("Limpiar la Tabla");
        bt_Modificar_Limpiar_Recursos_Humanos_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Modificar_Limpiar_Recursos_Humanos_tablaActionPerformed(evt);
            }
        });

        bt_Modificar_Volver_Recusros_Humanos_tabla.setText("Volver");
        bt_Modificar_Volver_Recusros_Humanos_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Modificar_Volver_Recusros_Humanos_tablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_Modificar_Recursos_HumanosLayout = new javax.swing.GroupLayout(jd_Modificar_Recursos_Humanos.getContentPane());
        jd_Modificar_Recursos_Humanos.getContentPane().setLayout(jd_Modificar_Recursos_HumanosLayout);
        jd_Modificar_Recursos_HumanosLayout.setHorizontalGroup(
            jd_Modificar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Modificar_Recursos_HumanosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jd_Modificar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_Modificar_Recursos_HumanosLayout.createSequentialGroup()
                        .addComponent(jl_Amigos7)
                        .addGap(29, 29, 29)
                        .addComponent(cb_Recursos_Humanos1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jd_Modificar_Recursos_HumanosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Modificar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(jd_Modificar_Recursos_HumanosLayout.createSequentialGroup()
                        .addComponent(bt_Modificar_Recursos_Humanos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Modificar_Eliminar_Recusos_Humanos_tabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_Modificar_Limpiar_Recursos_Humanos_tabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Modificar_Volver_Recusros_Humanos_tabla)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_Modificar_Recursos_HumanosLayout.setVerticalGroup(
            jd_Modificar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Modificar_Recursos_HumanosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_Modificar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Amigos7)
                    .addComponent(cb_Recursos_Humanos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_Modificar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_Modificar_Recursos_Humanos)
                    .addGroup(jd_Modificar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_Modificar_Eliminar_Recusos_Humanos_tabla)
                        .addComponent(bt_Modificar_Limpiar_Recursos_Humanos_tabla)
                        .addComponent(bt_Modificar_Volver_Recusros_Humanos_tabla)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jl_Amigos8.setText("Gerentes");

        cb_Gerentes2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_Gerentes2ItemStateChanged(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel24.setText("Eliminacion de Gerentes");

        tabla_Gerentes2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(tabla_Gerentes2);
        tabla_Gerentes2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        bt_Eliminar_Gerentes.setText("Eliminar");
        bt_Eliminar_Gerentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Eliminar_GerentesActionPerformed(evt);
            }
        });

        bt_Limpiar_Eliminar_Gerentes.setText("Limpiar la Tabla");
        bt_Limpiar_Eliminar_Gerentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Limpiar_Eliminar_GerentesActionPerformed(evt);
            }
        });

        bt_Eliminar_Volver_Gerentes.setText("Volver");
        bt_Eliminar_Volver_Gerentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Eliminar_Volver_GerentesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_Eliminar_GerentesLayout = new javax.swing.GroupLayout(jd_Eliminar_Gerentes.getContentPane());
        jd_Eliminar_Gerentes.getContentPane().setLayout(jd_Eliminar_GerentesLayout);
        jd_Eliminar_GerentesLayout.setHorizontalGroup(
            jd_Eliminar_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Eliminar_GerentesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jd_Eliminar_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_Eliminar_GerentesLayout.createSequentialGroup()
                        .addComponent(jl_Amigos8)
                        .addGap(29, 29, 29)
                        .addComponent(cb_Gerentes2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jd_Eliminar_GerentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Eliminar_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(jd_Eliminar_GerentesLayout.createSequentialGroup()
                        .addComponent(bt_Eliminar_Gerentes)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Limpiar_Eliminar_Gerentes)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Eliminar_Volver_Gerentes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_Eliminar_GerentesLayout.setVerticalGroup(
            jd_Eliminar_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Eliminar_GerentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_Eliminar_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Amigos8)
                    .addComponent(cb_Gerentes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_Eliminar_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Eliminar_Gerentes)
                    .addComponent(bt_Limpiar_Eliminar_Gerentes)
                    .addComponent(bt_Eliminar_Volver_Gerentes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_Eliminar_Jefes.setText("Eliminar");
        bt_Eliminar_Jefes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Eliminar_JefesActionPerformed(evt);
            }
        });

        bt_Limpiar_Eliminar_Jefes.setText("Limpiar la Tabla");
        bt_Limpiar_Eliminar_Jefes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Limpiar_Eliminar_JefesActionPerformed(evt);
            }
        });

        bt_Eliminar_Volver_Jefes.setText("Volver");
        bt_Eliminar_Volver_Jefes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Eliminar_Volver_JefesActionPerformed(evt);
            }
        });

        tabla_Jefes2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(tabla_Jefes2);
        tabla_Jefes2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jl_Amigos9.setText("Jefes");

        cb_Jefes2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_Jefes2ItemStateChanged(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setText("Eliminacion de Jefes");

        javax.swing.GroupLayout jd_Eliminar_JefesLayout = new javax.swing.GroupLayout(jd_Eliminar_Jefes.getContentPane());
        jd_Eliminar_Jefes.getContentPane().setLayout(jd_Eliminar_JefesLayout);
        jd_Eliminar_JefesLayout.setHorizontalGroup(
            jd_Eliminar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Eliminar_JefesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jd_Eliminar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_Eliminar_JefesLayout.createSequentialGroup()
                        .addComponent(jl_Amigos9)
                        .addGap(29, 29, 29)
                        .addComponent(cb_Jefes2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jd_Eliminar_JefesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Eliminar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addGroup(jd_Eliminar_JefesLayout.createSequentialGroup()
                        .addComponent(bt_Eliminar_Jefes)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Limpiar_Eliminar_Jefes)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Eliminar_Volver_Jefes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_Eliminar_JefesLayout.setVerticalGroup(
            jd_Eliminar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Eliminar_JefesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_Eliminar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Amigos9)
                    .addComponent(cb_Jefes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_Eliminar_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Eliminar_Jefes)
                    .addComponent(bt_Limpiar_Eliminar_Jefes)
                    .addComponent(bt_Eliminar_Volver_Jefes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla_Analistas2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(tabla_Analistas2);
        tabla_Analistas2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        bt_Eliminar_Analistas.setText("Eliminar");
        bt_Eliminar_Analistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Eliminar_AnalistasActionPerformed(evt);
            }
        });

        bt_Limpiar_Eliminar_Analistas.setText("Limpiar la Tabla");
        bt_Limpiar_Eliminar_Analistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Limpiar_Eliminar_AnalistasActionPerformed(evt);
            }
        });

        bt_Eliminar_Volver_Analistas.setText("Volver");
        bt_Eliminar_Volver_Analistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Eliminar_Volver_AnalistasActionPerformed(evt);
            }
        });

        jl_Amigos10.setText("Analistas");

        cb_Analistas2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_Analistas2ItemStateChanged(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel26.setText("Eliminacion de Analistas");

        javax.swing.GroupLayout jd_Eliminar_AnalistasLayout = new javax.swing.GroupLayout(jd_Eliminar_Analistas.getContentPane());
        jd_Eliminar_Analistas.getContentPane().setLayout(jd_Eliminar_AnalistasLayout);
        jd_Eliminar_AnalistasLayout.setHorizontalGroup(
            jd_Eliminar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Eliminar_AnalistasLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jd_Eliminar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_Eliminar_AnalistasLayout.createSequentialGroup()
                        .addComponent(jl_Amigos10)
                        .addGap(29, 29, 29)
                        .addComponent(cb_Analistas2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jd_Eliminar_AnalistasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Eliminar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(jd_Eliminar_AnalistasLayout.createSequentialGroup()
                        .addComponent(bt_Eliminar_Analistas)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Limpiar_Eliminar_Analistas)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Eliminar_Volver_Analistas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_Eliminar_AnalistasLayout.setVerticalGroup(
            jd_Eliminar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Eliminar_AnalistasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_Eliminar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Amigos10)
                    .addComponent(cb_Analistas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_Eliminar_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Eliminar_Analistas)
                    .addComponent(bt_Limpiar_Eliminar_Analistas)
                    .addComponent(bt_Eliminar_Volver_Analistas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_Eliminar_Recursos_Humanos.setText("Eliminar");
        bt_Eliminar_Recursos_Humanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Eliminar_Recursos_HumanosActionPerformed(evt);
            }
        });

        bt_Limpiar_Eliminar_Admins.setText("Limpiar la Tabla");
        bt_Limpiar_Eliminar_Admins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Limpiar_Eliminar_AdminsActionPerformed(evt);
            }
        });

        bt_Eliminar_Volver_Admins.setText("Volver");
        bt_Eliminar_Volver_Admins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Eliminar_Volver_AdminsActionPerformed(evt);
            }
        });

        tabla_Recursos_Humanos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contraseña", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_Recursos_Humanos2.setColumnSelectionAllowed(true);
        jScrollPane13.setViewportView(tabla_Recursos_Humanos2);
        tabla_Recursos_Humanos2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jl_Amigos11.setText("Personal");

        cb_Recursos_Humanos2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_Recursos_Humanos2ItemStateChanged(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel27.setText("Eliminacion de Personal de Recursos Humanos");

        javax.swing.GroupLayout jd_Eliminar_Recursos_HumanosLayout = new javax.swing.GroupLayout(jd_Eliminar_Recursos_Humanos.getContentPane());
        jd_Eliminar_Recursos_Humanos.getContentPane().setLayout(jd_Eliminar_Recursos_HumanosLayout);
        jd_Eliminar_Recursos_HumanosLayout.setHorizontalGroup(
            jd_Eliminar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Eliminar_Recursos_HumanosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jd_Eliminar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_Eliminar_Recursos_HumanosLayout.createSequentialGroup()
                        .addComponent(jl_Amigos11)
                        .addGap(29, 29, 29)
                        .addComponent(cb_Recursos_Humanos2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jd_Eliminar_Recursos_HumanosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Eliminar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addGroup(jd_Eliminar_Recursos_HumanosLayout.createSequentialGroup()
                        .addComponent(bt_Eliminar_Recursos_Humanos)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Limpiar_Eliminar_Admins)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Eliminar_Volver_Admins)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_Eliminar_Recursos_HumanosLayout.setVerticalGroup(
            jd_Eliminar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Eliminar_Recursos_HumanosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_Eliminar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Amigos11)
                    .addComponent(cb_Recursos_Humanos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_Eliminar_Recursos_HumanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Eliminar_Recursos_Humanos)
                    .addComponent(bt_Limpiar_Eliminar_Admins)
                    .addComponent(bt_Eliminar_Volver_Admins))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_Solicitar_Vacaiones.setText("Solicitar");
        bt_Solicitar_Vacaiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Solicitar_VacaionesActionPerformed(evt);
            }
        });

        ta_Solicitud_Vacaciones.setColumns(20);
        ta_Solicitud_Vacaciones.setRows(5);
        jScrollPane20.setViewportView(ta_Solicitud_Vacaciones);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel41.setText("Solictud de vacaciones");

        javax.swing.GroupLayout jd_Solicitar_Vacaciones_AnalistasLayout = new javax.swing.GroupLayout(jd_Solicitar_Vacaciones_Analistas.getContentPane());
        jd_Solicitar_Vacaciones_Analistas.getContentPane().setLayout(jd_Solicitar_Vacaciones_AnalistasLayout);
        jd_Solicitar_Vacaciones_AnalistasLayout.setHorizontalGroup(
            jd_Solicitar_Vacaciones_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Solicitar_Vacaciones_AnalistasLayout.createSequentialGroup()
                .addGroup(jd_Solicitar_Vacaciones_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_Solicitar_Vacaciones_AnalistasLayout.createSequentialGroup()
                        .addGroup(jd_Solicitar_Vacaciones_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_Solicitar_Vacaciones_AnalistasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel41))
                            .addComponent(bt_Solicitar_Vacaiones))
                        .addGap(0, 105, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_Solicitar_Vacaciones_AnalistasLayout.setVerticalGroup(
            jd_Solicitar_Vacaciones_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_Solicitar_Vacaciones_AnalistasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_Solicitar_Vacaiones)
                .addGap(28, 28, 28))
        );

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel45.setText("Solicitud de Permisos");

        ta_Solicitud_Permisos.setColumns(20);
        ta_Solicitud_Permisos.setRows(5);
        jScrollPane22.setViewportView(ta_Solicitud_Permisos);

        bt_Solicitar_Permisos.setText("Solicitar");
        bt_Solicitar_Permisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Solicitar_PermisosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_Solicitud_Permisos_AnalistasLayout = new javax.swing.GroupLayout(jd_Solicitud_Permisos_Analistas.getContentPane());
        jd_Solicitud_Permisos_Analistas.getContentPane().setLayout(jd_Solicitud_Permisos_AnalistasLayout);
        jd_Solicitud_Permisos_AnalistasLayout.setHorizontalGroup(
            jd_Solicitud_Permisos_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Solicitud_Permisos_AnalistasLayout.createSequentialGroup()
                .addGroup(jd_Solicitud_Permisos_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(jd_Solicitud_Permisos_AnalistasLayout.createSequentialGroup()
                        .addGroup(jd_Solicitud_Permisos_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_Solicitud_Permisos_AnalistasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel45))
                            .addComponent(bt_Solicitar_Permisos))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_Solicitud_Permisos_AnalistasLayout.setVerticalGroup(
            jd_Solicitud_Permisos_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_Solicitud_Permisos_AnalistasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_Solicitar_Permisos)
                .addGap(28, 28, 28))
        );

        bt_Solicitar_Insistencia.setText("Solicitar");
        bt_Solicitar_Insistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Solicitar_InsistenciaActionPerformed(evt);
            }
        });

        ta_Solicitud_Insistencias.setColumns(20);
        ta_Solicitud_Insistencias.setRows(5);
        jScrollPane24.setViewportView(ta_Solicitud_Insistencias);

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel49.setText("Solictud de Insistencias");

        javax.swing.GroupLayout jd_Solicitud_Insistencias_AnalistasLayout = new javax.swing.GroupLayout(jd_Solicitud_Insistencias_Analistas.getContentPane());
        jd_Solicitud_Insistencias_Analistas.getContentPane().setLayout(jd_Solicitud_Insistencias_AnalistasLayout);
        jd_Solicitud_Insistencias_AnalistasLayout.setHorizontalGroup(
            jd_Solicitud_Insistencias_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Solicitud_Insistencias_AnalistasLayout.createSequentialGroup()
                .addGroup(jd_Solicitud_Insistencias_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_Solicitud_Insistencias_AnalistasLayout.createSequentialGroup()
                        .addGroup(jd_Solicitud_Insistencias_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_Solicitud_Insistencias_AnalistasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel49))
                            .addComponent(bt_Solicitar_Insistencia))
                        .addGap(0, 93, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_Solicitud_Insistencias_AnalistasLayout.setVerticalGroup(
            jd_Solicitud_Insistencias_AnalistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_Solicitud_Insistencias_AnalistasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_Solicitar_Insistencia)
                .addGap(28, 28, 28))
        );

        bt_Solicitar_Vacaciones_Jefes.setText("Solicitar");
        bt_Solicitar_Vacaciones_Jefes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Solicitar_Vacaciones_JefesActionPerformed(evt);
            }
        });

        ta_Solicitud_Vacaciones_Jefes.setColumns(20);
        ta_Solicitud_Vacaciones_Jefes.setRows(5);
        jScrollPane31.setViewportView(ta_Solicitud_Vacaciones_Jefes);

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel67.setText("Solictud de Vacaciones");

        javax.swing.GroupLayout jd_Solicitudes_Vacaciones_JefesLayout = new javax.swing.GroupLayout(jd_Solicitudes_Vacaciones_Jefes.getContentPane());
        jd_Solicitudes_Vacaciones_Jefes.getContentPane().setLayout(jd_Solicitudes_Vacaciones_JefesLayout);
        jd_Solicitudes_Vacaciones_JefesLayout.setHorizontalGroup(
            jd_Solicitudes_Vacaciones_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Solicitudes_Vacaciones_JefesLayout.createSequentialGroup()
                .addGroup(jd_Solicitudes_Vacaciones_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_Solicitudes_Vacaciones_JefesLayout.createSequentialGroup()
                        .addGroup(jd_Solicitudes_Vacaciones_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_Solicitudes_Vacaciones_JefesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel67))
                            .addComponent(bt_Solicitar_Vacaciones_Jefes))
                        .addGap(0, 103, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_Solicitudes_Vacaciones_JefesLayout.setVerticalGroup(
            jd_Solicitudes_Vacaciones_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_Solicitudes_Vacaciones_JefesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_Solicitar_Vacaciones_Jefes)
                .addGap(28, 28, 28))
        );

        bt_Solicitar_Permisos_Jefes.setText("Solicitar");
        bt_Solicitar_Permisos_Jefes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Solicitar_Permisos_JefesActionPerformed(evt);
            }
        });

        ta_Solicitud_Permisos_Jefes.setColumns(20);
        ta_Solicitud_Permisos_Jefes.setRows(5);
        jScrollPane32.setViewportView(ta_Solicitud_Permisos_Jefes);

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel68.setText("Solicitud de Permisos");

        javax.swing.GroupLayout jd_Solicitudes_Permisos_JefesLayout = new javax.swing.GroupLayout(jd_Solicitudes_Permisos_Jefes.getContentPane());
        jd_Solicitudes_Permisos_Jefes.getContentPane().setLayout(jd_Solicitudes_Permisos_JefesLayout);
        jd_Solicitudes_Permisos_JefesLayout.setHorizontalGroup(
            jd_Solicitudes_Permisos_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Solicitudes_Permisos_JefesLayout.createSequentialGroup()
                .addGroup(jd_Solicitudes_Permisos_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane32, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_Solicitudes_Permisos_JefesLayout.createSequentialGroup()
                        .addGroup(jd_Solicitudes_Permisos_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_Solicitudes_Permisos_JefesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel68))
                            .addComponent(bt_Solicitar_Permisos_Jefes))
                        .addGap(0, 120, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_Solicitudes_Permisos_JefesLayout.setVerticalGroup(
            jd_Solicitudes_Permisos_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_Solicitudes_Permisos_JefesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_Solicitar_Permisos_Jefes)
                .addGap(28, 28, 28))
        );

        bt_Solicitar_Insistencias_Jefes.setText("Solicitar");
        bt_Solicitar_Insistencias_Jefes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Solicitar_Insistencias_JefesActionPerformed(evt);
            }
        });

        ta_Solicitud_Insistencias_Jefes.setColumns(20);
        ta_Solicitud_Insistencias_Jefes.setRows(5);
        jScrollPane33.setViewportView(ta_Solicitud_Insistencias_Jefes);

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel69.setText("Solicitud de Insistencias");

        javax.swing.GroupLayout jd_Solicitudes_Insistencias_JefesLayout = new javax.swing.GroupLayout(jd_Solicitudes_Insistencias_Jefes.getContentPane());
        jd_Solicitudes_Insistencias_Jefes.getContentPane().setLayout(jd_Solicitudes_Insistencias_JefesLayout);
        jd_Solicitudes_Insistencias_JefesLayout.setHorizontalGroup(
            jd_Solicitudes_Insistencias_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Solicitudes_Insistencias_JefesLayout.createSequentialGroup()
                .addGroup(jd_Solicitudes_Insistencias_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane33, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_Solicitudes_Insistencias_JefesLayout.createSequentialGroup()
                        .addGroup(jd_Solicitudes_Insistencias_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_Solicitudes_Insistencias_JefesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel69))
                            .addComponent(bt_Solicitar_Insistencias_Jefes))
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_Solicitudes_Insistencias_JefesLayout.setVerticalGroup(
            jd_Solicitudes_Insistencias_JefesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_Solicitudes_Insistencias_JefesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_Solicitar_Insistencias_Jefes)
                .addGap(28, 28, 28))
        );

        bt_Solicitar_Vacaciones_Gerentes.setText("Solicitar");
        bt_Solicitar_Vacaciones_Gerentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Solicitar_Vacaciones_GerentesActionPerformed(evt);
            }
        });

        ta_Solicitud_Vacaciones_Gerentes.setColumns(20);
        ta_Solicitud_Vacaciones_Gerentes.setRows(5);
        jScrollPane34.setViewportView(ta_Solicitud_Vacaciones_Gerentes);

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel70.setText("Solicitud de Vacaciones");

        javax.swing.GroupLayout jd_Solicitudes_Vacaciones_GerentesLayout = new javax.swing.GroupLayout(jd_Solicitudes_Vacaciones_Gerentes.getContentPane());
        jd_Solicitudes_Vacaciones_Gerentes.getContentPane().setLayout(jd_Solicitudes_Vacaciones_GerentesLayout);
        jd_Solicitudes_Vacaciones_GerentesLayout.setHorizontalGroup(
            jd_Solicitudes_Vacaciones_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Solicitudes_Vacaciones_GerentesLayout.createSequentialGroup()
                .addGroup(jd_Solicitudes_Vacaciones_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane34, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_Solicitudes_Vacaciones_GerentesLayout.createSequentialGroup()
                        .addGroup(jd_Solicitudes_Vacaciones_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_Solicitudes_Vacaciones_GerentesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel70))
                            .addComponent(bt_Solicitar_Vacaciones_Gerentes))
                        .addGap(0, 96, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_Solicitudes_Vacaciones_GerentesLayout.setVerticalGroup(
            jd_Solicitudes_Vacaciones_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_Solicitudes_Vacaciones_GerentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_Solicitar_Vacaciones_Gerentes)
                .addGap(28, 28, 28))
        );

        bt_Solicitar_Permisos_Gerentes.setText("Solicitar");
        bt_Solicitar_Permisos_Gerentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Solicitar_Permisos_GerentesActionPerformed(evt);
            }
        });

        ta_Solicitud_Permisos_Gerentes.setColumns(20);
        ta_Solicitud_Permisos_Gerentes.setRows(5);
        jScrollPane35.setViewportView(ta_Solicitud_Permisos_Gerentes);

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel71.setText("Solicitud de Permisos");

        javax.swing.GroupLayout jd_Solicitudes_Permisos_GerentesLayout = new javax.swing.GroupLayout(jd_Solicitudes_Permisos_Gerentes.getContentPane());
        jd_Solicitudes_Permisos_Gerentes.getContentPane().setLayout(jd_Solicitudes_Permisos_GerentesLayout);
        jd_Solicitudes_Permisos_GerentesLayout.setHorizontalGroup(
            jd_Solicitudes_Permisos_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Solicitudes_Permisos_GerentesLayout.createSequentialGroup()
                .addGroup(jd_Solicitudes_Permisos_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_Solicitudes_Permisos_GerentesLayout.createSequentialGroup()
                        .addGroup(jd_Solicitudes_Permisos_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_Solicitudes_Permisos_GerentesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel71))
                            .addComponent(bt_Solicitar_Permisos_Gerentes))
                        .addGap(0, 120, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_Solicitudes_Permisos_GerentesLayout.setVerticalGroup(
            jd_Solicitudes_Permisos_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_Solicitudes_Permisos_GerentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_Solicitar_Permisos_Gerentes)
                .addGap(28, 28, 28))
        );

        bt_Solicitar_Insistencias_Gerentes.setText("Solicitar");
        bt_Solicitar_Insistencias_Gerentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Solicitar_Insistencias_GerentesActionPerformed(evt);
            }
        });

        ta_Solicitud_Insistencias_Gerentes.setColumns(20);
        ta_Solicitud_Insistencias_Gerentes.setRows(5);
        jScrollPane36.setViewportView(ta_Solicitud_Insistencias_Gerentes);

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel72.setText("Solicitud de Insistencias");

        javax.swing.GroupLayout jd_Solicitudes_Insistencias_GerentesLayout = new javax.swing.GroupLayout(jd_Solicitudes_Insistencias_Gerentes.getContentPane());
        jd_Solicitudes_Insistencias_Gerentes.getContentPane().setLayout(jd_Solicitudes_Insistencias_GerentesLayout);
        jd_Solicitudes_Insistencias_GerentesLayout.setHorizontalGroup(
            jd_Solicitudes_Insistencias_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Solicitudes_Insistencias_GerentesLayout.createSequentialGroup()
                .addGroup(jd_Solicitudes_Insistencias_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane36, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_Solicitudes_Insistencias_GerentesLayout.createSequentialGroup()
                        .addGroup(jd_Solicitudes_Insistencias_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_Solicitudes_Insistencias_GerentesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel72))
                            .addComponent(bt_Solicitar_Insistencias_Gerentes))
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_Solicitudes_Insistencias_GerentesLayout.setVerticalGroup(
            jd_Solicitudes_Insistencias_GerentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_Solicitudes_Insistencias_GerentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_Solicitar_Insistencias_Gerentes)
                .addGap(28, 28, 28))
        );

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel40.setText("Ecriba lo que realizo en su estadia en el sistema");

        bt_Bitacora.setText("Agregar a la bitacora");
        bt_Bitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_BitacoraActionPerformed(evt);
            }
        });

        ta_Bitacora.setColumns(20);
        ta_Bitacora.setRows(5);
        jScrollPane19.setViewportView(ta_Bitacora);

        javax.swing.GroupLayout jd_Administrar_BitacoraLayout = new javax.swing.GroupLayout(jd_Administrar_Bitacora.getContentPane());
        jd_Administrar_Bitacora.getContentPane().setLayout(jd_Administrar_BitacoraLayout);
        jd_Administrar_BitacoraLayout.setHorizontalGroup(
            jd_Administrar_BitacoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Administrar_BitacoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_Bitacora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_Administrar_BitacoraLayout.createSequentialGroup()
                .addComponent(jLabel40)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jd_Administrar_BitacoraLayout.createSequentialGroup()
                .addComponent(jScrollPane19)
                .addContainerGap())
        );
        jd_Administrar_BitacoraLayout.setVerticalGroup(
            jd_Administrar_BitacoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Administrar_BitacoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_Bitacora)
                .addContainerGap())
        );

        bt_Contrato.setText("Contratar");
        bt_Contrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ContratoActionPerformed(evt);
            }
        });

        jl_Departamentos1.setModel(new DefaultListModel());
        jScrollPane21.setViewportView(jl_Departamentos1);

        jl_Jefes.setModel(new DefaultListModel());
        jScrollPane23.setViewportView(jl_Jefes);

        jl_Analistas.setModel(new DefaultListModel());
        jScrollPane25.setViewportView(jl_Analistas);

        jl_Areas.setModel(new DefaultListModel());
        jScrollPane26.setViewportView(jl_Areas);

        jLabel43.setText("Seleccione un Departameto");

        jLabel44.setText("Seleccione un jefe");

        jLabel46.setText("Seleccione un Analista");

        jLabel47.setText("Seleccione un Gerente");

        jLabel48.setText("Seleccione el un area de ese departamento");

        jl_Gerente.setModel(new DefaultListModel());
        jScrollPane28.setViewportView(jl_Gerente);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel50.setText("Contratacion de Perssonal");

        bt_Reclutado.setText("Reclutado");
        bt_Reclutado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ReclutadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_ContratacionLayout = new javax.swing.GroupLayout(jd_Contratacion.getContentPane());
        jd_Contratacion.getContentPane().setLayout(jd_ContratacionLayout);
        jd_ContratacionLayout.setHorizontalGroup(
            jd_ContratacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ContratacionLayout.createSequentialGroup()
                .addComponent(bt_Contrato)
                .addGap(18, 18, 18)
                .addComponent(bt_Reclutado)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jd_ContratacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_ContratacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ContratacionLayout.createSequentialGroup()
                        .addGroup(jd_ContratacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jd_ContratacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_ContratacionLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ContratacionLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_ContratacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane23)
                            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_ContratacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_ContratacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_ContratacionLayout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addGap(0, 138, Short.MAX_VALUE))
                            .addGroup(jd_ContratacionLayout.createSequentialGroup()
                                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(jd_ContratacionLayout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(0, 937, Short.MAX_VALUE))))
        );
        jd_ContratacionLayout.setVerticalGroup(
            jd_ContratacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ContratacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jd_ContratacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel48)
                    .addComponent(jLabel44)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_ContratacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ContratacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ContratacionLayout.createSequentialGroup()
                            .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28))
                        .addGroup(jd_ContratacionLayout.createSequentialGroup()
                            .addGroup(jd_ContratacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jd_ContratacionLayout.createSequentialGroup()
                        .addGroup(jd_ContratacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jd_ContratacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Contrato)
                    .addComponent(bt_Reclutado))
                .addContainerGap())
        );

        jd_Organigrama.setTitle("Creacion del Organigrama");

        bt_Inicio.setText("Inicio");
        bt_Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_InicioMouseClicked(evt);
            }
        });

        bt_Proceso.setText("Empleados");
        bt_Proceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_ProcesoMouseClicked(evt);
            }
        });

        bt_Fin.setText("Fin");
        bt_Fin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_FinMouseClicked(evt);
            }
        });

        bt_Cargo.setText("Cargo");
        bt_Cargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_CargoMouseClicked(evt);
            }
        });

        bt_Separadores.setText("Separador");
        bt_Separadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SeparadoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_OpcionesLayout = new javax.swing.GroupLayout(jp_Opciones);
        jp_Opciones.setLayout(jp_OpcionesLayout);
        jp_OpcionesLayout.setHorizontalGroup(
            jp_OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_OpcionesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jp_OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_Cargo, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(bt_Fin, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(bt_Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(bt_Proceso, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(bt_Separadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jp_OpcionesLayout.setVerticalGroup(
            jp_OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_OpcionesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(bt_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_Proceso, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(bt_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(bt_Fin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(bt_Separadores, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pn_Organigrama.setBackground(new java.awt.Color(255, 255, 255));
        pn_Organigrama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_OrganigramaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_OrganigramaLayout = new javax.swing.GroupLayout(pn_Organigrama);
        pn_Organigrama.setLayout(pn_OrganigramaLayout);
        pn_OrganigramaLayout.setHorizontalGroup(
            pn_OrganigramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        pn_OrganigramaLayout.setVerticalGroup(
            pn_OrganigramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel51.setText("Opciones del organigrama");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel52.setText("Elementos dentro del organigrama");

        bt_Cerrar_Organigrama.setText("Cerrar Ventana");
        bt_Cerrar_Organigrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Cerrar_OrganigramaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_OrganigramaLayout = new javax.swing.GroupLayout(jd_Organigrama.getContentPane());
        jd_Organigrama.getContentPane().setLayout(jd_OrganigramaLayout);
        jd_OrganigramaLayout.setHorizontalGroup(
            jd_OrganigramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_OrganigramaLayout.createSequentialGroup()
                .addGroup(jd_OrganigramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_OrganigramaLayout.createSequentialGroup()
                        .addGroup(jd_OrganigramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_OrganigramaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jp_Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_OrganigramaLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(bt_Cerrar_Organigrama)))
                        .addGap(113, 113, 113)
                        .addComponent(pn_Organigrama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_OrganigramaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel51)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel52)))
                .addContainerGap(323, Short.MAX_VALUE))
        );
        jd_OrganigramaLayout.setVerticalGroup(
            jd_OrganigramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_OrganigramaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jd_OrganigramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52))
                .addGap(18, 18, 18)
                .addGroup(jd_OrganigramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_Organigrama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_OrganigramaLayout.createSequentialGroup()
                        .addComponent(jp_Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(bt_Cerrar_Organigrama)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jmi_Abrir_Organigrama.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Abrir_Organigrama.setText("Abrir Organigrama");
        jmi_Abrir_Organigrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Abrir_OrganigramaActionPerformed(evt);
            }
        });
        pp_Organigrama.add(jmi_Abrir_Organigrama);

        jmi_Guardar_Organigrama.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Guardar_Organigrama.setText("Guardar Organigrama");
        jmi_Guardar_Organigrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Guardar_OrganigramaActionPerformed(evt);
            }
        });
        pp_Organigrama.add(jmi_Guardar_Organigrama);

        jmi_GuardarC_DF.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jmi_GuardarC_DF.setText("Guardar Como");
        jmi_GuardarC_DF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_GuardarC_DFActionPerformed(evt);
            }
        });
        pp_Organigrama.add(jmi_GuardarC_DF);

        jmi_Eliminar_Organigrama.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Eliminar_Organigrama.setText("Eliminar Organigrama");
        jmi_Eliminar_Organigrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Eliminar_OrganigramaActionPerformed(evt);
            }
        });
        pp_Organigrama.add(jmi_Eliminar_Organigrama);

        jmi_Imprimir_Orgranigama.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Imprimir_Orgranigama.setText("Imprimir Organigrama");
        jmi_Imprimir_Orgranigama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Imprimir_OrgranigamaActionPerformed(evt);
            }
        });
        pp_Organigrama.add(jmi_Imprimir_Orgranigama);

        jmi_Organigrama_JPG.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Organigrama_JPG.setText("Exportar como JPG");
        jmi_Organigrama_JPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Organigrama_JPGActionPerformed(evt);
            }
        });
        pp_Organigrama.add(jmi_Organigrama_JPG);

        jLabel53.setText("Selecione un Empleado a pagar");

        cb_Banco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el empleado" }));
        cb_Banco.setInheritsPopupMenu(true);
        cb_Banco.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_BancoItemStateChanged(evt);
            }
        });

        bt_Saldo_Banco.setText("Ver saldo del Banco");
        bt_Saldo_Banco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Saldo_BancoActionPerformed(evt);
            }
        });

        bt_Pagar_Empleados.setText("Pagar a Empleado");
        bt_Pagar_Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Pagar_EmpleadosActionPerformed(evt);
            }
        });

        jLabel60.setText("Correo del Empleado");

        jLabel61.setText("Saldo del empleado");

        javax.swing.GroupLayout jd_Conexcion_BancoLayout = new javax.swing.GroupLayout(jd_Conexcion_Banco.getContentPane());
        jd_Conexcion_Banco.getContentPane().setLayout(jd_Conexcion_BancoLayout);
        jd_Conexcion_BancoLayout.setHorizontalGroup(
            jd_Conexcion_BancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Conexcion_BancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Conexcion_BancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Conexcion_BancoLayout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addGap(18, 18, 18)
                        .addComponent(cb_Banco, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_Conexcion_BancoLayout.createSequentialGroup()
                        .addComponent(bt_Saldo_Banco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_Pagar_Empleados))
                    .addGroup(jd_Conexcion_BancoLayout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addGap(28, 28, 28)
                        .addComponent(tf_Saldo_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_Conexcion_BancoLayout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Correo_Empleado)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jd_Conexcion_BancoLayout.setVerticalGroup(
            jd_Conexcion_BancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Conexcion_BancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Conexcion_BancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(cb_Banco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jd_Conexcion_BancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_Correo_Empleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jd_Conexcion_BancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(tf_Saldo_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(jd_Conexcion_BancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Saldo_Banco)
                    .addComponent(bt_Pagar_Empleados))
                .addGap(28, 28, 28))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de administración de Recursos Humanos");

        tb_Sistema.setRollover(true);

        bt_Login_Sistema.setText("Login");
        bt_Login_Sistema.setFocusable(false);
        bt_Login_Sistema.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_Login_Sistema.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_Sistema.add(bt_Login_Sistema);

        bt_LogOut.setText("Logout");
        bt_LogOut.setFocusable(false);
        bt_LogOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_LogOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_Sistema.add(bt_LogOut);

        jm_Sistema.setText("Sistema");

        jmi_Login.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Login.setText("Login");
        jmi_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_LoginActionPerformed(evt);
            }
        });
        jm_Sistema.add(jmi_Login);

        jmi_LogOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jmi_LogOut.setText("LogOut");
        jmi_LogOut.setEnabled(false);
        jmi_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_LogOutActionPerformed(evt);
            }
        });
        jm_Sistema.add(jmi_LogOut);

        jmb_Opciones_Sistema.add(jm_Sistema);

        jm_Administrador.setText("Administrador");

        jm_Adminstar_Roles.setText("Administrar Roles");

        jm_Agregar_Role.setText("Agregar por Roles");

        jmi_Agregar_Gerente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Agregar_Gerente.setText("Agregar Gerente");
        jmi_Agregar_Gerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Agregar_GerenteActionPerformed(evt);
            }
        });
        jm_Agregar_Role.add(jmi_Agregar_Gerente);

        jmi_Agregar_Jefe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Agregar_Jefe.setText("Agregar Jefe");
        jmi_Agregar_Jefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Agregar_JefeActionPerformed(evt);
            }
        });
        jm_Agregar_Role.add(jmi_Agregar_Jefe);

        jmi_Agregar_Analista.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Agregar_Analista.setText("Agregar Analista");
        jmi_Agregar_Analista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Agregar_AnalistaActionPerformed(evt);
            }
        });
        jm_Agregar_Role.add(jmi_Agregar_Analista);

        jmi_Agregar_Recusos_Humanos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Agregar_Recusos_Humanos.setText("Agregar Personal de Recursos Humanos");
        jmi_Agregar_Recusos_Humanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Agregar_Recusos_HumanosActionPerformed(evt);
            }
        });
        jm_Agregar_Role.add(jmi_Agregar_Recusos_Humanos);

        jm_Adminstar_Roles.add(jm_Agregar_Role);

        jm_Listar_Role.setText("Listar por Roles");

        jmi_Listar_Gerentes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        jmi_Listar_Gerentes.setText("Listar Gerentes");
        jm_Listar_Role.add(jmi_Listar_Gerentes);

        jmi_Listar_Jefes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.ALT_MASK));
        jmi_Listar_Jefes.setText("Listar Jefes");
        jm_Listar_Role.add(jmi_Listar_Jefes);

        jmi_Listar_Analistas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Listar_Analistas.setText("Listar Analistas");
        jm_Listar_Role.add(jmi_Listar_Analistas);

        jmi_Listar_Recursos_Humanos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jmi_Listar_Recursos_Humanos.setText("Listar Personal de Recursos Humanos");
        jm_Listar_Role.add(jmi_Listar_Recursos_Humanos);

        jm_Adminstar_Roles.add(jm_Listar_Role);

        jm_Modificar_Role.setText("Modificar por Roles");

        jmi_Modificar_Gerentes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK));
        jmi_Modificar_Gerentes.setText("Modificar Gerentes");
        jmi_Modificar_Gerentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Modificar_GerentesActionPerformed(evt);
            }
        });
        jm_Modificar_Role.add(jmi_Modificar_Gerentes);

        jmi_Modificar_Jefes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.SHIFT_MASK));
        jmi_Modificar_Jefes.setText("Modificar Jefes");
        jmi_Modificar_Jefes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Modificar_JefesActionPerformed(evt);
            }
        });
        jm_Modificar_Role.add(jmi_Modificar_Jefes);

        jmi_Modificar_Analistas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        jmi_Modificar_Analistas.setText("Modificar Analistas");
        jmi_Modificar_Analistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Modificar_AnalistasActionPerformed(evt);
            }
        });
        jm_Modificar_Role.add(jmi_Modificar_Analistas);

        jmi_Modificar_Recursos_Humanos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        jmi_Modificar_Recursos_Humanos.setText("Modificar Personal de Recursos Humanos");
        jmi_Modificar_Recursos_Humanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Modificar_Recursos_HumanosActionPerformed(evt);
            }
        });
        jm_Modificar_Role.add(jmi_Modificar_Recursos_Humanos);

        jm_Adminstar_Roles.add(jm_Modificar_Role);

        jm_Eliminar_Role.setText("Eliminar por Roles");

        jmi_Eliminar_Gerente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Eliminar_Gerente.setText("Eliminar Gerente");
        jmi_Eliminar_Gerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Eliminar_GerenteActionPerformed(evt);
            }
        });
        jm_Eliminar_Role.add(jmi_Eliminar_Gerente);

        jmi_Eliminar_Jefe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Eliminar_Jefe.setText("Eliminar Jefe");
        jmi_Eliminar_Jefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Eliminar_JefeActionPerformed(evt);
            }
        });
        jm_Eliminar_Role.add(jmi_Eliminar_Jefe);

        jmi_Eliminar_Analista.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Eliminar_Analista.setText("Eliminar Analista");
        jmi_Eliminar_Analista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Eliminar_AnalistaActionPerformed(evt);
            }
        });
        jm_Eliminar_Role.add(jmi_Eliminar_Analista);

        jmi_Eliminar_Recursos_Humanos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Eliminar_Recursos_Humanos.setText("Eliminar Personal de Recursos Humanos");
        jmi_Eliminar_Recursos_Humanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Eliminar_Recursos_HumanosActionPerformed(evt);
            }
        });
        jm_Eliminar_Role.add(jmi_Eliminar_Recursos_Humanos);

        jm_Adminstar_Roles.add(jm_Eliminar_Role);

        jm_Administrador.add(jm_Adminstar_Roles);

        jm_Administracion_Compañia.setText("Administracion de Compañia");

        jm_Departamentos.setText("Administracion de Departamentos");

        jmi_Crear_Departamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Crear_Departamento.setText("Crear Departamento");
        jmi_Crear_Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Crear_DepartamentoActionPerformed(evt);
            }
        });
        jm_Departamentos.add(jmi_Crear_Departamento);

        jmi_Listar_Departamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Listar_Departamentos.setText("Listar Departamentos");
        jm_Departamentos.add(jmi_Listar_Departamentos);

        jm_Administracion_Compañia.add(jm_Departamentos);

        jmi_Administracion_Informacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Administracion_Informacion.setText("Administracion de Informacion");
        jmi_Administracion_Informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Administracion_InformacionActionPerformed(evt);
            }
        });
        jm_Administracion_Compañia.add(jmi_Administracion_Informacion);

        jm_Administrador.add(jm_Administracion_Compañia);

        jmi_Bitacora_Sistema.setText("Admisnistracion de la Bitacora del Sistema");
        jmi_Bitacora_Sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Bitacora_SistemaActionPerformed(evt);
            }
        });
        jm_Administrador.add(jmi_Bitacora_Sistema);

        jmi_Graficas.setText("Graficas Importantes del Sistema");
        jmi_Graficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_GraficasActionPerformed(evt);
            }
        });
        jm_Administrador.add(jmi_Graficas);

        jmi_Buzon_Empresa.setText("Buzon de empresa");
        jmi_Buzon_Empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Buzon_EmpresaActionPerformed(evt);
            }
        });
        jm_Administrador.add(jmi_Buzon_Empresa);

        jmb_Opciones_Sistema.add(jm_Administrador);

        jm_Recusos_Humanos.setText("Recusos Humanos");

        jmi_Contratacion.setText("Contratacion y reclutamiento");
        jmi_Contratacion.setEnabled(false);
        jm_Recusos_Humanos.add(jmi_Contratacion);

        jMenuItem1.setText("Buzon");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jm_Recusos_Humanos.add(jMenuItem1);

        jmi_Banco.setText("Conection con el Banco");
        jmi_Banco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_BancoActionPerformed(evt);
            }
        });
        jm_Recusos_Humanos.add(jmi_Banco);

        jmb_Opciones_Sistema.add(jm_Recusos_Humanos);

        jm_Analista.setText("Analista");
        jm_Analista.setEnabled(false);

        jm_Marcas_Entradas.setText("Marcaje de entradas");
        jm_Analista.add(jm_Marcas_Entradas);

        jmi_Permisos_Analistas.setText("Solicitar Permisos");
        jmi_Permisos_Analistas.setEnabled(false);
        jmi_Permisos_Analistas.setFocusable(true);
        jmi_Permisos_Analistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Permisos_AnalistasActionPerformed(evt);
            }
        });
        jm_Analista.add(jmi_Permisos_Analistas);

        jmi_Solicitar_Instancia_Analistas.setText("Solicitar Instancia");
        jmi_Solicitar_Instancia_Analistas.setEnabled(false);
        jmi_Solicitar_Instancia_Analistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Solicitar_Instancia_AnalistasActionPerformed(evt);
            }
        });
        jm_Analista.add(jmi_Solicitar_Instancia_Analistas);

        jmi_Solicitar_Vacaciones_Analistas.setText("Solicitar Vacaciones");
        jmi_Solicitar_Vacaciones_Analistas.setEnabled(false);
        jmi_Solicitar_Vacaciones_Analistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Solicitar_Vacaciones_AnalistasActionPerformed(evt);
            }
        });
        jm_Analista.add(jmi_Solicitar_Vacaciones_Analistas);

        jmi_Chat_Areas.setText("Chat de Areas");
        jm_Analista.add(jmi_Chat_Areas);

        jmi_Diagrama_Autorizaciones.setText("Diagrama de Autorizaciones");
        jm_Analista.add(jmi_Diagrama_Autorizaciones);

        jmi_Boleta_Pagos.setText("Boleta de Pagos");
        jm_Analista.add(jmi_Boleta_Pagos);

        jmi_Chat_Analistas.setText("Chat Empresa");
        jm_Analista.add(jmi_Chat_Analistas);

        jmb_Opciones_Sistema.add(jm_Analista);

        jm_Gerente.setText("Gerente");
        jm_Gerente.setEnabled(false);

        jmi_Permisos_Gerentes.setText("Solicitar Permisos");
        jmi_Permisos_Gerentes.setEnabled(false);
        jmi_Permisos_Gerentes.setFocusable(true);
        jmi_Permisos_Gerentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Permisos_GerentesActionPerformed(evt);
            }
        });
        jm_Gerente.add(jmi_Permisos_Gerentes);

        jmi_Solicitar_Instancia_Gerentes.setText("Solicitar Instancia");
        jmi_Solicitar_Instancia_Gerentes.setEnabled(false);
        jmi_Solicitar_Instancia_Gerentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Solicitar_Instancia_GerentesActionPerformed(evt);
            }
        });
        jm_Gerente.add(jmi_Solicitar_Instancia_Gerentes);

        jmi_Solicitar_Vacaciones_Gerentes.setText("Solicitar Vacaciones");
        jmi_Solicitar_Vacaciones_Gerentes.setEnabled(false);
        jmi_Solicitar_Vacaciones_Gerentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Solicitar_Vacaciones_GerentesActionPerformed(evt);
            }
        });
        jm_Gerente.add(jmi_Solicitar_Vacaciones_Gerentes);

        jmb_Opciones_Sistema.add(jm_Gerente);

        jm_Jefe.setText("Jefe");
        jm_Jefe.setEnabled(false);

        jm_Marcas_Entradas1.setText("Marcaje de entradas");
        jm_Jefe.add(jm_Marcas_Entradas1);

        jmi_Permisos_Jefes.setText("Solicitar Permisos");
        jmi_Permisos_Jefes.setEnabled(false);
        jmi_Permisos_Jefes.setFocusable(true);
        jmi_Permisos_Jefes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Permisos_JefesActionPerformed(evt);
            }
        });
        jm_Jefe.add(jmi_Permisos_Jefes);

        jmi_Solicitar_Instancia_Jefes.setText("Solicitar Instancia");
        jmi_Solicitar_Instancia_Jefes.setEnabled(false);
        jmi_Solicitar_Instancia_Jefes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Solicitar_Instancia_JefesActionPerformed(evt);
            }
        });
        jm_Jefe.add(jmi_Solicitar_Instancia_Jefes);

        jmi_Solicitar_Vacaciones_Jefes.setText("Solicitar Vacaciones");
        jmi_Solicitar_Vacaciones_Jefes.setEnabled(false);
        jmi_Solicitar_Vacaciones_Jefes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Solicitar_Vacaciones_JefesActionPerformed(evt);
            }
        });
        jm_Jefe.add(jmi_Solicitar_Vacaciones_Jefes);

        jmi_Organigrama.setText("Crear un organigrama");
        jmi_Organigrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_OrganigramaActionPerformed(evt);
            }
        });
        jm_Jefe.add(jmi_Organigrama);

        jmb_Opciones_Sistema.add(jm_Jefe);

        setJMenuBar(jmb_Opciones_Sistema);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tb_Sistema, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tb_Sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 324, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LoginActionPerformed
        // TODO add your handling code here:
        int ad = 0, an = 0, ge = 0, je = 0, re = 0;
        if (rb_Login_Administrador.isSelected()) {

            if (tf_Usuario.getText().equals("jason")
                    && pf_Contraseña.getText().equals("p123")) {
                jd_Login.dispose();
                tf_Usuario.setText("");
                pf_Contraseña.setText("");
                jm_Administrador.setEnabled(true);
                jmi_Login.setEnabled(false);
                jmi_LogOut.setEnabled(true);
                jd_Login.dispose();
            }
        }//Fin del if del administrador
        else if (rb_Login_Analista.isSelected() && analistas.size() > 0) {
            for (int i = 0; i < analistas.size(); i++) {
                if (((Analista) analistas.get(i)).getId().equals(tf_Usuario.getText())
                        && ((Analista) analistas.get(i)).getContrasenia().equals(pf_Contraseña.getText())) {
                    jd_Login.dispose();
                    tf_Usuario.setText("");
                    pf_Contraseña.setText("");
                    jm_Analista.setEnabled(true);
                    jmi_Login.setEnabled(false);
                    jmi_LogOut.setEnabled(true);
                    posa = i;
                    File archivo = null;
                    FileWriter fw = null;
                    BufferedWriter bw = null;
                    try {
                        archivo = new File("Analistas/Marcaje de entradas y salidas por usuarios/" + ((Analista) analistas.get(posa)).getId() + ".txt");
                        fw = new FileWriter(archivo, true);
                        bw = new BufferedWriter(fw);
                        bw.write("Entrada de Analista: " + ((Analista) analistas.get(posa)).getId() + " ;" + new Date());
                        bw.write("\n");
                        bw.newLine();
                        bw.flush();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                } else {
                    an++;
                }
            }//Fin del For que recorre el Arraylist de los analistas
            if (an > analistas.size()) {
                JOptionPane.showMessageDialog(jd_Login, "No hay un analista con esas credenciales");
            }//If auxiliar que ayuda con las credenciales

        } else if (rb_Login_Gerente.isSelected() && gerentes.size() > 0) {
            for (int i = 0; i < gerentes.size(); i++) {
                if (((Gerente) gerentes.get(i)).getId().equals(tf_Usuario.getText())
                        && ((Gerente) gerentes.get(i)).getContrasenia().equals(pf_Contraseña.getText())) {
                    jd_Login.dispose();
                    tf_Usuario.setText("");
                    pf_Contraseña.setText("");
                    jm_Gerente.setEnabled(true);
                    jmi_Login.setEnabled(false);
                    jmi_LogOut.setEnabled(true);
                    posg = i;
                    break;
                } else {
                    ad++;
                }
            }//Fin del For que recorre el Arraylist de los gerentes
            if (ge > gerentes.size()) {
                JOptionPane.showMessageDialog(jd_Login, "No hay un gerente con esas credenciales");
            }//If auxiliar que ayuda con las credenciales

        } else if (rb_Login_Jefe.isSelected()) {
            for (int i = 0; i < jefes.size(); i++) {
                if (((Jefe) jefes.get(i)).getId().equals(tf_Usuario.getText())
                        && ((Jefe) jefes.get(i)).getContrasenia().equals(pf_Contraseña.getText())) {
                    jd_Login.dispose();
                    tf_Usuario.setText("");
                    pf_Contraseña.setText("");
                    jm_Jefe.setEnabled(true);
                    jmi_Login.setEnabled(false);
                    jmi_LogOut.setEnabled(true);
                    posj = i;
                    File archivo = null;
                    FileWriter fw = null;
                    BufferedWriter bw = null;
                    try {
                        archivo = new File("Jefes/Marcaje de Salidas y Entradas/" + ((Jefe) jefes.get(posj)).getId() + ".txt");
                        fw = new FileWriter(archivo, true);
                        bw = new BufferedWriter(fw);
                        bw.write("Entrada de jefe: " + ((Jefe) jefes.get(posj)).getId() + " ;" + new Date());
                        bw.write("\n");
                        bw.newLine();
                        bw.flush();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                } else {
                    je++;
                }
            }//Fin del For que recorre el Arraylist de los jefes
            if (je > jefes.size()) {
                JOptionPane.showMessageDialog(jd_Login, "No hay un jefe con esas credenciales");
            }//If auxiliar que ayuda con las credenciales

        } else if (rb_Login_Recursos_Humanos.isSelected()) {
            for (int i = 0; i < recursos_humanos.size(); i++) {
                if (((Recursos_Humanos) recursos_humanos.get(i)).getId().equals(tf_Usuario.getText())
                        && ((Recursos_Humanos) recursos_humanos.get(i)).getContrasenia().equals(pf_Contraseña.getText())) {
                    jd_Login.dispose();
                    tf_Usuario.setText("");
                    pf_Contraseña.setText("");
                    jm_Recusos_Humanos.setEnabled(true);
                    jmi_Login.setEnabled(false);
                    jmi_LogOut.setEnabled(true);
                    posre = i;
                } else {
                    re++;
                }
            }//Fin del For que recorre el Arraylist de los de recusos humanos
            if (re > admins.size()) {
                JOptionPane.showMessageDialog(jd_Login, "No hay un personal de recusos humanos con esas credenciales");
            }//If auxiliar que ayuda con las credenciales
        }


    }//GEN-LAST:event_bt_LoginActionPerformed

    private void jmi_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_LoginActionPerformed
        // TODO add your handling code here:
        jd_Login.setModal(true);
        jd_Login.pack();
        jd_Login.setLocationRelativeTo(this);
        jd_Login.setVisible(true);
    }//GEN-LAST:event_jmi_LoginActionPerformed

    private void bt_Agregar_GerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Agregar_GerenteActionPerformed
        // TODO add your handling code here:
        try {
            if (tf_Correo_Gerente.getText().contains("@")) {

                gerentes.add(new Gerente(tf_Agregar_Gerente.getText(), pf_Agregar_Gerente.getText(), tf_Correo_Gerente.getText()));
                g = new Gerente(tf_Agregar_Gerente.getText(), pf_Agregar_Gerente.getText(), tf_Correo_Gerente.getText());
                ((Administrador) admins.get(0)).getRoles().add(g);

                //Comboboxes
                DefaultComboBoxModel mole = (DefaultComboBoxModel) cb_Gerentes.getModel();
                mole.addElement(g);
                DefaultComboBoxModel mole1 = (DefaultComboBoxModel) cb_Gerentes1.getModel();
                mole1.addElement(g);
                DefaultComboBoxModel mole2 = (DefaultComboBoxModel) cb_Gerentes2.getModel();
                mole1.addElement(g);
                cb_Gerentes.setModel(mole);
                cb_Gerentes1.setModel(mole1);
                cb_Gerentes2.setModel(mole2);
                JOptionPane.showMessageDialog(jd_Crear_Gerente, "Se creo el gerente correctamente");
                tf_Agregar_Gerente.setText("");
                pf_Agregar_Gerente.setText("");
                tf_Correo_Gerente.setText("");
                File archivo = null;
                FileWriter fw = null;
                BufferedWriter bw = null;
                try {
                    archivo = new File("./gerentes.txt");
                    //falso sobre escribe true resoeta
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write(g + "");
                    bw.write("\n");
                    bw.newLine();
                    bw.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(jd_Crear_Gerente, "Correo electronico no valido");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(jd_Crear_Gerente, "Ocurrio un error y no se logro agregar un gerente");
        }
    }//GEN-LAST:event_bt_Agregar_GerenteActionPerformed

    private void bt_Agregar_JefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Agregar_JefeActionPerformed
        // TODO add your handling code here:
        try {
            if (tf_Correo_Jefe.getText().contains("@")) {
                j = new Jefe(tf_Agregar_Jefe.getText(), pf_Agregar_Jefe.getText(), tf_Correo_Jefe.getText());
                ((Administrador) admins.get(0)).getRoles().add(j);
                jefes.add(j);
                //JLists
                DefaultListModel modelo = (DefaultListModel) jl_Jefes.getModel();
                modelo.addElement(j);
                jefes.add(j);
                jl_Jefes.setModel(modelo);

                //Comboboxes
                DefaultComboBoxModel mole = (DefaultComboBoxModel) cb_Jefes.getModel();
                mole.addElement(j);
                DefaultComboBoxModel mole1 = (DefaultComboBoxModel) cb_Jefes1.getModel();
                mole1.addElement(j);
                DefaultComboBoxModel mole2 = (DefaultComboBoxModel) cb_Jefes2.getModel();
                mole2.addElement(j);

                JOptionPane.showMessageDialog(jd_Crear_Jefe, "Se creo el jefe Correctamente");
                cb_Jefes.setModel(mole);
                cb_Jefes1.setModel(mole1);
                cb_Jefes2.setModel(mole2);

                tf_Agregar_Jefe.setText("");
                pf_Agregar_Jefe.setText("");
                tf_Correo_Jefe.setText("");
                File archivo = null;
                FileWriter fw = null;
                BufferedWriter bw = null;
                try {
                    archivo = new File("./jefes.txt");
                    //falso sobre escribe true resoeta
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write(j + "");
                    bw.write("\n");
                    bw.newLine();
                    bw.flush();
                } catch (Exception e) {
                }

                jd_Solicitar_Vacaciones_Analistas.dispose();
            } else {
                JOptionPane.showMessageDialog(jd_Crear_Jefe, "El correo electronico no es valido");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(jd_Crear_Jefe, "Ocurrio un problema y no se logro crear un jefe");
        }
    }//GEN-LAST:event_bt_Agregar_JefeActionPerformed

    private void bt_Agregar_AnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Agregar_AnalistaActionPerformed
        // TODO add your handling code here:
        try {
            if (tf_Correo_Analista.getText().contains("@")) {
                an = new Analista(tf_Agregar_Analista.getText(), pf_Agregar_Analista.getText(), tf_Correo_Analista.getText());
                ((Administrador) admins.get(0)).getRoles().add(an);
                analistas.add(an);
                DefaultListModel modelo = (DefaultListModel) jl_Analistas.getModel();
                modelo.addElement(an);
                analistas.add(an);
                jl_Analistas.setModel(modelo);

                //Comboboxes
                DefaultComboBoxModel mole = (DefaultComboBoxModel) cb_Analistas.getModel();
                mole.addElement(an);
                DefaultComboBoxModel mole1 = (DefaultComboBoxModel) cb_Analistas1.getModel();
                mole1.addElement(an);
                DefaultComboBoxModel mole2 = (DefaultComboBoxModel) cb_Analistas2.getModel();
                mole1.addElement(an);

                cb_Analistas.setModel(mole);
                cb_Analistas1.setModel(mole1);
                cb_Analistas2.setModel(mole2);
                JOptionPane.showMessageDialog(jd_Crear_Analista, "Se creo el analista Correctamente");
                tf_Agregar_Analista.setText("");
                pf_Agregar_Analista.setText("");
                File archivo = null;
                FileWriter fw = null;
                BufferedWriter bw = null;
                try {
                    archivo = new File("./analistas.txt");
                    //falso sobre escribe true resoeta
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write(an + ";");
                    bw.write("\n");
                    bw.newLine();
                    bw.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                JOptionPane.showMessageDialog(jd_Crear_Analista, "El correo electronico no es valido");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(jd_Crear_Analista, "Ocurrio un error y no se logro crear un analista");
        }
    }//GEN-LAST:event_bt_Agregar_AnalistaActionPerformed

    private void bt_Agregar_Recursos_HumanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Agregar_Recursos_HumanosActionPerformed
        // TODO add your handling code here:
        try {
            if (tf_Correo_Recursos_Humanos.getText().contains("@")) {
                re = new Recursos_Humanos(tf_Agregar_Recursos_Humanos.getText(), pf_Agregar_Recursos_Humanos.getText(), tf_Correo_Recursos_Humanos.getText());
                re.setSaldo(Float.parseFloat(JOptionPane.showInputDialog(jd_Crear_Recursos_Humanos, "Ingrese el saldo de recursos humanos")));
                DefaultListModel modelo = (DefaultListModel) jl_Recursos_Humanos.getModel();
                modelo.addElement(re);
                recursos_humanos.add(re);
                jl_Recursos_Humanos.setModel(modelo);

                //Comboboxes
                DefaultComboBoxModel mole = (DefaultComboBoxModel) cb_Recursos_Humanos.getModel();
                mole.addElement(re);
                DefaultComboBoxModel mole1 = (DefaultComboBoxModel) cb_Recursos_Humanos1.getModel();
                mole.addElement(re);
                DefaultComboBoxModel mole2 = (DefaultComboBoxModel) cb_Recursos_Humanos2.getModel();
                mole.addElement(re);
                personal.add(re);
                cb_Recursos_Humanos.setModel(mole);
                cb_Recursos_Humanos1.setModel(mole1);
                cb_Recursos_Humanos2.setModel(mole2);
                JOptionPane.showMessageDialog(jd_Crear_Recursos_Humanos, "Se creo un personal de recusos humanos correctamente");
                tf_Agregar_Recursos_Humanos.setText("");
                pf_Agregar_Recursos_Humanos.setText("");
                tf_Correo_Recursos_Humanos.setText("");
                File archivo = null;
                FileWriter fw = null;
                BufferedWriter bw = null;
                
                try {
                    archivo = new File("./Recursos Humanos.txt");
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write("Usuario: "+re.getId());
                    bw.write("\n");
                    bw.newLine();
                    bw.write("Correo: "+re.getCorreo());
                    bw.write("\n");
                    bw.newLine();
                    bw.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(jd_Crear_Recursos_Humanos, "El correo electronico no es valido");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(jd_Crear_Recursos_Humanos, "Ocurrio un error y no se logro crear un personal de recuros humanos");
        }
    }//GEN-LAST:event_bt_Agregar_Recursos_HumanosActionPerformed

    private void jmi_Agregar_GerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Agregar_GerenteActionPerformed
        // TODO add your handling code here:
        jd_Crear_Gerente.setModal(true);
        jd_Crear_Gerente.pack();
        jd_Crear_Gerente.setLocationRelativeTo(this);
        jd_Crear_Gerente.setVisible(true);
    }//GEN-LAST:event_jmi_Agregar_GerenteActionPerformed

    private void jmi_Agregar_JefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Agregar_JefeActionPerformed
        // TODO add your handling code here:
        jd_Crear_Jefe.setModal(true);
        jd_Crear_Jefe.pack();
        jd_Crear_Jefe.setLocationRelativeTo(this);
        jd_Crear_Jefe.setVisible(true);
    }//GEN-LAST:event_jmi_Agregar_JefeActionPerformed

    private void jmi_Agregar_AnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Agregar_AnalistaActionPerformed
        // TODO add your handling code here:
        jd_Crear_Analista.setModal(true);
        jd_Crear_Analista.pack();
        jd_Crear_Analista.setLocationRelativeTo(this);
        jd_Crear_Analista.setVisible(true);
    }//GEN-LAST:event_jmi_Agregar_AnalistaActionPerformed

    private void jmi_Agregar_Recusos_HumanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Agregar_Recusos_HumanosActionPerformed
        // TODO add your handling code here:
        jd_Crear_Recursos_Humanos.setModal(true);
        jd_Crear_Recursos_Humanos.pack();
        jd_Crear_Recursos_Humanos.setLocationRelativeTo(this);
        jd_Crear_Recursos_Humanos.setVisible(true);
    }//GEN-LAST:event_jmi_Agregar_Recusos_HumanosActionPerformed

    private void cb_GerentesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_GerentesItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 2) {
            Gerente g = (Gerente) cb_Gerentes.getSelectedItem();
            Object[] newrow = {g.getId(), g.getContrasenia(), g.getCorreo()};
            DefaultTableModel modelo = (DefaultTableModel) tabla_Gerentes.getModel();
            modelo.addRow(newrow);
            tabla_Gerentes.setModel(modelo);
        }
    }//GEN-LAST:event_cb_GerentesItemStateChanged

    private void cb_JefesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_JefesItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 2) {
            Jefe j = (Jefe) cb_Jefes.getSelectedItem();
            Object[] newrow = {j.getId(), j.getContrasenia(), j.getCorreo()};
            DefaultTableModel modelo = (DefaultTableModel) tabla_Jefes.getModel();
            modelo.addRow(newrow);
            tabla_Jefes.setModel(modelo);
        }
    }//GEN-LAST:event_cb_JefesItemStateChanged

    private void cb_AnalistasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_AnalistasItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 2) {
            Analista an = (Analista) cb_Analistas.getSelectedItem();
            Object[] newrow = {an.getId(), an.getContrasenia(), an.getCorreo()};
            DefaultTableModel modelo = (DefaultTableModel) tabla_Analistas.getModel();
            modelo.addRow(newrow);
            tabla_Analistas.setModel(modelo);
        }
    }//GEN-LAST:event_cb_AnalistasItemStateChanged

    private void cb_Recursos_HumanosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_Recursos_HumanosItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 2) {
            Recursos_Humanos re = (Recursos_Humanos) cb_Recursos_Humanos.getSelectedItem();
            Object[] newrow = {re.getId(), re.getContrasenia(), re.getCorreo()};
            DefaultTableModel modelo = (DefaultTableModel) tabla_Recursos_Humanos.getModel();
            modelo.addRow(newrow);
            tabla_Recursos_Humanos.setModel(modelo);
        }
    }//GEN-LAST:event_cb_Recursos_HumanosItemStateChanged

    private void cb_Gerentes1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_Gerentes1ItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 2) {
            Gerente g = (Gerente) cb_Gerentes1.getSelectedItem();
            Object[] newrow = {g.getId(), g.getContrasenia(), g.getCorreo()};
            DefaultTableModel modelo = (DefaultTableModel) tabla_Gerentes1.getModel();
            modelo.addRow(newrow);
            tabla_Gerentes1.setModel(modelo);
        }
    }//GEN-LAST:event_cb_Gerentes1ItemStateChanged

    private void bt_Modificar_GerentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Modificar_GerentesActionPerformed
        // TODO add your handling code here:
        if (tabla_Gerentes1.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabla_Gerentes1.getModel();

            //Modificar ArrayList
            ((Gerente) gerentes.get(tabla_Gerentes1.getSelectedRow())).setContrasenia(JOptionPane.showInputDialog(jd_Modificar_Gerentes, "Ingrese nueva Contraseña"));
            ((Gerente) gerentes.get(tabla_Gerentes1.getSelectedRow())).setId(JOptionPane.showInputDialog(jd_Modificar_Gerentes, "Ingrese nuevo usuario"));
            ((Gerente) gerentes.get(tabla_Gerentes1.getSelectedRow())).setCorreo(JOptionPane.showInputDialog(jd_Modificar_Gerentes, "Ingrese el nuevo correo electronico"));

            //Modificar en la tabla
            ((Gerente) modelo.getValueAt(tabla_Gerentes1.getSelectedRow(), 2)).setContrasenia(JOptionPane.showInputDialog(jd_Modificar_Gerentes, "Ingrese nuevo contraseña"));
            ((Gerente) modelo.getValueAt(tabla_Gerentes1.getSelectedRow(), 1)).setId(JOptionPane.showInputDialog(jd_Modificar_Gerentes, "Ingrese nuevo usuario"));
            ((Gerente) modelo.getValueAt(tabla_Gerentes1.getSelectedRow(), 3)).setCorreo(JOptionPane.showInputDialog(jd_Modificar_Gerentes, "Ingrese nuevo correo electronico"));
            File archivo = null;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                archivo = new File("./gerentes.txt");
                fw = new FileWriter(archivo, true);
                bw = new BufferedWriter(fw);
                bw.write(modelo + "");
                bw.write("\n");
                bw.newLine();
                bw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
            tabla_Gerentes1.setModel(modelo);
            jd_Modificar_Gerentes.dispose();
        }
    }//GEN-LAST:event_bt_Modificar_GerentesActionPerformed

    private void bt_Modificar_JefesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Modificar_JefesActionPerformed
        // TODO add your handling code here:
        if (tabla_Jefes1.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabla_Jefes1.getModel();

            //Modificar ArrayList
            ((Jefe) jefes.get(tabla_Jefes1.getSelectedRow())).setContrasenia(JOptionPane.showInputDialog(jd_Modificar_Jefes, "Ingrese nueva Contraseña"));
            ((Jefe) jefes.get(tabla_Jefes1.getSelectedRow())).setId(JOptionPane.showInputDialog(jd_Modificar_Jefes, "Ingrese nuevo usuario"));
            ((Jefe) jefes.get(tabla_Jefes1.getSelectedRow())).setCorreo(JOptionPane.showInputDialog(jd_Modificar_Jefes, "Ingrese nuevo correo"));

            //Modificar en la tabla
            ((Jefe) modelo.getValueAt(tabla_Jefes1.getSelectedRow(), 2)).setContrasenia(JOptionPane.showInputDialog(jd_Modificar_Jefes, "Ingrese nuevo contraseña"));
            ((Jefe) modelo.getValueAt(tabla_Jefes1.getSelectedRow(), 1)).setId(JOptionPane.showInputDialog(jd_Modificar_Jefes, "Ingrese nuevo usuario"));
            ((Jefe) modelo.getValueAt(tabla_Jefes1.getSelectedRow(), 3)).setId(JOptionPane.showInputDialog(jd_Modificar_Jefes, "Ingrese nuevo correo"));
            File archivo = null;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                archivo = new File("./jefes.txt");
                //falso sobre escribe true resoeta
                fw = new FileWriter(archivo, true);
                bw = new BufferedWriter(fw);
                bw.write(modelo + "");
                bw.write("\n");
                bw.newLine();
                bw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
            tabla_Jefes1.setModel(modelo);
            jd_Modificar_Jefes.dispose();
        }
    }//GEN-LAST:event_bt_Modificar_JefesActionPerformed

    private void cb_Jefes1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_Jefes1ItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 2) {
            Jefe j = (Jefe) cb_Jefes1.getSelectedItem();
            Object[] newrow = {j.getId(), j.getContrasenia(), j.getCorreo()};
            DefaultTableModel modelo = (DefaultTableModel) tabla_Jefes1.getModel();
            modelo.addRow(newrow);
            tabla_Jefes1.setModel(modelo);
        }
    }//GEN-LAST:event_cb_Jefes1ItemStateChanged

    private void bt_Modificar_AnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Modificar_AnalistaActionPerformed
        // TODO add your handling code here:
        if (tabla_Analistas1.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabla_Analistas1.getModel();

            //Modificar ArrayList
            ((Analista) analistas.get(tabla_Analistas1.getSelectedRow())).setContrasenia(JOptionPane.showInputDialog(jd_Modificar_Analistas, "Ingrese nueva Contraseña"));
            ((Analista) analistas.get(tabla_Analistas1.getSelectedRow())).setId(JOptionPane.showInputDialog(jd_Modificar_Analistas, "Ingrese nuevo usuario"));
            ((Analista) analistas.get(tabla_Analistas1.getSelectedRow())).setCorreo(JOptionPane.showInputDialog(jd_Modificar_Analistas, "Ingrese nuevo correo"));

            //Modificar en la tabla
            ((Analista) modelo.getValueAt(tabla_Analistas1.getSelectedRow(), 2)).setContrasenia(JOptionPane.showInputDialog(jd_Modificar_Analistas, "Ingrese nuevo contraseña"));
            ((Analista) modelo.getValueAt(tabla_Analistas1.getSelectedRow(), 1)).setId(JOptionPane.showInputDialog(jd_Modificar_Analistas, "Ingrese nuevo usuario"));
            ((Analista) modelo.getValueAt(tabla_Analistas1.getSelectedRow(), 3)).setCorreo(JOptionPane.showInputDialog(jd_Modificar_Analistas, "Ingrese nuevo correo"));

            File archivo = null;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                archivo = new File("./analistas.txt");
                //falso sobre escribe true resoeta
                fw = new FileWriter(archivo, true);
                bw = new BufferedWriter(fw);
                bw.write(modelo + "");
                bw.write("\n");
                bw.newLine();
                bw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
            tabla_Analistas1.setModel(modelo);
            jd_Modificar_Analistas.dispose();
        }
    }//GEN-LAST:event_bt_Modificar_AnalistaActionPerformed

    private void cb_Analistas1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_Analistas1ItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 2) {
            Analista an = (Analista) cb_Analistas1.getSelectedItem();
            Object[] newrow = {
                an.getId(),
                an.getContrasenia(), an.getCorreo()};
            DefaultTableModel modelo = (DefaultTableModel) tabla_Analistas1.getModel();
            modelo.addRow(newrow);
            tabla_Analistas1.setModel(modelo);
        }
    }//GEN-LAST:event_cb_Analistas1ItemStateChanged

    private void bt_Modificar_Recursos_HumanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Modificar_Recursos_HumanosActionPerformed
        // TODO add your handling code here:
        if (tabla_Recursos_Humanos1.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabla_Recursos_Humanos1.getModel();

            //Modificar ArrayList
            ((Recursos_Humanos) recursos_humanos.get(tabla_Recursos_Humanos1.getSelectedRow())).setContrasenia(JOptionPane.showInputDialog(jd_Modificar_Recursos_Humanos, "Ingrese nueva Contraseña"));
            ((Recursos_Humanos) recursos_humanos.get(tabla_Recursos_Humanos1.getSelectedRow())).setId(JOptionPane.showInputDialog(jd_Modificar_Recursos_Humanos, "Ingrese nuevo usuario"));
            ((Recursos_Humanos) recursos_humanos.get(tabla_Recursos_Humanos1.getSelectedRow())).setCorreo(JOptionPane.showInputDialog(jd_Modificar_Recursos_Humanos, "Ingrese nuevo correo"));

            //Modificar en la tabla
            ((Recursos_Humanos) modelo.getValueAt(tabla_Recursos_Humanos1.getSelectedRow(), 2)).setContrasenia(JOptionPane.showInputDialog(jd_Modificar_Recursos_Humanos, "Ingrese nuevo contraseña"));
            ((Recursos_Humanos) modelo.getValueAt(tabla_Recursos_Humanos1.getSelectedRow(), 1)).setId(JOptionPane.showInputDialog(jd_Modificar_Recursos_Humanos, "Ingrese nuevo usuario"));
            ((Recursos_Humanos) modelo.getValueAt(tabla_Recursos_Humanos1.getSelectedRow(), 3)).setCorreo(JOptionPane.showInputDialog(jd_Modificar_Recursos_Humanos, "Ingrese nuevo correo"));

            File archivo = null;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                archivo = new File("./recursos humanos.txt");
                //falso sobre escribe true resoeta
                fw = new FileWriter(archivo, true);
                bw = new BufferedWriter(fw);
                bw.write(modelo + "");
                bw.write("\n");
                bw.newLine();
                bw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
            tabla_Recursos_Humanos1.setModel(modelo);
            jd_Modificar_Recursos_Humanos.dispose();
        }
    }//GEN-LAST:event_bt_Modificar_Recursos_HumanosActionPerformed

    private void cb_Recursos_Humanos1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_Recursos_Humanos1ItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 2) {
            Recursos_Humanos an = (Recursos_Humanos) cb_Recursos_Humanos1.getSelectedItem();
            Object[] newrow = {an.getId(), an.getContrasenia(), an.getCorreo()};
            DefaultTableModel modelo = (DefaultTableModel) tabla_Recursos_Humanos1.getModel();
            modelo.addRow(newrow);
            tabla_Recursos_Humanos1.setModel(modelo);
        }
    }//GEN-LAST:event_cb_Recursos_Humanos1ItemStateChanged

    private void jmi_Modificar_GerentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Modificar_GerentesActionPerformed
        // TODO add your handling code here:
        jd_Modificar_Gerentes.setModal(true);
        jd_Modificar_Gerentes.pack();
        jd_Modificar_Gerentes.setLocationRelativeTo(this);
        jd_Modificar_Gerentes.setVisible(true);
    }//GEN-LAST:event_jmi_Modificar_GerentesActionPerformed

    private void jmi_Modificar_JefesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Modificar_JefesActionPerformed
        // TODO add your handling code here:
        jd_Modificar_Jefes.setModal(true);
        jd_Modificar_Jefes.pack();
        jd_Modificar_Jefes.setLocationRelativeTo(this);
        jd_Modificar_Jefes.setVisible(true);
    }//GEN-LAST:event_jmi_Modificar_JefesActionPerformed

    private void jmi_Modificar_AnalistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Modificar_AnalistasActionPerformed
        // TODO add your handling code here:
        jd_Modificar_Analistas.setModal(true);
        jd_Modificar_Analistas.pack();
        jd_Modificar_Analistas.setLocationRelativeTo(this);
        jd_Modificar_Analistas.setVisible(true);
    }//GEN-LAST:event_jmi_Modificar_AnalistasActionPerformed

    private void jmi_Modificar_Recursos_HumanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Modificar_Recursos_HumanosActionPerformed
        // TODO add your handling code here:
        jd_Modificar_Recursos_Humanos.setModal(true);
        jd_Modificar_Recursos_Humanos.pack();
        jd_Modificar_Recursos_Humanos.setLocationRelativeTo(this);
        jd_Modificar_Recursos_Humanos.setVisible(true);
    }//GEN-LAST:event_jmi_Modificar_Recursos_HumanosActionPerformed

    private void bt_Volver_GerentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Volver_GerentesActionPerformed
        // TODO add your handling code here:
        jd_Listar_Gerentes.dispose();
    }//GEN-LAST:event_bt_Volver_GerentesActionPerformed

    private void bt_Volver_JefesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Volver_JefesActionPerformed
        // TODO add your handling code here:
        jd_Listar_Jefes.dispose();
    }//GEN-LAST:event_bt_Volver_JefesActionPerformed

    private void bt_Volver_AnalistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Volver_AnalistasActionPerformed
        // TODO add your handling code here:
        jd_Listar_Analistas.dispose();
    }//GEN-LAST:event_bt_Volver_AnalistasActionPerformed

    private void bt_Volver_Recusos_HumanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Volver_Recusos_HumanosActionPerformed
        // TODO add your handling code here:
        jd_Listar_Recursos_Humanos.dispose();
    }//GEN-LAST:event_bt_Volver_Recusos_HumanosActionPerformed

    private void bt_Modificar_Eliminar_Gerentes_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Modificar_Eliminar_Gerentes_tablaActionPerformed
        // TODO add your handling code here:
        if (tabla_Gerentes1.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabla_Gerentes1.getModel();
            modelo.removeRow(tabla_Gerentes1.getSelectedRow());
            tabla_Gerentes.setModel(modelo);
            tabla_Gerentes1.setModel(modelo);
            tabla_Gerentes2.setModel(modelo);
        }
    }//GEN-LAST:event_bt_Modificar_Eliminar_Gerentes_tablaActionPerformed

    private void bt_Modificar_Limpiar_Gerentes_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Modificar_Limpiar_Gerentes_tablaActionPerformed
        // TODO add your handling code here:
        tabla_Gerentes1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Usuario", "Contraseña", "Correo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }//GEN-LAST:event_bt_Modificar_Limpiar_Gerentes_tablaActionPerformed

    private void bt_Modificar_Volver_Gerentes_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Modificar_Volver_Gerentes_tablaActionPerformed
        // TODO add your handling code here:
        jd_Modificar_Gerentes.dispose();
    }//GEN-LAST:event_bt_Modificar_Volver_Gerentes_tablaActionPerformed

    private void bt_Modificar_Eliminar_Jefes_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Modificar_Eliminar_Jefes_tablaActionPerformed
        // TODO add your handling code here:
        if (tabla_Jefes1.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabla_Jefes1.getModel();
            modelo.removeRow(tabla_Jefes1.getSelectedRow());
            tabla_Jefes.setModel(modelo);
            tabla_Jefes1.setModel(modelo);
            tabla_Jefes2.setModel(modelo);
        }
    }//GEN-LAST:event_bt_Modificar_Eliminar_Jefes_tablaActionPerformed

    private void bt_Modificar_Limpiar_Jefes_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Modificar_Limpiar_Jefes_tablaActionPerformed
        // TODO add your handling code here:
        tabla_Jefes1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Usuario", "Contraseña", "Correo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }//GEN-LAST:event_bt_Modificar_Limpiar_Jefes_tablaActionPerformed

    private void bt_Modificar_Volver_Jefes_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Modificar_Volver_Jefes_tablaActionPerformed
        // TODO add your handling code here:
        jd_Modificar_Jefes.dispose();
    }//GEN-LAST:event_bt_Modificar_Volver_Jefes_tablaActionPerformed

    private void bt_Modificar_Eliminar_Analista_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Modificar_Eliminar_Analista_tablaActionPerformed
        // TODO add your handling code here:
        if (tabla_Analistas1.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabla_Analistas1.getModel();
            modelo.removeRow(tabla_Analistas1.getSelectedRow());
            tabla_Analistas.setModel(modelo);
            tabla_Analistas1.setModel(modelo);
            tabla_Analistas2.setModel(modelo);
        }
    }//GEN-LAST:event_bt_Modificar_Eliminar_Analista_tablaActionPerformed

    private void bt_Modificar_Limpiar_Analistas_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Modificar_Limpiar_Analistas_tablaActionPerformed
        // TODO add your handling code here:
        tabla_Analistas1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Usuario", "Contraseña", "Correo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }//GEN-LAST:event_bt_Modificar_Limpiar_Analistas_tablaActionPerformed

    private void bt_Modificar_Volver_Analistas_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Modificar_Volver_Analistas_tablaActionPerformed
        // TODO add your handling code here:
        jd_Modificar_Analistas.dispose();
    }//GEN-LAST:event_bt_Modificar_Volver_Analistas_tablaActionPerformed

    private void bt_Modificar_Eliminar_Recusos_Humanos_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Modificar_Eliminar_Recusos_Humanos_tablaActionPerformed
        // TODO add your handling code here:
        if (tabla_Recursos_Humanos.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabla_Recursos_Humanos.getModel();
            modelo.removeRow(tabla_Recursos_Humanos.getSelectedRow());
            tabla_Recursos_Humanos.setModel(modelo);
            tabla_Recursos_Humanos1.setModel(modelo);
            tabla_Recursos_Humanos2.setModel(modelo);
        }
    }//GEN-LAST:event_bt_Modificar_Eliminar_Recusos_Humanos_tablaActionPerformed

    private void bt_Modificar_Limpiar_Recursos_Humanos_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Modificar_Limpiar_Recursos_Humanos_tablaActionPerformed
        // TODO add your handling code here:
        tabla_Recursos_Humanos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Usuario", "Contraseña", "Correo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }//GEN-LAST:event_bt_Modificar_Limpiar_Recursos_Humanos_tablaActionPerformed

    private void bt_Modificar_Volver_Recusros_Humanos_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Modificar_Volver_Recusros_Humanos_tablaActionPerformed
        // TODO add your handling code here:
        jd_Modificar_Recursos_Humanos.dispose();
    }//GEN-LAST:event_bt_Modificar_Volver_Recusros_Humanos_tablaActionPerformed

    private void cb_Gerentes2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_Gerentes2ItemStateChanged
        // TODO add your handling code here:
        try {
            if (evt.getStateChange() == 2) {
                Gerente j = (Gerente) cb_Gerentes2.getSelectedItem();
                Object[] newrow = {j.getId(), j.getContrasenia(), j.getCorreo()};
                DefaultTableModel modelo = (DefaultTableModel) tabla_Gerentes2.getModel();
                modelo.addRow(newrow);
                tabla_Gerentes2.setModel(modelo);
                DefaultComboBoxModel mole2 = (DefaultComboBoxModel) cb_Gerentes2.getModel();
                mole2.removeElementAt(cb_Gerentes2.getSelectedIndex());
                cb_Gerentes.setModel(mole2);
                cb_Gerentes1.setModel(mole2);
                cb_Gerentes2.setModel(mole2);
                gerentes.remove(cb_Gerentes2.getSelectedIndex());
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(jd_Eliminar_Gerentes, "Ocurrio un error y no se elimino el gerente");
        }
    }//GEN-LAST:event_cb_Gerentes2ItemStateChanged

    private void bt_Eliminar_GerentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Eliminar_GerentesActionPerformed
        // TODO add your handling code here:
        if (tabla_Gerentes2.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabla_Gerentes2.getModel();
            modelo.removeRow(tabla_Gerentes2.getSelectedRow());
            tabla_Gerentes2.setModel(modelo);
            tabla_Gerentes.setModel(modelo);
            tabla_Gerentes1.setModel(modelo);
        }
    }//GEN-LAST:event_bt_Eliminar_GerentesActionPerformed

    private void bt_Limpiar_Eliminar_GerentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Limpiar_Eliminar_GerentesActionPerformed
        // TODO add your handling code here:
        tabla_Gerentes2.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Usuario", "Contraseña", "Correo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }//GEN-LAST:event_bt_Limpiar_Eliminar_GerentesActionPerformed

    private void bt_Eliminar_Volver_GerentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Eliminar_Volver_GerentesActionPerformed
        // TODO add your handling code here:
        jd_Eliminar_Gerentes.dispose();
    }//GEN-LAST:event_bt_Eliminar_Volver_GerentesActionPerformed

    private void bt_Eliminar_JefesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Eliminar_JefesActionPerformed
        // TODO add your handling code here:
        if (tabla_Jefes2.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabla_Jefes2.getModel();
            modelo.removeRow(tabla_Jefes2.getSelectedRow());
            tabla_Jefes.setModel(modelo);
            tabla_Jefes1.setModel(modelo);
            tabla_Jefes2.setModel(modelo);
        }
    }//GEN-LAST:event_bt_Eliminar_JefesActionPerformed

    private void bt_Limpiar_Eliminar_JefesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Limpiar_Eliminar_JefesActionPerformed
        // TODO add your handling code here:
        tabla_Jefes2.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Usuario", "Contraseña", "Correo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }//GEN-LAST:event_bt_Limpiar_Eliminar_JefesActionPerformed

    private void bt_Eliminar_Volver_JefesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Eliminar_Volver_JefesActionPerformed
        // TODO add your handling code here:
        jd_Eliminar_Jefes.dispose();
    }//GEN-LAST:event_bt_Eliminar_Volver_JefesActionPerformed

    private void cb_Jefes2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_Jefes2ItemStateChanged
        // TODO add your handling code here:
        try {
            if (evt.getStateChange() == 2) {
                Jefe j = (Jefe) cb_Jefes2.getSelectedItem();
                Object[] newrow = {j.getId(), j.getContrasenia(), j.getCorreo()};
                DefaultTableModel modelo = (DefaultTableModel) cb_Jefes2.getModel();
                modelo.addRow(newrow);
                tabla_Jefes2.setModel(modelo);
                DefaultComboBoxModel mole2 = (DefaultComboBoxModel) cb_Jefes2.getModel();
                mole2.removeElementAt(cb_Jefes2.getSelectedIndex());
                cb_Jefes.setModel(mole2);
                cb_Jefes1.setModel(mole2);
                cb_Jefes2.setModel(mole2);
                jefes.remove(cb_Jefes2.getSelectedIndex());
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(jd_Eliminar_Jefes, "Ocurrio un error y no se elimino el jefe");
        }
    }//GEN-LAST:event_cb_Jefes2ItemStateChanged

    private void bt_Eliminar_AnalistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Eliminar_AnalistasActionPerformed
        // TODO add your handling code here:
        if (tabla_Analistas2.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabla_Analistas2.getModel();
            modelo.removeRow(tabla_Analistas2.getSelectedRow());
            tabla_Analistas.setModel(modelo);
            tabla_Analistas1.setModel(modelo);
            tabla_Analistas2.setModel(modelo);
        }
    }//GEN-LAST:event_bt_Eliminar_AnalistasActionPerformed

    private void bt_Limpiar_Eliminar_AnalistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Limpiar_Eliminar_AnalistasActionPerformed
        // TODO add your handling code here:
        tabla_Analistas2.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Usuario", "Contraseña", "Correo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }//GEN-LAST:event_bt_Limpiar_Eliminar_AnalistasActionPerformed

    private void bt_Eliminar_Volver_AnalistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Eliminar_Volver_AnalistasActionPerformed
        // TODO add your handling code here:
        jd_Eliminar_Analistas.dispose();
    }//GEN-LAST:event_bt_Eliminar_Volver_AnalistasActionPerformed

    private void cb_Analistas2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_Analistas2ItemStateChanged
        // TODO add your handling code here:
        try {
            if (evt.getStateChange() == 2) {
                Analista j = (Analista) cb_Analistas2.getSelectedItem();
                Object[] newrow = {j.getId(), j.getContrasenia(), j.getCorreo()};
                DefaultTableModel modelo = (DefaultTableModel) cb_Analistas2.getModel();
                modelo.addRow(newrow);
                tabla_Analistas2.setModel(modelo);
                DefaultComboBoxModel mole2 = (DefaultComboBoxModel) cb_Analistas2.getModel();
                mole2.removeElementAt(cb_Analistas2.getSelectedIndex());
                cb_Analistas.setModel(mole2);
                cb_Analistas1.setModel(mole2);
                cb_Analistas2.setModel(mole2);
                analistas.remove(cb_Analistas2.getSelectedIndex());
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(jd_Eliminar_Analistas, "Ocurrio un error y no se elimino el jefe");
        }
    }//GEN-LAST:event_cb_Analistas2ItemStateChanged

    private void bt_Eliminar_Recursos_HumanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Eliminar_Recursos_HumanosActionPerformed
        // TODO add your handling code here:
        if (tabla_Recursos_Humanos2.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabla_Recursos_Humanos2.getModel();
            modelo.removeRow(tabla_Recursos_Humanos2.getSelectedRow());
            tabla_Recursos_Humanos.setModel(modelo);
            tabla_Recursos_Humanos.setModel(modelo);
            tabla_Recursos_Humanos2.setModel(modelo);
        }
    }//GEN-LAST:event_bt_Eliminar_Recursos_HumanosActionPerformed

    private void bt_Limpiar_Eliminar_AdminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Limpiar_Eliminar_AdminsActionPerformed
        // TODO add your handling code here:
        tabla_Recursos_Humanos2.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Usuario", "Contraseña", "Correo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }//GEN-LAST:event_bt_Limpiar_Eliminar_AdminsActionPerformed

    private void bt_Eliminar_Volver_AdminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Eliminar_Volver_AdminsActionPerformed
        // TODO add your handling code here:
        jd_Eliminar_Recursos_Humanos.dispose();
    }//GEN-LAST:event_bt_Eliminar_Volver_AdminsActionPerformed

    private void cb_Recursos_Humanos2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_Recursos_Humanos2ItemStateChanged
        // TODO add your handling code here:
        try {
            if (evt.getStateChange() == 2) {
                Recursos_Humanos j = (Recursos_Humanos) cb_Recursos_Humanos2.getSelectedItem();
                Object[] newrow = {j.getId(), j.getContrasenia(), j.getCorreo()};
                DefaultTableModel modelo = (DefaultTableModel) tabla_Recursos_Humanos1.getModel();
                modelo.addRow(newrow);
                tabla_Recursos_Humanos1.setModel(modelo);
                DefaultComboBoxModel mole2 = (DefaultComboBoxModel) cb_Recursos_Humanos2.getModel();
                mole2.removeElementAt(cb_Recursos_Humanos2.getSelectedIndex());
                cb_Recursos_Humanos.setModel(mole2);
                cb_Recursos_Humanos1.setModel(mole2);
                cb_Recursos_Humanos2.setModel(mole2);
                recursos_humanos.remove(cb_Recursos_Humanos2.getSelectedIndex());
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(jd_Eliminar_Recursos_Humanos, "Ocurrio un error y no se elimino el personal de recursos humanos");
        }
    }//GEN-LAST:event_cb_Recursos_Humanos2ItemStateChanged

    private void jmi_Eliminar_GerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Eliminar_GerenteActionPerformed
        // TODO add your handling code here:
        jd_Eliminar_Gerentes.setModal(true);
        jd_Eliminar_Gerentes.pack();
        jd_Eliminar_Gerentes.setLocationRelativeTo(this);
        jd_Eliminar_Gerentes.setVisible(true);
    }//GEN-LAST:event_jmi_Eliminar_GerenteActionPerformed

    private void jmi_Eliminar_JefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Eliminar_JefeActionPerformed
        // TODO add your handling code here:
        jd_Eliminar_Jefes.setModal(true);
        jd_Eliminar_Jefes.pack();
        jd_Eliminar_Jefes.setLocationRelativeTo(this);
        jd_Eliminar_Jefes.setVisible(true);
    }//GEN-LAST:event_jmi_Eliminar_JefeActionPerformed

    private void jmi_Eliminar_AnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Eliminar_AnalistaActionPerformed
        // TODO add your handling code here:
        jd_Eliminar_Analistas.setModal(true);
        jd_Eliminar_Analistas.pack();
        jd_Eliminar_Analistas.setLocationRelativeTo(this);
        jd_Eliminar_Analistas.setVisible(true);
    }//GEN-LAST:event_jmi_Eliminar_AnalistaActionPerformed

    private void jmi_Eliminar_Recursos_HumanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Eliminar_Recursos_HumanosActionPerformed
        // TODO add your handling code here:
        jd_Eliminar_Recursos_Humanos.setModal(true);
        jd_Eliminar_Recursos_Humanos.pack();
        jd_Eliminar_Recursos_Humanos.setLocationRelativeTo(this);
        jd_Eliminar_Recursos_Humanos.setVisible(true);
    }//GEN-LAST:event_jmi_Eliminar_Recursos_HumanosActionPerformed

    private void bt_Limpiar_Listar_GerentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Limpiar_Listar_GerentesActionPerformed
        // TODO add your handling code here:
        tabla_Gerentes.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Usuario", "Contraseña", "Correo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }//GEN-LAST:event_bt_Limpiar_Listar_GerentesActionPerformed

    private void bt_Eliminar_Listar_GerenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Eliminar_Listar_GerenterActionPerformed
        // TODO add your handling code here:
        if (tabla_Gerentes.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabla_Gerentes.getModel();
            modelo.removeRow(tabla_Gerentes.getSelectedRow());
            tabla_Gerentes.setModel(modelo);
            tabla_Gerentes1.setModel(modelo);
            tabla_Gerentes2.setModel(modelo);
        }
    }//GEN-LAST:event_bt_Eliminar_Listar_GerenterActionPerformed

    private void bt_Limpiar_Listar_JefesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Limpiar_Listar_JefesActionPerformed
        // TODO add your handling code here:
        tabla_Jefes.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Usuario", "Contraseña", "Correo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }//GEN-LAST:event_bt_Limpiar_Listar_JefesActionPerformed

    private void bt_Eliminar_Listar_JefesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Eliminar_Listar_JefesActionPerformed
        // TODO add your handling code here:
        if (tabla_Jefes.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabla_Jefes.getModel();
            modelo.removeRow(tabla_Jefes.getSelectedRow());
            tabla_Jefes.setModel(modelo);
            tabla_Jefes1.setModel(modelo);
            tabla_Jefes2.setModel(modelo);
        }
    }//GEN-LAST:event_bt_Eliminar_Listar_JefesActionPerformed

    private void bt_Limpiar_Listar_AnalistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Limpiar_Listar_AnalistasActionPerformed
        // TODO add your handling code here:
        tabla_Analistas.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Usuario", "Contraseña", "Correo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }//GEN-LAST:event_bt_Limpiar_Listar_AnalistasActionPerformed

    private void bt_Eliminar_Listar_AnalistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Eliminar_Listar_AnalistasActionPerformed
        // TODO add your handling code here:
        if (tabla_Analistas.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabla_Analistas.getModel();
            modelo.removeRow(tabla_Analistas.getSelectedRow());
            tabla_Analistas.setModel(modelo);
            tabla_Analistas1.setModel(modelo);
            tabla_Analistas2.setModel(modelo);
        }
    }//GEN-LAST:event_bt_Eliminar_Listar_AnalistasActionPerformed

    private void bt_Limpiar_Listar_AdminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Limpiar_Listar_AdminsActionPerformed
        // TODO add your handling code here:
        tabla_Recursos_Humanos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Usuario", "Contraseña", "Correo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }//GEN-LAST:event_bt_Limpiar_Listar_AdminsActionPerformed

    private void bt_Eliminar_Listar_Recursos_HumanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Eliminar_Listar_Recursos_HumanosActionPerformed
        // TODO add your handling code here:
        if (tabla_Recursos_Humanos.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabla_Recursos_Humanos.getModel();
            modelo.removeRow(tabla_Recursos_Humanos.getSelectedRow());
            tabla_Recursos_Humanos.setModel(modelo);
            tabla_Recursos_Humanos1.setModel(modelo);
            tabla_Recursos_Humanos2.setModel(modelo);
        }
    }//GEN-LAST:event_bt_Eliminar_Listar_Recursos_HumanosActionPerformed

    private void bt_Actualizar_Info_CompañiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Actualizar_Info_CompañiaActionPerformed
        // TODO add your handling code here:
        e = new Empresa(tf_Nombre_Compañia.getText(), ta_Mision_Compañia.getText(), ta_Vision_Compañia.getText(), ta_Objetivos_Compañia.getText(), ta_Politicas_Compañia.getText(), tf_Correo_Electronico_Compañia.getText(), ta_Direccion_Exacta_Compañia.getText(), tf_nombre_Director.getText());
        e.getTelefonos().add(ta_Telefonos_Compañia.getText());
        e.setDireccion(tf_nombre_Director.getText());
        tf_Nombre_Compañia.setText("");
        ta_Mision_Compañia.setText("");
        ta_Vision_Compañia.setText("");
        ta_Objetivos_Compañia.setText("");
        ta_Politicas_Compañia.setText("");
        tf_Correo_Electronico_Compañia.setText("");
        ta_Direccion_Exacta_Compañia.setText("");
        ta_Telefonos_Compañia.setText("");
        tf_nombre_Director.setText("");
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("/empresa.txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(e + "");
            bw.write("\n");
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        tf_Nombre_Departamento.setText("");
    }//GEN-LAST:event_bt_Actualizar_Info_CompañiaActionPerformed

    private void bt_Modificar_Info_CompañiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Modificar_Info_CompañiaActionPerformed
        // TODO add your handling code here:
        e.setNombre(tf_Nombre_Compañia.getText());
        e.setCorreo(tf_Correo_Electronico_Compañia.getText());
        e.setDireccion(ta_Direccion_Exacta_Compañia.getText());
        e.setMision(ta_Mision_Compañia.getText());
        e.setObjectivos(ta_Objetivos_Compañia.getText());
        e.setPoliticas(ta_Politicas_Compañia.getText());
        e.getTelefonos().add(ta_Telefonos_Compañia.getText());
        e.setVision(ta_Vision_Compañia.getText());
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("/empresa.txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(e + "");
            bw.write("\n");
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        tf_Nombre_Departamento.setText("");
    }//GEN-LAST:event_bt_Modificar_Info_CompañiaActionPerformed

    private void bt_Obtener_Info_CompañiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Obtener_Info_CompañiaActionPerformed
        // TODO add your handling code here:
        tf_Nombre_Compañia.setText(e.getNombre());
        ta_Mision_Compañia.setText(e.getMision());
        ta_Vision_Compañia.setText(e.getVision());
        ta_Objetivos_Compañia.setText(e.getObjectivos());
        ta_Objetivos_Compañia.append("\n");
        ta_Politicas_Compañia.setText(e.getPoliticas());
        ta_Politicas_Compañia.append("\n");
        tf_Correo_Electronico_Compañia.setText(e.getCorreo());
        ta_Direccion_Exacta_Compañia.setText(e.getDireccion());
        ta_Direccion_Exacta_Compañia.append("\n");
        ta_Telefonos_Compañia.setText(e.getTelefonos().get(0));
        ta_Telefonos_Compañia.append("\n");

    }//GEN-LAST:event_bt_Obtener_Info_CompañiaActionPerformed

    private void bt_Crear_DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Crear_DepartamentoActionPerformed
        // TODO add your handling code here:
        jd_Crear_Departamentos.dispose();
        DefaultListModel modelo = (DefaultListModel) jl_Departamentos.getModel();

        DefaultListModel modelo1 = (DefaultListModel) jl_Departamentos1.getModel();
        jl_Departamentos1.setModel(modelo1);
        d = new Departamento(tf_Nombre_Departamento.getText());
        modelo.addElement(d);
        depa.add(d);
        modelo1.addElement(d);
        jl_Departamentos.setModel(modelo);
        jl_Departamentos1.setModel(modelo1);
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("./departamentos.txt");
            //falso sobre escribe true resoeta
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(d + "");
            bw.write("\n");
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        tf_Nombre_Departamento.setText("");
    }//GEN-LAST:event_bt_Crear_DepartamentoActionPerformed

    private void bt_Volver_DepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Volver_DepartamentosActionPerformed
        // TODO add your handling code here:
        jd_Listar_Departamentos.dispose();
    }//GEN-LAST:event_bt_Volver_DepartamentosActionPerformed

    private void bt_Eliminar_DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Eliminar_DepartamentoActionPerformed
        // TODO add your handling code here:
        jl_Departamentos.remove(jl_Departamentos.getSelectedIndex());
    }//GEN-LAST:event_bt_Eliminar_DepartamentoActionPerformed

    private void bt_Solicitar_VacaionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Solicitar_VacaionesActionPerformed
        // TODO add your handling code here:
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("Analistas/Solicitudes de vacaciones/" + ((Analista) analistas.get(posa)).getCorreo() + ".txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(ta_Solicitud_Vacaciones.getText());
            bw.write("\n");
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        File archivo2 = null;
        FileWriter fw2 = null;
        BufferedWriter bw2 = null;
        try {

            archivo = new File("Gerentes/" + an.getJ() + ".txt");
            fw2 = new FileWriter(archivo, true);
            bw2 = new BufferedWriter(fw);
            bw2.write(ta_Solicitud_Vacaciones.getText());
            bw2.write("\n");
            bw2.newLine();
            bw2.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        jd_Solicitar_Vacaciones_Analistas.dispose();
    }//GEN-LAST:event_bt_Solicitar_VacaionesActionPerformed

    private void jmi_Solicitar_Vacaciones_AnalistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Solicitar_Vacaciones_AnalistasActionPerformed
        // TODO add your handling code here:
        jd_Solicitar_Vacaciones_Analistas.setModal(true);
        jd_Solicitar_Vacaciones_Analistas.pack();
        jd_Solicitar_Vacaciones_Analistas.setLocationRelativeTo(this);
        jd_Solicitar_Vacaciones_Analistas.setVisible(true);
    }//GEN-LAST:event_jmi_Solicitar_Vacaciones_AnalistasActionPerformed

    private void jmi_Permisos_AnalistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Permisos_AnalistasActionPerformed
        // TODO add your handling code here:
        jd_Solicitud_Permisos_Analistas.setModal(true);
        jd_Solicitud_Permisos_Analistas.pack();
        jd_Solicitud_Permisos_Analistas.setLocationRelativeTo(this);
        jd_Solicitud_Permisos_Analistas.setVisible(true);
    }//GEN-LAST:event_jmi_Permisos_AnalistasActionPerformed

    private void bt_Solicitar_PermisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Solicitar_PermisosActionPerformed
        // TODO add your handling code here:
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("Analistas/Solicitudes de Permisos/" + ((Analista) analistas.get(posa)).getCorreo() + ".txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(ta_Solicitud_Vacaciones.getText());
            bw.write("\n");
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        File archivo2 = null;
        FileWriter fw2 = null;
        BufferedWriter bw2 = null;
        try {

            archivo = new File("Gerentes/" + an.getJ() + ".txt");
            fw2 = new FileWriter(archivo, true);
            bw2 = new BufferedWriter(fw);
            bw2.write(ta_Solicitud_Vacaciones.getText());
            bw2.write("\n");
            bw2.newLine();
            bw2.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        jd_Solicitud_Permisos_Analistas.dispose();
    }//GEN-LAST:event_bt_Solicitar_PermisosActionPerformed

    private void bt_Solicitar_InsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Solicitar_InsistenciaActionPerformed
        // TODO add your handling code here:
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("Analistas/Solicitudes de insistencia/" + ((Analista) analistas.get(posa)).getCorreo() + ".txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(ta_Solicitud_Insistencias.getText());
            bw.write("\n");
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        File archivo2 = null;
        FileWriter fw2 = null;
        BufferedWriter bw2 = null;
        try {

            archivo = new File("Gerentes/" + an.getJ() + ".txt");
            fw2 = new FileWriter(archivo, true);
            bw2 = new BufferedWriter(fw);
            bw2.write(ta_Solicitud_Vacaciones.getText());
            bw2.write("\n");
            bw2.newLine();
            bw2.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        jd_Solicitud_Insistencias_Analistas.dispose();
    }//GEN-LAST:event_bt_Solicitar_InsistenciaActionPerformed

    private void jmi_Permisos_JefesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Permisos_JefesActionPerformed
        // TODO add your handling code here:
        jd_Solicitudes_Permisos_Jefes.setModal(true);
        jd_Solicitudes_Permisos_Jefes.pack();
        jd_Solicitudes_Permisos_Jefes.setLocationRelativeTo(this);
        jd_Solicitudes_Permisos_Jefes.setVisible(true);
    }//GEN-LAST:event_jmi_Permisos_JefesActionPerformed

    private void jmi_Solicitar_Vacaciones_JefesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Solicitar_Vacaciones_JefesActionPerformed
        // TODO add your handling code here:
        jd_Solicitudes_Vacaciones_Jefes.setModal(true);
        jd_Solicitudes_Vacaciones_Jefes.pack();
        jd_Solicitudes_Vacaciones_Jefes.setLocationRelativeTo(this);
        jd_Solicitudes_Vacaciones_Jefes.setVisible(true);
    }//GEN-LAST:event_jmi_Solicitar_Vacaciones_JefesActionPerformed

    private void bt_Solicitar_Vacaciones_JefesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Solicitar_Vacaciones_JefesActionPerformed
        // TODO add your handling code here:
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("Gerentes/Solicitudes de autorizacion de vacaciones/" + ((Jefe) jefes.get(posj)).getCorreo() + ".txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(ta_Solicitud_Vacaciones_Jefes.getText());
            bw.write("\n");
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        File archivo2 = null;
        FileWriter fw2 = null;
        BufferedWriter bw2 = null;
        try {
            archivo = new File("Gerentes/" + j.getG() + ".txt");
            fw2 = new FileWriter(archivo, true);
            bw2 = new BufferedWriter(fw);
            bw2.write(ta_Solicitud_Vacaciones_Jefes.getText());
            bw2.write("\n");
            bw2.newLine();
            bw2.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        jd_Solicitudes_Vacaciones_Jefes.dispose();
    }//GEN-LAST:event_bt_Solicitar_Vacaciones_JefesActionPerformed

    private void jmi_Solicitar_Instancia_AnalistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Solicitar_Instancia_AnalistasActionPerformed
        // TODO add your handling code here:
        jd_Solicitud_Insistencias_Analistas.setModal(true);
        jd_Solicitud_Insistencias_Analistas.pack();
        jd_Solicitud_Insistencias_Analistas.setLocationRelativeTo(this);
        jd_Solicitud_Insistencias_Analistas.setVisible(true);
    }//GEN-LAST:event_jmi_Solicitar_Instancia_AnalistasActionPerformed

    private void bt_Solicitar_Permisos_JefesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Solicitar_Permisos_JefesActionPerformed
        // TODO add your handling code here:
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("Gerentes/Solicitudes de Permisos/" + ((Jefe) jefes.get(posj)).getCorreo() + ".txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(ta_Solicitud_Permisos_Jefes.getText());
            bw.write("\n");
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        File archivo2 = null;
        FileWriter fw2 = null;
        BufferedWriter bw2 = null;
        try {
            archivo = new File("Gerentes/" + j.getG() + ".txt");
            fw2 = new FileWriter(archivo, true);
            bw2 = new BufferedWriter(fw);
            bw2.write(ta_Solicitud_Permisos_Jefes.getText());
            bw2.write("\n");
            bw2.newLine();
            bw2.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        jd_Solicitudes_Permisos_Jefes.dispose();
    }//GEN-LAST:event_bt_Solicitar_Permisos_JefesActionPerformed

    private void bt_Solicitar_Insistencias_JefesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Solicitar_Insistencias_JefesActionPerformed
        // TODO add your handling code here:
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("Gerentes/Solicitudes de insistencia/" + ((Jefe) jefes.get(posj)).getCorreo() + ".txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(ta_Solicitud_Insistencias_Jefes.getText());
            bw.write("\n");
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        File archivo2 = null;
        FileWriter fw2 = null;
        BufferedWriter bw2 = null;
        try {
            archivo = new File("Gerentes/" + j.getG() + ".txt");
            fw2 = new FileWriter(archivo, true);
            bw2 = new BufferedWriter(fw);
            bw2.write(ta_Solicitud_Insistencias_Jefes.getText());
            bw2.write("\n");
            bw2.newLine();
            bw2.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        jd_Solicitudes_Insistencias_Jefes.dispose();
    }//GEN-LAST:event_bt_Solicitar_Insistencias_JefesActionPerformed

    private void jmi_Solicitar_Instancia_JefesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Solicitar_Instancia_JefesActionPerformed
        // TODO add your handling code here:
        jd_Solicitudes_Insistencias_Jefes.setModal(true);
        jd_Solicitudes_Insistencias_Jefes.pack();
        jd_Solicitudes_Insistencias_Jefes.setLocationRelativeTo(this);
        jd_Solicitudes_Insistencias_Jefes.setVisible(true);
    }//GEN-LAST:event_jmi_Solicitar_Instancia_JefesActionPerformed

    private void jmi_Permisos_GerentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Permisos_GerentesActionPerformed
        // TODO add your handling code here:
        jd_Solicitudes_Permisos_Gerentes.setModal(true);
        jd_Solicitudes_Permisos_Gerentes.pack();
        jd_Solicitudes_Permisos_Gerentes.setLocationRelativeTo(this);
        jd_Solicitudes_Permisos_Gerentes.setVisible(true);
    }//GEN-LAST:event_jmi_Permisos_GerentesActionPerformed

    private void jmi_Solicitar_Instancia_GerentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Solicitar_Instancia_GerentesActionPerformed
        // TODO add your handling code here:
        jd_Solicitudes_Insistencias_Gerentes.setModal(true);
        jd_Solicitudes_Insistencias_Gerentes.pack();
        jd_Solicitudes_Insistencias_Gerentes.setLocationRelativeTo(this);
        jd_Solicitudes_Insistencias_Gerentes.setVisible(true);
    }//GEN-LAST:event_jmi_Solicitar_Instancia_GerentesActionPerformed

    private void jmi_Solicitar_Vacaciones_GerentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Solicitar_Vacaciones_GerentesActionPerformed
        // TODO add your handling code here:
        jd_Solicitudes_Vacaciones_Gerentes.setModal(true);
        jd_Solicitudes_Vacaciones_Gerentes.pack();
        jd_Solicitudes_Vacaciones_Gerentes.setLocationRelativeTo(this);
        jd_Solicitudes_Vacaciones_Gerentes.setVisible(true);
    }//GEN-LAST:event_jmi_Solicitar_Vacaciones_GerentesActionPerformed

    private void bt_Solicitar_Vacaciones_GerentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Solicitar_Vacaciones_GerentesActionPerformed
        // TODO add your handling code here:
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        File archivo2 = null;
        FileWriter fw2 = null;
        BufferedWriter bw2 = null;
        try {
            archivo = new File("Gerentes/Solicitudes de autorizacion de vacaciones/" + ((Gerente) gerentes.get(posg)).getCorreo() + ".txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(ta_Solicitud_Vacaciones_Gerentes.getText());
            bw.write("\n");
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            archivo2 = new File("Director/Solicitudes de autorizacion de vacaciones/" + ((Gerente) gerentes.get(posg)).getCorreo() + ".txt");
            fw2 = new FileWriter(archivo, true);
            bw2 = new BufferedWriter(fw);
            bw2.write(ta_Solicitud_Vacaciones_Gerentes.getText());
            bw2.write("\n");
            bw2.newLine();
            bw2.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

        jd_Solicitudes_Vacaciones_Gerentes.dispose();
    }//GEN-LAST:event_bt_Solicitar_Vacaciones_GerentesActionPerformed

    private void bt_Solicitar_Permisos_GerentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Solicitar_Permisos_GerentesActionPerformed
        // TODO add your handling code here:
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        File archivo2 = null;
        FileWriter fw2 = null;
        BufferedWriter bw2 = null;
        try {
            archivo = new File("Gerentes/Solicitudes de Permisos/" + ((Gerente) gerentes.get(posg)).getCorreo() + ".txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(ta_Solicitud_Permisos_Gerentes.getText());
            bw.write("\n");
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            archivo2 = new File("Director/Solicitudes de Permisos/" + ((Gerente) gerentes.get(posg)).getCorreo() + ".txt");
            fw2 = new FileWriter(archivo, true);
            bw2 = new BufferedWriter(fw);
            bw2.write(ta_Solicitud_Permisos_Gerentes.getText());
            bw2.write("\n");
            bw2.newLine();
            bw2.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        jd_Solicitudes_Permisos_Gerentes.dispose();
    }//GEN-LAST:event_bt_Solicitar_Permisos_GerentesActionPerformed

    private void bt_Solicitar_Insistencias_GerentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Solicitar_Insistencias_GerentesActionPerformed
        // TODO add your handling code here:
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        File archivo2 = null;
        FileWriter fw2 = null;
        BufferedWriter bw2 = null;
        try {
            archivo = new File("Gerentes/Solicitudes de insistencia/" + ((Gerente) gerentes.get(posg)).getCorreo() + ".txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(ta_Solicitud_Insistencias_Gerentes.getText());
            bw.write("\n");
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            archivo2 = new File("Director/Solicitudes de insistencia/" + ((Gerente) gerentes.get(posg)).getCorreo() + ".txt");
            fw2 = new FileWriter(archivo, true);
            bw2 = new BufferedWriter(fw);
            bw2.write(ta_Solicitud_Insistencias_Gerentes.getText());
            bw2.write("\n");
            bw2.newLine();
            bw2.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        jd_Solicitudes_Insistencias_Gerentes.dispose();
    }//GEN-LAST:event_bt_Solicitar_Insistencias_GerentesActionPerformed

    private void jmi_Administracion_InformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Administracion_InformacionActionPerformed
        // TODO add your handling code here:
        jd_Administracion_Compañia.setModal(true);
        jd_Administracion_Compañia.pack();
        jd_Administracion_Compañia.setLocationRelativeTo(this);
        jd_Administracion_Compañia.setVisible(true);
    }//GEN-LAST:event_jmi_Administracion_InformacionActionPerformed

    private void jmi_Crear_DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Crear_DepartamentoActionPerformed
        // TODO add your handling code here:
        jd_Crear_Departamentos.setModal(true);
        jd_Crear_Departamentos.pack();
        jd_Crear_Departamentos.setLocationRelativeTo(this);
        jd_Crear_Departamentos.setVisible(true);
    }//GEN-LAST:event_jmi_Crear_DepartamentoActionPerformed

    private void bt_Agregar_Area_DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Agregar_Area_DepartamentoActionPerformed
        // TODO add your handling code here:
        if (jl_Departamentos.getSelectedIndex() > 0) {
            a = new Area(JOptionPane.showInputDialog(jd_Listar_Departamentos, "Ingrese nombre de la area"));
            d.getAreas().add(a);
            File archivo = null;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                archivo = new File("./areas.txt");
                //falso sobre escribe true resoeta
                fw = new FileWriter(archivo, true);
                bw = new BufferedWriter(fw);
                bw.write(a + "");
                bw.write("\n");
                bw.newLine();
                bw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(jd_Listar_Departamentos, "Debe de seleccionar un departamento para agregarle el area");
        }
    }//GEN-LAST:event_bt_Agregar_Area_DepartamentoActionPerformed

    private void bt_BitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_BitacoraActionPerformed
        // TODO add your handling code here:
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("./bitacora.txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(ta_Bitacora.getText());
            bw.write("\n");
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        bit++;
        jd_Administrar_Bitacora.dispose();
    }//GEN-LAST:event_bt_BitacoraActionPerformed

    private void jmi_Bitacora_SistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Bitacora_SistemaActionPerformed
        // TODO add your handling code here:
        jd_Administrar_Bitacora.setModal(true);
        jd_Administrar_Bitacora.pack();
        jd_Administrar_Bitacora.setLocationRelativeTo(this);
        jd_Administrar_Bitacora.setVisible(true);
    }//GEN-LAST:event_jmi_Bitacora_SistemaActionPerformed

    private void jmi_GraficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_GraficasActionPerformed

        DefaultCategoryDataset dcds = new DefaultCategoryDataset();
        dcds.setValue(contratados, "Reclutamiento", "Contratados");
        dcds.setValue(permisos, "Permisos Solicitados", "Todos los empleados");
        dcds.setValue(0, "Accidente laboral", "Toda la empresa");
        dcds.setValue(chats, "Chats utilizados", "Todos los empleados");
        dcds.setValue(bit, "Actualizaciones de la bitacora", "Toda la estadia");

        JFreeChart jfcl = ChartFactory.createBarChart("", "", "", dcds, PlotOrientation.VERTICAL, true, true, true);
        CategoryPlot plot = jfcl.getCategoryPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, Color.PINK);

        ChartFrame frame2 = new ChartFrame("Graficos importantes del sistema", jfcl);
        frame2.pack();
        frame2.setVisible(true);

    }//GEN-LAST:event_jmi_GraficasActionPerformed

    private void bt_ContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ContratoActionPerformed
        // TODO add your handling code here:
        if (jl_Departamentos1.getSelectedIndex() > 0) {
            try {
                //Consiguendo todos los valores necesarios
                DefaultListModel modelo1 = (DefaultListModel) jl_Areas.getModel();
                modelo1.addElement(((Departamento) depa.get(jl_Departamentos1.getSelectedIndex())).getAreas());
                jl_Areas.setModel(modelo1);
                if (jl_Jefes.getSelectedIndex() >= 0) {
                    Object temp = ((Jefe) jefes.get(jl_Jefes.getSelectedIndex())).getId();
                    j = (Jefe) temp;
                }//If auxiliar de los jefes
                if (jl_Gerente.getSelectedIndex() >= 0) {
                    Object temp = ((Gerente) gerentes.get(jl_Gerente.getSelectedIndex())).getId();
                    g = (Gerente) temp;
                }//If auxilar de los gerentes
                if (jl_Analistas.getSelectedIndex() >= 0) {
                    Object temp = ((Analista) analistas.get(jl_Analistas.getSelectedIndex())).getId();
                    an = (Analista) temp;
                    an.setJ(j);
                    an.setSalgo(Float.parseFloat(JOptionPane.showInputDialog(jd_Contratacion, "Ingrese el sueldo del analista")));
                }
                //Agregar Personal al area
                ((Area) areas.get(jl_Areas.getSelectedIndex())).getPer().add(j);
                ((Area) areas.get(jl_Areas.getSelectedIndex())).getPer().add(g);
                ((Area) areas.get(jl_Areas.getSelectedIndex())).getPer().add(an);

                contratados++;
                contra.add(j);
                contra.add(g);
                contra.add(an);

                File archivo = null;
                FileWriter fw = null;
                BufferedWriter bw = null;
                try {
                    archivo = new File("./contratados.txt");
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write(contra + "");
                    bw.write("\n");
                    bw.newLine();
                    bw.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(jd_Contratacion, "Verifique que selecciono uno de cada tipo");
            }
            JOptionPane.showMessageDialog(jd_Contratacion, "Se contrato el personal corectamente");
        } else {
            JOptionPane.showMessageDialog(jd_Contratacion, "Debe de selccionar un departamento");
        }
    }//GEN-LAST:event_bt_ContratoActionPerformed

    private void bt_ReclutadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ReclutadoActionPerformed
        // TODO add your handling code here:
        if (jl_Departamentos1.getSelectedIndex() > 0) {
            try {
                DefaultListModel modelo1 = (DefaultListModel) jl_Areas.getModel();
                modelo1.addElement(((Departamento) depa.get(jl_Departamentos1.getSelectedIndex())).getAreas());
                jl_Areas.setModel(modelo1);
                if (jl_Jefes.getSelectedIndex() >= 0) {
                    Object temp = ((Jefe) jefes.get(jl_Jefes.getSelectedIndex())).getId();
                    j = (Jefe) temp;
                    personal.add(j);
                }//If auxiliar de los jefes
                if (jl_Gerente.getSelectedIndex() >= 0) {
                    Object temp = ((Gerente) gerentes.get(jl_Gerente.getSelectedIndex())).getId();
                    g = (Gerente) temp;
                    personal.add(g);
                    j.setG(g);
                }//If auxilar de los gerentes
                if (jl_Analistas.getSelectedIndex() >= 0) {
                    Object temp = ((Analista) analistas.get(jl_Analistas.getSelectedIndex())).getId();
                    an = (Analista) temp;
                    personal.add(an);
                }
                reclutas.add(j);
                reclutas.add(g);
                reclutas.add(an);
                File archivo = null;
                FileWriter fw = null;
                BufferedWriter bw = null;
                try {
                    archivo = new File("./reclutas.txt");
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    bw.write(reclutas + "");
                    bw.write("\n");
                    bw.newLine();
                    bw.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(jd_Contratacion, "Verifique que selecciono uno de cada tipo");
            }
            JOptionPane.showMessageDialog(jd_Contratacion, "Se recluto el personal corectamente");

        } else {
            JOptionPane.showMessageDialog(jd_Contratacion, "Debe de selccionar un departamento");
        }
    }//GEN-LAST:event_bt_ReclutadoActionPerformed

    private void bt_InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_InicioMouseClicked
        // TODO add your handling code here:
        Inicio inicio = new Inicio();
        pn_Organigrama.add(inicio);
        organigrama.add(inicio);
        inicio.setBounds(10, 10, inicio.getAnchura(), inicio.getAltura());
        contadorInicio++;
        pn_Organigrama.updateUI();
    }//GEN-LAST:event_bt_InicioMouseClicked

    private void bt_ProcesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ProcesoMouseClicked
        // TODO add your handling code here:
        Empleados mientras = new Empleados();
        pn_Organigrama.add(mientras);
        organigrama.add(mientras);
        mientras.setBounds(0, 0, mientras.getAnchura(), mientras.getAltura());
        pn_Organigrama.updateUI();
    }//GEN-LAST:event_bt_ProcesoMouseClicked

    private void bt_FinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_FinMouseClicked

        Fin dFinal = new Fin();
        pn_Organigrama.add(dFinal);
        organigrama.add(dFinal);
        dFinal.setBounds(50, 100, dFinal.getAnchura(), dFinal.getAltura());
        pn_Organigrama.updateUI();

    }//GEN-LAST:event_bt_FinMouseClicked

    private void bt_CargoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_CargoMouseClicked
        // TODO add your handling code here:
        Cargo condicional = new Cargo();
        organigrama.add(condicional);
        pn_Organigrama.add(condicional);
        condicional.setBounds(50, 50, condicional.getAnchura(), condicional.getAltura());
        pn_Organigrama.updateUI();
    }//GEN-LAST:event_bt_CargoMouseClicked

    private void bt_SeparadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SeparadoresActionPerformed
        // TODO add your handling code here:
        Graphics g = pn_Organigrama.getGraphics();
        for (int i = 0; i < organigrama.size(); i++) {
            if (i >= 1) {
                g.drawLine(organigrama.get(i - 1).getX(), organigrama.get(i - 1).getY(),
                        organigrama.get(i).getX(), organigrama.get(i).getY());
            }
        }
        for (JPanel diagrama : organigrama) {
            if (diagrama instanceof Inicio) {
                ((Inicio) diagrama).setMover(false);
            } else if (diagrama instanceof Fin) {
                ((Fin) diagrama).setMover(false);
            } else if (diagrama instanceof Cargo) {
                ((Cargo) diagrama).setMover(false);
            } else if (diagrama instanceof Empleados) {
                ((Empleados) diagrama).setMover(false);
            }
        }
    }//GEN-LAST:event_bt_SeparadoresActionPerformed

    private void jmi_Abrir_OrganigramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Abrir_OrganigramaActionPerformed
        // TODO add your handling code here:
        FileInputStream fi = null;
        ObjectInputStream oi = null;
        adminOrganigrama df;
        ArrayList<adminOrganigrama> dfs = new ArrayList();
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo Organigrama", "dfl");
            jfc.setFileFilter(filtro);
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                pn_Organigrama.removeAll();
                for (int i = 0; i < organigrama.size(); i++) {
                    organigrama.remove(i);
                }

                pn_Organigrama.updateUI();
                archivo = jfc.getSelectedFile();
                fi = new FileInputStream(archivo);
                oi = new ObjectInputStream(fi);
                try {
                    while ((df = (adminOrganigrama) oi.readObject()) != null) {
                        dfs.add(df);
                    }
                } catch (Exception e) {
                }
                for (adminOrganigrama d : dfs) {
                    nombreFlujo = d.getNombreClase();
                    if (d.getNombre().equals("Condicional")) {
                        Cargo cond = new Cargo();
                        cond.getTf_condicional().setText(d.getTexto1());
                        organigrama.add(cond);
                        pn_Organigrama.add(cond);
                        cond.setBounds(d.getX(), d.getY(), cond.getAnchura(), cond.getAltura());
                        pn_Organigrama.updateUI();
                    } else if (d.getNombre().equals("Final")) {
                        Fin f = new Fin();
                        organigrama.add(f);
                        pn_Organigrama.add(f);
                        f.setBounds(d.getX(), d.getY(), f.getAnchura(), f.getAltura());
                        pn_Organigrama.updateUI();
                    } else if (d.getNombre().equals("Inicio")) {
                        Inicio in = new Inicio();
                        organigrama.add(in);
                        pn_Organigrama.add(in);
                        in.setBounds(d.getX(), d.getY(), in.getAnchura(), in.getAltura());
                        pn_Organigrama.updateUI();

                    } else if (d.getNombre().equals("Mientras")) {
                        Empleados m = new Empleados();
                        m.getTf_mientras().setText(d.getTexto1());
                        organigrama.add(m);
                        pn_Organigrama.add(m);
                        m.setBounds(d.getX(), d.getY(), m.getAnchura(), m.getAltura());
                        pn_Organigrama.updateUI();
                    }
                }
                JOptionPane.showMessageDialog(jd_Organigrama, "Se ha abierto el archivo");

                jmi_Guardar_Organigrama.setEnabled(true);
                jmi_Eliminar_Organigrama.setEnabled(true);
                jmi_Imprimir_Orgranigama.setEnabled(true);
            }
        } catch (Exception e) {
        } finally {
            try {
                fi.close();
                oi.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jmi_Abrir_OrganigramaActionPerformed

    private void jmi_Guardar_OrganigramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Guardar_OrganigramaActionPerformed
        // TODO add your handling code here:
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        if (archivo == null) {
            JOptionPane.showMessageDialog(this, "El archivo no esta guardado. Seleccion la opcion guardar como.");
        } else {
            ArrayList<adminOrganigrama> df = new ArrayList();
            for (JPanel diagrama : organigrama) {
                if (diagrama instanceof Inicio) {
                    df.add(new adminOrganigrama(nombreFlujo, ((Inicio) diagrama).getNombre(), ((Inicio) diagrama).getX(),
                            ((Inicio) diagrama).getY()));
                } else if (diagrama instanceof Cargo) {
                    df.add(new adminOrganigrama(nombreFlujo, ((Cargo) diagrama).getNombre(),
                            ((Cargo) diagrama).getX(), ((Cargo) diagrama).getY(),
                            ((Cargo) diagrama).getTexto()));
                } else if (diagrama instanceof Fin) {
                    df.add(new adminOrganigrama(nombreFlujo, ((Fin) diagrama).getNombre(), ((Fin) diagrama).getX(),
                            ((Fin) diagrama).getY()));
                } else if (diagrama instanceof Empleados) {
                    df.add(new adminOrganigrama(nombreFlujo, ((Empleados) diagrama).getNombre(), ((Empleados) diagrama).getX(),
                            ((Empleados) diagrama).getY(), ((Empleados) diagrama).getTexto()));
                }
            }
            try {
                fw = new FileOutputStream(archivo);
                bw = new ObjectOutputStream(fw);
                for (adminOrganigrama diagrama : df) {
                    bw.writeObject(diagrama);
                }
                bw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    fw.close();
                    bw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Se han guardado los cambios");
    }//GEN-LAST:event_jmi_Guardar_OrganigramaActionPerformed

    private void jmi_GuardarC_DFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_GuardarC_DFActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        int seleccion = jfc.showSaveDialog(this);
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        ArrayList<adminOrganigrama> df = new ArrayList();
        for (JPanel diagrama : organigrama) {
            if (diagrama instanceof Inicio) {
                df.add(new adminOrganigrama(nombreFlujo, ((Inicio) diagrama).getNombre(), ((Inicio) diagrama).getX(),
                        ((Inicio) diagrama).getY()));
            } else if (diagrama instanceof Cargo) {
                df.add(new adminOrganigrama(nombreFlujo, ((Cargo) diagrama).getNombre(),
                        ((Cargo) diagrama).getX(), ((Cargo) diagrama).getY(),
                        ((Cargo) diagrama).getTexto()));
            } else if (diagrama instanceof Fin) {
                df.add(new adminOrganigrama(nombreFlujo, ((Fin) diagrama).getNombre(), ((Fin) diagrama).getX(),
                        ((Fin) diagrama).getY()));
            } else if (diagrama instanceof Empleados) {
                df.add(new adminOrganigrama(nombreFlujo, ((Empleados) diagrama).getNombre(), ((Empleados) diagrama).getX(),
                        ((Empleados) diagrama).getY(), ((Empleados) diagrama).getTexto()));
            }
        }
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                archivo = jfc.getSelectedFile();
                fw = new FileOutputStream(archivo + ".dfl");
                bw = new ObjectOutputStream(fw);
                for (adminOrganigrama diagrama : df) {
                    bw.writeObject(diagrama);
                }
                bw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    fw.close();
                    bw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        JOptionPane.showMessageDialog(jd_Organigrama, "Se ha guardado el archivo");
    }//GEN-LAST:event_jmi_GuardarC_DFActionPerformed

    private void jmi_Eliminar_OrganigramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Eliminar_OrganigramaActionPerformed
        // TODO add your handling code here:
        for (JPanel diagrama : organigrama) {
            if ((diagrama instanceof Inicio) && (((Inicio) diagrama).isSeleccion())) {
                JOptionPane.showMessageDialog(jd_Organigrama, "Se ha eliminado el organigrama de" + ((Inicio) diagrama).getNombre());
                organigrama.remove(diagrama);
                pn_Organigrama.remove(((Inicio) diagrama));
                pn_Organigrama.updateUI();
                contadorInicio = 0;
                break;
            } else if ((diagrama instanceof Fin) && (((Fin) diagrama).isSeleccion())) {
                JOptionPane.showMessageDialog(jd_Organigrama, "Se ha eliminado el organigrama de " + ((Fin) diagrama).getNombre());
                organigrama.remove(diagrama);
                pn_Organigrama.remove(((Fin) diagrama));
                pn_Organigrama.updateUI();
                contadorFin = 0;
                break;
            } else if ((diagrama instanceof Cargo) && ((Cargo) diagrama).isSeleccion()) {
                JOptionPane.showMessageDialog(jd_Organigrama, "Se ha eliminado el organigrama de " + ((Cargo) diagrama).getNombre());
                organigrama.remove(diagrama);
                pn_Organigrama.remove(((Cargo) diagrama));
                pn_Organigrama.updateUI();
                break;
            } else if ((diagrama instanceof Empleados) && (((Empleados) diagrama).isSeleccion())) {
                JOptionPane.showMessageDialog(jd_Organigrama, "Se ha eliminado el organigrama de " + ((Empleados) diagrama).getNombre());
                organigrama.remove(diagrama);
                pn_Organigrama.remove(((Empleados) diagrama));
                pn_Organigrama.updateUI();
                break;
            }
        }
    }//GEN-LAST:event_jmi_Eliminar_OrganigramaActionPerformed

    private void jmi_Imprimir_OrgranigamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Imprimir_OrgranigamaActionPerformed
        // TODO add your handling code here:
        int altura = pn_Organigrama.getHeight();
        int ancho = pn_Organigrama.getWidth();
        BufferedImage image = new BufferedImage(ancho, altura, BufferedImage.TYPE_INT_BGR);
        Graphics2D g = image.createGraphics();
        pn_Organigrama.print(g);
        PrintService printService = PrintServiceLookup.lookupDefaultPrintService();
        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        DocPrintJob docPrint = printService.createPrintJob();
        Doc doc = new SimpleDoc(image, flavor, null);
        try {
            docPrint.print(doc, null);
            JOptionPane.showMessageDialog(this, "Se a enviado a imprimir los diagramas");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jmi_Imprimir_OrgranigamaActionPerformed

    private void jmi_Organigrama_JPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Organigrama_JPGActionPerformed
        // TODO add your handling code here:
        int altura = pn_Organigrama.getHeight();
        int ancho = pn_Organigrama.getWidth();
        BufferedImage image = new BufferedImage(ancho, altura, BufferedImage.TYPE_INT_BGR);
        Graphics2D g = image.createGraphics();
        pn_Organigrama.print(g);
        try {
            JFileChooser jfc = new JFileChooser();
            jfc.showSaveDialog(this);
            String a = jfc.getSelectedFile() + ".jpg";
            File archivos = new File(a);
            ImageIO.write(image, "jpg", archivos);
            JOptionPane.showMessageDialog(this, "Se ha guardado en formato jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jmi_Organigrama_JPGActionPerformed

    private void pn_OrganigramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_OrganigramaMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            pp_Organigrama.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_pn_OrganigramaMouseClicked

    private void bt_Cerrar_OrganigramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Cerrar_OrganigramaActionPerformed
        // TODO add your handling code here:
        jd_Organigrama.dispose();
    }//GEN-LAST:event_bt_Cerrar_OrganigramaActionPerformed

    private void jmi_OrganigramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_OrganigramaActionPerformed
        // TODO add your handling code here:
        jd_Organigrama.setModal(true);
        jd_Organigrama.pack();
        jd_Organigrama.setLocationRelativeTo(this);
        jd_Organigrama.setVisible(true);
    }//GEN-LAST:event_jmi_OrganigramaActionPerformed

    private void jmi_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_LogOutActionPerformed
        // TODO add your handling code here:
        if (rb_Login_Analista.isSelected()) {
            File archivo = null;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                archivo = new File("Analistas/Marcaje de entradas y salidas por usuarios/" + ((Analista) analistas.get(posa)).getId() + ".txt");
                fw = new FileWriter(archivo, true);
                bw = new BufferedWriter(fw);
                bw.write("Salida de Analista: " + ((Analista) analistas.get(posa)).getId() + " ;" + new Date());
                bw.write("\n");
                bw.newLine();
                bw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
            jm_Analista.setEnabled(false);
            jmi_Login.setEnabled(true);
            jmi_LogOut.setEnabled(false);
        } else if (rb_Login_Jefe.isSelected()) {
            File archivo = null;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                archivo = new File("Jefes/Marcaje de Salidas y Entradas/" + ((Jefe) jefes.get(posj)).getId() + ".txt");
                fw = new FileWriter(archivo, true);
                bw = new BufferedWriter(fw);
                bw.write("Salida de Jefe: " + ((Jefe) jefes.get(posj)).getId() + " ;" + new Date());
                bw.write("\n");
                bw.newLine();
                bw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
            jm_Jefe.setEnabled(false);
            jmi_Login.setEnabled(true);
            jmi_LogOut.setEnabled(false);
        } else {
            jmi_Login.setEnabled(true);
            jmi_LogOut.setEnabled(false);
            jm_Administrador.setEnabled(false);
            jm_Recusos_Humanos.setEnabled(false);
            jm_Gerente.setEnabled(false);
        }
    }//GEN-LAST:event_jmi_LogOutActionPerformed

    private void jmi_Buzon_EmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Buzon_EmpresaActionPerformed
        // TODO add your handling code here:
        if (chats1 % 2 == 0) {
            Frame1 f1 = new Frame1();
            f1.setTitle("Adminsitrador: Jason");
            f1.setVisible(true);
            chats1++;
        } else if (chats1 % 2 != 0) {
            Frame2 f2 = new Frame2();
            f2.setVisible(true);
        }
    }//GEN-LAST:event_jmi_Buzon_EmpresaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (chats1 % 2 != 0) {
            Frame2 f2 = new Frame2();
            g.setId("Maje");
            f2.setTitle(g.getId());
            f2.setVisible(true);
            chats1++;
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void bt_Saldo_BancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Saldo_BancoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(jd_Conexcion_Banco, "Saldo restante: " + b.getSaldo());
    }//GEN-LAST:event_bt_Saldo_BancoActionPerformed

    private void jmi_BancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_BancoActionPerformed
        // TODO add your handling code here:
        jd_Conexcion_Banco.setModal(true);
        jd_Conexcion_Banco.pack();
        jd_Conexcion_Banco.setLocationRelativeTo(this);
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(personal.toArray());
        cb_Banco.setModel(modelo);
        jd_Conexcion_Banco.setVisible(true);
    }//GEN-LAST:event_jmi_BancoActionPerformed

    private void cb_BancoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_BancoItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 1) {
            Recursos_Humanos temp = (Recursos_Humanos) cb_Banco.getSelectedItem();
            if (temp != null) {
                tf_Correo_Empleado.setText(temp.getCorreo());
                tf_Saldo_Empleado.setText(Float.toString(temp.getSaldo()));
            }
        }
    }//GEN-LAST:event_cb_BancoItemStateChanged

    private void bt_Pagar_EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Pagar_EmpleadosActionPerformed
        // TODO add your handling code here:
        b.setSaldo((long) (b.getSaldo() - Float.parseFloat(tf_Saldo_Empleado.getText())));
        double seguro;
        double s;
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("./" + tf_Correo_Empleado.getText() + ".txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write("Fecha de pago: " + new Date());
            bw.write("\n");
            bw.newLine();
            bw.write("Saldo base: " + tf_Saldo_Empleado.getText() + " lps");
            bw.write("\n");
            bw.newLine();
            seguro = Float.parseFloat(tf_Saldo_Empleado.getText()) * 0.17;
            bw.write("IHSS: " + seguro);
            bw.write("\n");
            bw.newLine();
            s = Double.parseDouble(tf_Saldo_Empleado.getText()) - seguro;
            bw.write("\n");
            bw.newLine();
            bw.write("Sueldo total: " + s);
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_Pagar_EmpleadosActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_Opciones_Login;
    private javax.swing.JButton bt_Actualizar_Info_Compañia;
    private javax.swing.JButton bt_Agregar_Analista;
    private javax.swing.JButton bt_Agregar_Area;
    private javax.swing.JButton bt_Agregar_Area_Departamento;
    private javax.swing.JButton bt_Agregar_Gerente;
    private javax.swing.JButton bt_Agregar_Jefe;
    private javax.swing.JButton bt_Agregar_Recursos_Humanos;
    private javax.swing.JButton bt_Bitacora;
    private javax.swing.JButton bt_Cargo;
    private javax.swing.JButton bt_Cerrar_Organigrama;
    private javax.swing.JButton bt_Contrato;
    private javax.swing.JButton bt_Crear_Departamento;
    private javax.swing.JButton bt_Eliminar_Analistas;
    private javax.swing.JButton bt_Eliminar_Departamento;
    private javax.swing.JButton bt_Eliminar_Gerentes;
    private javax.swing.JButton bt_Eliminar_Jefes;
    private javax.swing.JButton bt_Eliminar_Listar_Analistas;
    private javax.swing.JButton bt_Eliminar_Listar_Gerenter;
    private javax.swing.JButton bt_Eliminar_Listar_Jefes;
    private javax.swing.JButton bt_Eliminar_Listar_Recursos_Humanos;
    private javax.swing.JButton bt_Eliminar_Recursos_Humanos;
    private javax.swing.JButton bt_Eliminar_Volver_Admins;
    private javax.swing.JButton bt_Eliminar_Volver_Analistas;
    private javax.swing.JButton bt_Eliminar_Volver_Gerentes;
    private javax.swing.JButton bt_Eliminar_Volver_Jefes;
    private javax.swing.JButton bt_Fin;
    private javax.swing.JButton bt_Inicio;
    private javax.swing.JButton bt_Limpiar_Eliminar_Admins;
    private javax.swing.JButton bt_Limpiar_Eliminar_Analistas;
    private javax.swing.JButton bt_Limpiar_Eliminar_Gerentes;
    private javax.swing.JButton bt_Limpiar_Eliminar_Jefes;
    private javax.swing.JButton bt_Limpiar_Listar_Admins;
    private javax.swing.JButton bt_Limpiar_Listar_Analistas;
    private javax.swing.JButton bt_Limpiar_Listar_Gerentes;
    private javax.swing.JButton bt_Limpiar_Listar_Jefes;
    private javax.swing.JButton bt_LogOut;
    private javax.swing.JButton bt_Login;
    private javax.swing.JButton bt_Login_Sistema;
    private javax.swing.JButton bt_Modificar_Analista;
    private javax.swing.JButton bt_Modificar_Eliminar_Analista_tabla;
    private javax.swing.JButton bt_Modificar_Eliminar_Gerentes_tabla;
    private javax.swing.JButton bt_Modificar_Eliminar_Jefes_tabla;
    private javax.swing.JButton bt_Modificar_Eliminar_Recusos_Humanos_tabla;
    private javax.swing.JButton bt_Modificar_Gerentes;
    private javax.swing.JButton bt_Modificar_Info_Compañia;
    private javax.swing.JButton bt_Modificar_Jefes;
    private javax.swing.JButton bt_Modificar_Limpiar_Analistas_tabla;
    private javax.swing.JButton bt_Modificar_Limpiar_Gerentes_tabla;
    private javax.swing.JButton bt_Modificar_Limpiar_Jefes_tabla;
    private javax.swing.JButton bt_Modificar_Limpiar_Recursos_Humanos_tabla;
    private javax.swing.JButton bt_Modificar_Recursos_Humanos;
    private javax.swing.JButton bt_Modificar_Volver_Analistas_tabla;
    private javax.swing.JButton bt_Modificar_Volver_Gerentes_tabla;
    private javax.swing.JButton bt_Modificar_Volver_Jefes_tabla;
    private javax.swing.JButton bt_Modificar_Volver_Recusros_Humanos_tabla;
    private javax.swing.JButton bt_Obtener_Info_Compañia;
    private javax.swing.JButton bt_Pagar_Empleados;
    private javax.swing.JButton bt_Proceso;
    private javax.swing.JButton bt_Reclutado;
    private javax.swing.JButton bt_Saldo_Banco;
    private javax.swing.JButton bt_Separadores;
    private javax.swing.JButton bt_Solicitar_Insistencia;
    private javax.swing.JButton bt_Solicitar_Insistencias_Gerentes;
    private javax.swing.JButton bt_Solicitar_Insistencias_Jefes;
    private javax.swing.JButton bt_Solicitar_Permisos;
    private javax.swing.JButton bt_Solicitar_Permisos_Gerentes;
    private javax.swing.JButton bt_Solicitar_Permisos_Jefes;
    private javax.swing.JButton bt_Solicitar_Vacaciones_Gerentes;
    private javax.swing.JButton bt_Solicitar_Vacaciones_Jefes;
    private javax.swing.JButton bt_Solicitar_Vacaiones;
    private javax.swing.JButton bt_Volver_Analistas;
    private javax.swing.JButton bt_Volver_Departamentos;
    private javax.swing.JButton bt_Volver_Gerentes;
    private javax.swing.JButton bt_Volver_Jefes;
    private javax.swing.JButton bt_Volver_Recusos_Humanos;
    private javax.swing.JComboBox<String> cb_Analistas;
    private javax.swing.JComboBox<String> cb_Analistas1;
    private javax.swing.JComboBox<String> cb_Analistas2;
    private javax.swing.JComboBox<String> cb_Banco;
    private javax.swing.JComboBox<String> cb_Gerentes;
    private javax.swing.JComboBox<String> cb_Gerentes1;
    private javax.swing.JComboBox<String> cb_Gerentes2;
    private javax.swing.JComboBox<String> cb_Jefes;
    private javax.swing.JComboBox<String> cb_Jefes1;
    private javax.swing.JComboBox<String> cb_Jefes2;
    private javax.swing.JComboBox<String> cb_Recursos_Humanos;
    private javax.swing.JComboBox<String> cb_Recursos_Humanos1;
    private javax.swing.JComboBox<String> cb_Recursos_Humanos2;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JDialog jd_Administracion_Compañia;
    private javax.swing.JDialog jd_Administrar_Bitacora;
    private javax.swing.JDialog jd_Conexcion_Banco;
    private javax.swing.JDialog jd_Contratacion;
    private javax.swing.JDialog jd_Crear_Analista;
    private javax.swing.JDialog jd_Crear_Departamentos;
    private javax.swing.JDialog jd_Crear_Gerente;
    private javax.swing.JDialog jd_Crear_Jefe;
    private javax.swing.JDialog jd_Crear_Recursos_Humanos;
    private javax.swing.JDialog jd_Eliminar_Analistas;
    private javax.swing.JDialog jd_Eliminar_Gerentes;
    private javax.swing.JDialog jd_Eliminar_Jefes;
    private javax.swing.JDialog jd_Eliminar_Recursos_Humanos;
    private javax.swing.JDialog jd_Listar_Analistas;
    private javax.swing.JDialog jd_Listar_Departamentos;
    private javax.swing.JDialog jd_Listar_Gerentes;
    private javax.swing.JDialog jd_Listar_Jefes;
    private javax.swing.JDialog jd_Listar_Recursos_Humanos;
    private javax.swing.JDialog jd_Login;
    private javax.swing.JDialog jd_Modificar_Analistas;
    private javax.swing.JDialog jd_Modificar_Gerentes;
    private javax.swing.JDialog jd_Modificar_Jefes;
    private javax.swing.JDialog jd_Modificar_Recursos_Humanos;
    private javax.swing.JDialog jd_Organigrama;
    private javax.swing.JDialog jd_Solicitar_Vacaciones_Analistas;
    private javax.swing.JDialog jd_Solicitud_Insistencias_Analistas;
    private javax.swing.JDialog jd_Solicitud_Permisos_Analistas;
    private javax.swing.JDialog jd_Solicitudes_Insistencias_Gerentes;
    private javax.swing.JDialog jd_Solicitudes_Insistencias_Jefes;
    private javax.swing.JDialog jd_Solicitudes_Permisos_Gerentes;
    private javax.swing.JDialog jd_Solicitudes_Permisos_Jefes;
    private javax.swing.JDialog jd_Solicitudes_Vacaciones_Gerentes;
    private javax.swing.JDialog jd_Solicitudes_Vacaciones_Jefes;
    private javax.swing.JLabel jl_Amigos;
    private javax.swing.JLabel jl_Amigos1;
    private javax.swing.JLabel jl_Amigos10;
    private javax.swing.JLabel jl_Amigos11;
    private javax.swing.JLabel jl_Amigos2;
    private javax.swing.JLabel jl_Amigos3;
    private javax.swing.JLabel jl_Amigos4;
    private javax.swing.JLabel jl_Amigos5;
    private javax.swing.JLabel jl_Amigos6;
    private javax.swing.JLabel jl_Amigos7;
    private javax.swing.JLabel jl_Amigos8;
    private javax.swing.JLabel jl_Amigos9;
    private javax.swing.JList<String> jl_Analistas;
    private javax.swing.JList<String> jl_Areas;
    private javax.swing.JList<String> jl_Departamentos;
    private javax.swing.JList<String> jl_Departamentos1;
    private javax.swing.JList<String> jl_Gerente;
    private javax.swing.JList<String> jl_Jefes;
    private javax.swing.JList<String> jl_Recursos_Humanos;
    private javax.swing.JMenu jm_Administracion_Compañia;
    private javax.swing.JMenu jm_Administrador;
    private javax.swing.JMenu jm_Adminstar_Roles;
    private javax.swing.JMenu jm_Agregar_Role;
    private javax.swing.JMenu jm_Analista;
    private javax.swing.JMenu jm_Departamentos;
    private javax.swing.JMenu jm_Eliminar_Role;
    private javax.swing.JMenu jm_Gerente;
    private javax.swing.JMenu jm_Jefe;
    private javax.swing.JMenu jm_Listar_Role;
    private javax.swing.JMenu jm_Marcas_Entradas;
    private javax.swing.JMenu jm_Marcas_Entradas1;
    private javax.swing.JMenu jm_Modificar_Role;
    private javax.swing.JMenu jm_Recusos_Humanos;
    private javax.swing.JMenu jm_Sistema;
    private javax.swing.JMenuBar jmb_Opciones_Sistema;
    private javax.swing.JMenuItem jmi_Abrir_Organigrama;
    private javax.swing.JMenuItem jmi_Administracion_Informacion;
    private javax.swing.JMenuItem jmi_Agregar_Analista;
    private javax.swing.JMenuItem jmi_Agregar_Gerente;
    private javax.swing.JMenuItem jmi_Agregar_Jefe;
    private javax.swing.JMenuItem jmi_Agregar_Recusos_Humanos;
    private javax.swing.JMenuItem jmi_Banco;
    private javax.swing.JMenuItem jmi_Bitacora_Sistema;
    private javax.swing.JMenuItem jmi_Boleta_Pagos;
    private javax.swing.JMenuItem jmi_Buzon_Empresa;
    private javax.swing.JMenuItem jmi_Chat_Analistas;
    private javax.swing.JMenuItem jmi_Chat_Areas;
    private javax.swing.JMenuItem jmi_Contratacion;
    private javax.swing.JMenuItem jmi_Crear_Departamento;
    private javax.swing.JMenuItem jmi_Diagrama_Autorizaciones;
    private javax.swing.JMenuItem jmi_Eliminar_Analista;
    private javax.swing.JMenuItem jmi_Eliminar_Gerente;
    private javax.swing.JMenuItem jmi_Eliminar_Jefe;
    private javax.swing.JMenuItem jmi_Eliminar_Organigrama;
    private javax.swing.JMenuItem jmi_Eliminar_Recursos_Humanos;
    private javax.swing.JMenuItem jmi_Graficas;
    private javax.swing.JMenuItem jmi_GuardarC_DF;
    private javax.swing.JMenuItem jmi_Guardar_Organigrama;
    private javax.swing.JMenuItem jmi_Imprimir_Orgranigama;
    private javax.swing.JMenuItem jmi_Listar_Analistas;
    private javax.swing.JMenuItem jmi_Listar_Departamentos;
    private javax.swing.JMenuItem jmi_Listar_Gerentes;
    private javax.swing.JMenuItem jmi_Listar_Jefes;
    private javax.swing.JMenuItem jmi_Listar_Recursos_Humanos;
    private javax.swing.JMenuItem jmi_LogOut;
    private javax.swing.JMenuItem jmi_Login;
    private javax.swing.JMenuItem jmi_Modificar_Analistas;
    private javax.swing.JMenuItem jmi_Modificar_Gerentes;
    private javax.swing.JMenuItem jmi_Modificar_Jefes;
    private javax.swing.JMenuItem jmi_Modificar_Recursos_Humanos;
    private javax.swing.JMenuItem jmi_Organigrama;
    private javax.swing.JMenuItem jmi_Organigrama_JPG;
    private javax.swing.JMenuItem jmi_Permisos_Analistas;
    private javax.swing.JMenuItem jmi_Permisos_Gerentes;
    private javax.swing.JMenuItem jmi_Permisos_Jefes;
    private javax.swing.JMenuItem jmi_Solicitar_Instancia_Analistas;
    private javax.swing.JMenuItem jmi_Solicitar_Instancia_Gerentes;
    private javax.swing.JMenuItem jmi_Solicitar_Instancia_Jefes;
    private javax.swing.JMenuItem jmi_Solicitar_Vacaciones_Analistas;
    private javax.swing.JMenuItem jmi_Solicitar_Vacaciones_Gerentes;
    private javax.swing.JMenuItem jmi_Solicitar_Vacaciones_Jefes;
    private javax.swing.JPanel jp_Opciones;
    private javax.swing.JPasswordField pf_Agregar_Analista;
    private javax.swing.JPasswordField pf_Agregar_Gerente;
    private javax.swing.JPasswordField pf_Agregar_Jefe;
    private javax.swing.JPasswordField pf_Agregar_Recursos_Humanos;
    private javax.swing.JPasswordField pf_Contraseña;
    private javax.swing.JPanel pn_Organigrama;
    private javax.swing.JPopupMenu pp_Organigrama;
    private javax.swing.JRadioButton rb_Login_Administrador;
    private javax.swing.JRadioButton rb_Login_Analista;
    private javax.swing.JRadioButton rb_Login_Gerente;
    private javax.swing.JRadioButton rb_Login_Jefe;
    private javax.swing.JRadioButton rb_Login_Recursos_Humanos;
    private javax.swing.JTextArea ta_Bitacora;
    private javax.swing.JTextArea ta_Direccion_Exacta_Compañia;
    private javax.swing.JTextArea ta_Mision_Compañia;
    private javax.swing.JTextArea ta_Objetivos_Compañia;
    private javax.swing.JTextArea ta_Politicas_Compañia;
    private javax.swing.JTextArea ta_Solicitud_Insistencias;
    private javax.swing.JTextArea ta_Solicitud_Insistencias_Gerentes;
    private javax.swing.JTextArea ta_Solicitud_Insistencias_Jefes;
    private javax.swing.JTextArea ta_Solicitud_Permisos;
    private javax.swing.JTextArea ta_Solicitud_Permisos_Gerentes;
    private javax.swing.JTextArea ta_Solicitud_Permisos_Jefes;
    private javax.swing.JTextArea ta_Solicitud_Vacaciones;
    private javax.swing.JTextArea ta_Solicitud_Vacaciones_Gerentes;
    private javax.swing.JTextArea ta_Solicitud_Vacaciones_Jefes;
    private javax.swing.JTextArea ta_Telefonos_Compañia;
    private javax.swing.JTextArea ta_Vision_Compañia;
    private javax.swing.JTable tabla_Analistas;
    private javax.swing.JTable tabla_Analistas1;
    private javax.swing.JTable tabla_Analistas2;
    private javax.swing.JTable tabla_Gerentes;
    private javax.swing.JTable tabla_Gerentes1;
    private javax.swing.JTable tabla_Gerentes2;
    private javax.swing.JTable tabla_Jefes;
    private javax.swing.JTable tabla_Jefes1;
    private javax.swing.JTable tabla_Jefes2;
    private javax.swing.JTable tabla_Recursos_Humanos;
    private javax.swing.JTable tabla_Recursos_Humanos1;
    private javax.swing.JTable tabla_Recursos_Humanos2;
    private javax.swing.JToolBar tb_Sistema;
    private javax.swing.JTextField tf_Agregar_Analista;
    private javax.swing.JTextField tf_Agregar_Gerente;
    private javax.swing.JTextField tf_Agregar_Jefe;
    private javax.swing.JTextField tf_Agregar_Recursos_Humanos;
    private javax.swing.JTextField tf_Correo_Analista;
    private javax.swing.JTextField tf_Correo_Electronico_Compañia;
    private javax.swing.JTextField tf_Correo_Empleado;
    private javax.swing.JTextField tf_Correo_Gerente;
    private javax.swing.JTextField tf_Correo_Jefe;
    private javax.swing.JTextField tf_Correo_Recursos_Humanos;
    private javax.swing.JTextField tf_Nombre_Compañia;
    private javax.swing.JTextField tf_Nombre_Departamento;
    private javax.swing.JTextField tf_Saldo_Empleado;
    private javax.swing.JTextField tf_Usuario;
    private javax.swing.JTextField tf_nombre_Director;
    // End of variables declaration//GEN-END:variables
   //Valores de las posiciones de cada uno
    int chats1 = 0;
    int posg = 0;
    int posa = 0;
    int posj = 0;
    int posre = 0;
    int posdepa = 0;
    int posare = 0;
    int contratados = 0;
    int permisos = 0;
    int bit = 0;
    int chats = 0;
    //ArrayList del Sistema
    ArrayList admins = new ArrayList();
    ArrayList jefes = new ArrayList();
    ArrayList gerentes = new ArrayList();
    ArrayList analistas = new ArrayList();
    ArrayList recursos_humanos = new ArrayList();
    ArrayList depa = new ArrayList();
    ArrayList areas = new ArrayList();
    ArrayList reclutas = new ArrayList();
    ArrayList contra = new ArrayList();
    ArrayList personal = new ArrayList();
    //Variable de Instancias
    Empresa e = new Empresa();
    Departamento d = new Departamento();
    Area a = new Area();
    Gerente g = new Gerente();
    Jefe j = new Jefe();
    Analista an = new Analista();
    Recursos_Humanos re = new Recursos_Humanos();
    Banco b = new Banco();
    Object temp;
}
