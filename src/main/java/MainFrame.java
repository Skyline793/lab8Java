/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Skyline
 */
public class MainFrame extends javax.swing.JFrame {

    private DefaultTableModel md;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        md = (DefaultTableModel)jTable.getModel();
        md.addRow(new Object[] {"12", "13", "32", 1, 1});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        DeljLabel = new javax.swing.JLabel();
        DeljTextField = new javax.swing.JTextField();
        deljButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        EditjMenu = new javax.swing.JMenu();
        AddjMenuItem = new javax.swing.JMenuItem();
        DeletejMenuItem = new javax.swing.JMenuItem();
        DeletejMenu = new javax.swing.JMenu();
        SortjMenu = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Список фигур");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.hoverBorderColor"));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.darkGray);
        setResizable(false);

        jTable.setBackground(new java.awt.Color(177, 211, 243));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Тип фигуры", "Цвет", "Данные фигуры", "Периметр", "Площадь"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setToolTipText("");
        jTable.setFocusTraversalPolicyProvider(true);
        jTable.setGridColor(new java.awt.Color(177, 211, 243));
        jTable.setName(""); // NOI18N
        jTable.setPreferredSize(new java.awt.Dimension(300, 200));
        jTable.setShowGrid(false);
        jTable.setSurrendersFocusOnKeystroke(true);
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(2).setPreferredWidth(300);
            jTable.getColumnModel().getColumn(3).setResizable(false);
            jTable.getColumnModel().getColumn(4).setResizable(false);
        }

        DeljLabel.setText("Выберите строку, которую хотите удалить:");

        deljButton.setText("Удалить");

        jMenuBar1.setName(""); // NOI18N

        EditjMenu.setText("Редактирование");

        AddjMenuItem.setText("Добавить");
        AddjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddjMenuItemActionPerformed(evt);
            }
        });
        EditjMenu.add(AddjMenuItem);

        DeletejMenuItem.setText("Удалить");
        EditjMenu.add(DeletejMenuItem);

        jMenuBar1.add(EditjMenu);
        jMenuBar1.add(DeletejMenu);

        SortjMenu.setText("Сортировка");

        jMenu1.setText("По площади");

        jMenuItem1.setText("По возрастанию");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("По убыванию");
        jMenu1.add(jMenuItem2);

        SortjMenu.add(jMenu1);

        jMenu2.setText("По периметру");

        jMenuItem3.setText("По возрастанию");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("По убыванию");
        jMenu2.add(jMenuItem4);

        SortjMenu.add(jMenu2);

        jMenuBar1.add(SortjMenu);

        setJMenuBar(jMenuBar1);
        jMenuBar1.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DeljLabel)
                        .addGap(50, 50, 50)
                        .addComponent(DeljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deljButton)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeljLabel)
                    .addComponent(DeljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deljButton))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddjMenuItemActionPerformed
        AddForm f = new AddForm();
        f.setVisible(true);
    }//GEN-LAST:event_AddjMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddjMenuItem;
    private javax.swing.JMenu DeletejMenu;
    private javax.swing.JMenuItem DeletejMenuItem;
    private javax.swing.JLabel DeljLabel;
    private javax.swing.JTextField DeljTextField;
    private javax.swing.JMenu EditjMenu;
    private javax.swing.JMenu SortjMenu;
    private javax.swing.JButton deljButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
