
package View;

import Controller.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Miguel Bogota
 * @since 30/11/2018
 * @version 1.1
 */

public class Login extends JFrame {
    
    //Variables del color
    private Color backDark = new Color(43, 43, 43);
    private Color backLight = new Color(171, 171, 171);
    private Color backInactive = new Color(48, 48, 48);
    
    private Color textLight = new Color(191, 191, 191);
    private Color textActive = new Color(81, 81, 125);
    private Color textError = new Color(142, 59, 59);
    
    //Variables del objeto
    private JPanel containerLogin;
    
    private JPanel loginWrapper;
    private JButton loginOption;
    private JSeparator loginOptionBorder;
    
    private JPanel signupWrapper;
    private JButton signupOption;
    private JSeparator signupOptionBorder;
    private int cont = 2;
    
    //Variables del ingreso
    private JPanel loginData;
    
    private JLabel userLabel;
    private JTextField userLogin;
    private JSeparator userBorder;
    
    private JLabel passLabel;
    private JPasswordField passLogin;
    private JSeparator passBorder;
    
    private JButton login;
    
    //Variables del regirstro
    private JPanel signupData;
    
    private JLabel userSignupLabel;
    private JTextField userSignup;
    private JSeparator userSignupBorder;
    
    private JLabel passSignupLabel;
    private JPasswordField passSignup;
    private JSeparator passSignupBorder;
    
    private JLabel passRepeatSignupLabel;
    private JPasswordField passRepeatSignup;
    private JSeparator passRepeatSignupBorder;
    
    private JButton signup;
    
    //Constructor del objeto
    public Login() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        userLogin.requestFocus();
    }
    
    //Creacion del la ventana
    private void initComponents() {

        containerLogin = new JPanel();
        
        loginWrapper = new JPanel();
        loginOption = new JButton();
        loginOptionBorder = new JSeparator();
        
        signupWrapper = new JPanel();
        signupOption = new JButton();
        signupOptionBorder = new JSeparator();
        
        loginData = new JPanel();
        
        userLabel = new JLabel();
        userLogin = new JTextField();
        userBorder = new JSeparator();
        
        passLabel = new JLabel();
        passLogin = new JPasswordField();
        passBorder = new JSeparator();
        
        login = new JButton();
        
        signupData = new JPanel();
        
        userSignupLabel = new JLabel();
        userSignup = new JTextField();
        userSignupBorder = new JSeparator();
        
        passSignupLabel = new JLabel();
        passSignup = new JPasswordField();
        passSignupBorder = new JSeparator();
        
        passRepeatSignupLabel = new JLabel();
        passRepeatSignup = new JPasswordField();
        passRepeatSignupBorder = new JSeparator();
        
        signup = new JButton();

        setTitle("Login");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        containerLogin.setBackground(backDark);

        loginWrapper.setBackground(backDark);

        loginOption.setFont(new Font("Segoe UI Semibold", 1, 36));
        loginOption.setForeground(textActive);
        loginOption.setText("Ingresar");
        loginOption.setBorderPainted(false);
        loginOption.setContentAreaFilled(false);
        loginOption.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        loginOption.setFocusPainted(false);
        loginOption.setFocusable(false);
        loginOption.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginOptionActionPerformed(e);
            }
        });

        GroupLayout loginWrapperLayout = new GroupLayout(loginWrapper);
        loginWrapper.setLayout(loginWrapperLayout);
        loginWrapperLayout.setHorizontalGroup(
            loginWrapperLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(loginOption, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        loginWrapperLayout.setVerticalGroup(
            loginWrapperLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(loginWrapperLayout.createSequentialGroup()
                .addComponent(loginOption, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        loginOptionBorder.setBackground(backDark);
        loginOptionBorder.setForeground(backDark);

        signupWrapper.setBackground(backInactive);

        signupOption.setFont(new Font("Segoe UI Semibold", 1, 36));
        signupOption.setForeground(textLight);
        signupOption.setText("Registrarse");
        signupOption.setBorderPainted(false);
        signupOption.setContentAreaFilled(false);
        signupOption.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signupOption.setFocusPainted(false);
        signupOption.setFocusable(false);
        signupOption.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                signupOptionActionPerformed(e);
            }
        });

        GroupLayout signupWrapperLayout = new GroupLayout(signupWrapper);
        signupWrapper.setLayout(signupWrapperLayout);
        signupWrapperLayout.setHorizontalGroup(
            signupWrapperLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, signupWrapperLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(signupOption, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
        );
        signupWrapperLayout.setVerticalGroup(
            signupWrapperLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(signupOption, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        
        signupOptionBorder.setBackground(backLight);
        signupOptionBorder.setForeground(backLight);

        loginData.setBackground(backDark);

        userLabel.setFont(new Font("Segoe UI", 1, 13));
        userLabel.setForeground(textLight);
        userLabel.setText("Usuario");

        userLogin.setBackground(backDark);
        userLogin.setFont(new Font("Segoe UI", 0, 18));
        userLogin.setForeground(textLight);
        userLogin.setBorder(null);
        userLogin.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                FocusGained(e, userLabel, userBorder);
            }
            public void focusLost(FocusEvent e) {
                FocusLost(e, userLabel, userBorder);
            }
        });
        userLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginActionPerformed(e);
            }
        });

        userBorder.setBackground(backLight);
        userBorder.setForeground(backLight);

        passLabel.setFont(new Font("Segoe UI", 1, 13));
        passLabel.setForeground(textLight);
        passLabel.setText("Contraseña");

        passLogin.setBackground(backDark);
        passLogin.setFont(new Font("Segoe UI", 0, 18));
        passLogin.setForeground(textLight);
        passLogin.setBorder(null);
        passLogin.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                FocusGained(e, passLabel, passBorder);
            }
            public void focusLost(FocusEvent e) {
                FocusLost(e, passLabel, passBorder);
            }
        });
        passLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginActionPerformed(e);
            }
        });

        passBorder.setBackground(backLight);
        passBorder.setForeground(backLight);

        login.setFont(new Font("Segoe UI", 1, 18));
        login.setForeground(textLight);
        login.setText("Ingresar");
        login.setBorder(new LineBorder(backLight, 1, true));
        login.setContentAreaFilled(false);
        login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.setFocusPainted(false);
        login.setFocusable(false);
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginActionPerformed(e);
            }
        });
        
        signupData.setBackground(backDark);

        userSignupLabel.setFont(new Font("Segoe UI", 1, 13));
        userSignupLabel.setForeground(textLight);
        userSignupLabel.setText("Crear Usuario");

        userSignup.setBackground(backDark);
        userSignup.setFont(new Font("Segoe UI", 0, 18));
        userSignup.setForeground(textLight);
        userSignup.setBorder(null);
        userSignup.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                FocusGained(e, userSignupLabel, userSignupBorder);
            }
            public void focusLost(FocusEvent e) {
                FocusLost(e, userSignupLabel, userSignupBorder);
            }
        });
        userSignup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                signupActionPerformed(e);
            }
        });

        userSignupBorder.setBackground(backLight);
        userSignupBorder.setForeground(backLight);

        passSignupLabel.setFont(new Font("Segoe UI", 1, 13));
        passSignupLabel.setForeground(textLight);
        passSignupLabel.setText("Crear Contraseña");

        passSignup.setBackground(backDark);
        passSignup.setFont(new Font("Segoe UI", 0, 18));
        passSignup.setForeground(textLight);
        passSignup.setBorder(null);
        passSignup.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                FocusGained(e, passSignupLabel, passSignupBorder);
            }
            public void focusLost(FocusEvent e) {
                FocusLost(e, passSignupLabel, passSignupBorder);
            }
        });
        passSignup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                signupActionPerformed(e);
            }
        });

        passSignupBorder.setBackground(backLight);
        passSignupBorder.setForeground(backLight);

        passRepeatSignupLabel.setFont(new Font("Segoe UI", 1, 13));
        passRepeatSignupLabel.setForeground(textLight);
        passRepeatSignupLabel.setText("Repetir Contraseña");

        passRepeatSignup.setBackground(backDark);
        passRepeatSignup.setFont(new Font("Segoe UI", 0, 18));
        passRepeatSignup.setForeground(textLight);
        passRepeatSignup.setBorder(null);
        passRepeatSignup.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                FocusGained(e, passRepeatSignupLabel, passRepeatSignupBorder);
            }
            public void focusLost(FocusEvent e) {
                FocusLost(e, passRepeatSignupLabel, passRepeatSignupBorder);
            }
        });
        passRepeatSignup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                signupActionPerformed(e);
            }
        });

        passRepeatSignupBorder.setBackground(backLight);
        passRepeatSignupBorder.setForeground(backLight);
        
        signup.setFont(new Font("Segoe UI", 1, 18));
        signup.setForeground(textLight);
        signup.setText("Registrarse");
        signup.setBorder(new LineBorder(backLight, 1, true));
        signup.setContentAreaFilled(false);
        signup.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signup.setFocusPainted(false);
        signup.setFocusable(false);
        signup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                signupActionPerformed(e);
            }
        });

        GroupLayout loginDataLayout = new GroupLayout(loginData);
        loginData.setLayout(loginDataLayout);
        loginDataLayout.setHorizontalGroup(
            loginDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(loginDataLayout.createSequentialGroup()
                .addGroup(loginDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(loginDataLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(userLogin, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginDataLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(loginDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(login, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                            .addGroup(loginDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(passBorder, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                                .addComponent(userBorder)
                                .addGroup(loginDataLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(passLogin, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)))
                            .addComponent(userLabel)
                            .addComponent(passLabel))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        loginDataLayout.setVerticalGroup(
            loginDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(loginDataLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(userLabel)
                .addGap(0, 0, 0)
                .addComponent(userLogin, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(userBorder, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(passLabel)
                .addGap(0, 0, 0)
                .addComponent(passLogin, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(passBorder, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(login, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        GroupLayout containerLayout = new GroupLayout(containerLogin);
        containerLogin.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(loginData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(loginOptionBorder, GroupLayout.Alignment.LEADING)
                    .addComponent(loginWrapper, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(signupWrapper, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(signupOptionBorder)
                        .addGap(0, 0, 0))))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginWrapper, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupWrapper, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(loginOptionBorder, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(signupOptionBorder, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(loginData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(containerLogin, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(containerLogin, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }
    
    //Cambiar color de selecionado o error
    private void colorChange(JLabel user, JSeparator border, Color text, Color line) {
        user.setForeground(text);
        border.setBackground(line);
        border.setForeground(line);
    }
    
    //Accion cuuando se precione el boton de ingresar
    private void loginOptionActionPerformed(ActionEvent e) {
        
        signupOption.setForeground(textLight);
        signupOption.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signupWrapper.setBackground(backInactive);
        signupOptionBorder.setBackground(backLight);
        signupOptionBorder.setForeground(backLight);
        
        userSignup.setText("");
        passSignup.setText("");
        passRepeatSignup.setText("");
        
        loginOption.setForeground(textActive);
        loginOption.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        loginWrapper.setBackground(backDark);
        loginOptionBorder.setBackground(backDark);
        loginOptionBorder.setForeground(backDark);
        
        loginData.setVisible(true);
        signupData.setVisible(false);
        
    }
    
    //Accion cuuando se precione el boton de registrar
    private void signupOptionActionPerformed(ActionEvent e) {                                             
        
        loginOption.setForeground(textLight);
        loginOption.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginWrapper.setBackground(backInactive);
        loginOptionBorder.setBackground(backLight);
        loginOptionBorder.setForeground(backLight);
        
        userLogin.setText("");
        passLogin.setText("");
        
        signupOption.setForeground(textActive);
        signupOption.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        signupWrapper.setBackground(backDark);
        signupOptionBorder.setBackground(backDark);
        signupOptionBorder.setForeground(backDark);
        
        loginData.setVisible(false);
        signupData.setVisible(true);
        
        GroupLayout signupDataLayout = new GroupLayout(signupData);
        signupData.setLayout(signupDataLayout);
        signupDataLayout.setHorizontalGroup(signupDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(signupDataLayout.createSequentialGroup()
                .addGroup(signupDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(signupDataLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(userSignup, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
                    .addGroup(signupDataLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(signupDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(signup, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                            .addGroup(signupDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(passSignupBorder, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                                .addComponent(userSignupBorder)
                                .addGroup(signupDataLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(passSignup, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)))
                            .addComponent(userSignupLabel)
                            .addComponent(passSignupLabel)
                            .addGroup(signupDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(passRepeatSignupBorder, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                                .addGroup(signupDataLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(passRepeatSignup, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)))
                            .addComponent(passRepeatSignupLabel))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        signupDataLayout.setVerticalGroup(signupDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(signupDataLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(userSignupLabel)
                .addGap(0, 0, 0)
                .addComponent(userSignup, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(userSignupBorder, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(passSignupLabel)
                .addGap(0, 0, 0)
                .addComponent(passSignup, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(passSignupBorder, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(passRepeatSignupLabel)
                .addGap(0, 0, 0)
                .addComponent(passRepeatSignup, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(passRepeatSignupBorder, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(signup, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        GroupLayout containerLayout = new GroupLayout(containerLogin);
        containerLogin.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(signupData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(loginOptionBorder, GroupLayout.Alignment.LEADING)
                    .addComponent(loginWrapper, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(signupWrapper, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(signupOptionBorder)))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginWrapper, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupWrapper, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(loginOptionBorder, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupOptionBorder, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(signupData, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(containerLogin, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(containerLogin, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
        
        userSignup.requestFocus();
        
    }
    
    //Accion cuuando se precione el boton de login
    private void loginActionPerformed(ActionEvent e) {
        
        //Obtener la informacion del los campos y guardarla
        String user = userLogin.getText();
        String pass = passLogin.getText();
        
        //Instanciar objeto para validacion de campos
        FieldCheck checkField = new FieldCheck();
        
        //Validar si los campos estan vacios
        boolean check = checkField.checkLogin(user, pass, userLabel, passLabel, userBorder, passBorder, userLogin, passLogin, textError);
            
        if (check) {
            //Si los campos estan llenos
            
            //Instanciar el objeto de usuarios
            Sellers users = new Sellers();
            
            //Validar si el usuario esta en la base de datos
            boolean auth = users.Authenticate(user, pass);

            //Mostrar información de logeo
            if (auth) {

                //Si logueo fue exitoso
                dispose();
                
                //Instanciar menu
                MenuTest menu = new MenuTest();

            } else {

                //Si logueo no fue exitoso
                Message loginError = new Message(this, true, "Error!", backDark, textLight,
                        "Usuario o Contraseña incorrecta!",
                        "Verifica e intentalo una vez más");
                
                userLogin.requestFocus();

            }
            
        }
        
    }
    
    //Accion cuuando se precione el boton de signup
    private void signupActionPerformed(ActionEvent e) {
        
        //Obtener la informacion del los campos y guardarla
        String user = userSignup.getText();
        String pass = passSignup.getText();
        String passRepeat = passRepeatSignup.getText();
        
        //Instanciar objeto para validacion de campos
        FieldCheck checkField = new FieldCheck();
        
        //Validar si los campos estan vacios
        boolean check = checkField.checkSignup(user, pass, passRepeat, userSignupLabel, passSignupLabel, passRepeatSignupLabel, userSignupBorder, passSignupBorder, passRepeatSignupBorder, userSignup, passSignup, passRepeatSignup, textError);
        
        if (check) {
            
            //Validar si las claves coiciden
            if (pass.equals(passRepeat)) {
                
                //Variables con la longitud del usuario y contraseña
                boolean userLenght = checkField.checkLenght(user);
                boolean passLenght = checkField.checkLenght(pass);
                
                if (userLenght && passLenght) {
                    
                    //Longitud del user y pass es mayor a 8
                    
                    if (userLenght) {

                        //Longitud del user es mayor a 8

                        if (passLenght) {

                            //Longitud del pass es mayor a 8

                            //Instanciar el objeto de usuarios
                            Sellers users = new Sellers();

                            //Validar si el usuario esta en la base de datos
                            boolean checkName = users.checkName(user);

                            //Mostrar información si ya hay usuario igual
                            if (!checkName) {

                                //Usuario no existente

                                //Agregar usuario
                                users.setInfo(cont, user, pass);
                                cont += 1;

                                Message SignupSuccessfull = new Message(this, true, "Registro completado!", backDark, textLight,
                                        "El usuario ha sido registrado!",
                                        "Ingresa al sistema");

                                //Mandar a ingresar
                                loginOptionActionPerformed(e);

                            } else {

                                //Usuario ya existente
                                Message UserBad = new Message(this, true, "Error!", backDark, textLight,
                                        "El usuario que ingresaste no esta disponible!",
                                        "Intenta otro usuario");

                                userSignup.requestFocus();

                            }

                        } else {

                            //Longitud del pass es menor a 8
                            Message UserShort = new Message(this, true, "Error!", backDark, textLight,
                                    "Contraseña muy corta!",
                                    "Ingresar por lo menos 8 caracteres");

                            passSignup.requestFocus();

                        }

                    } else {

                        //Longitud del user es menor a 8
                        Message PassShort = new Message(this, true, "Error!", backDark, textLight,
                                "Usuario muy corto!",
                                "Ingresar por lo menos 8 caracteres");

                        userSignup.requestFocus();

                    }
                    
                } else {
                    
                    //Longitud del user y pass es menor a 8
                        Message DataShort = new Message(this, true, "Error!", backDark, textLight,
                                "Usuario y contraseña muy cortos!",
                                "Ingresar por lo menos 8 caracteres");

                        userSignup.requestFocus();
                    
                }
                
                
                
            } else {
                
                //Claves no cooinciden
                Message noCooinciden = new Message(this, true, "Error!", backDark, textLight,
                            "Las contraseñas que ingresaste no cooinciden",
                            "verifica la informacion e intentalo una vez más");
                
                passSignup.requestFocus();
                
            }
        }
        
    }
    
    //Accion cuando se selecciona un campo
    private void FocusGained(FocusEvent e, JLabel user, JSeparator border) {
        colorChange(user, border, textActive, textActive);
    }
    
    //Accion cuando se deselecciona un campo
    private void FocusLost(FocusEvent e, JLabel user, JSeparator border) {
        colorChange(user, border, textLight, backLight);
    }
    
}