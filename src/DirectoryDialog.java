/*
 * DirectoryDialog
 *
 * Copyright (c) 2005-2006 Eugene Matyushkin (E-mail: skipy@mail.ru)
 *
 * License agreement:
 *
 * 1. This code is published AS IS. Author is not responsible for any damage that can be
 *    caused by any application that uses this code.
 * 2. Author does not give a garantee, that this code is error free.
 * 3. This code can be used in NON-COMMERCIAL applications AS IS without any special
 *    permission from author.
 * 4. This code can be modified without any special permission from author IF AND ONLY IF
 *    this license agreement will remain unchanged.
 * 5. SPECIAL PERMISSION for this code usage in COMMERCIAL application SHOULD be obtained
 *    from author.
 */

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.*;

/**
 * DirectoryDialog - manual implementation
 * 
 * @version 1.0
 * @author Eugene Matyushkin
 */
public class DirectoryDialog extends JFrame {

    private JLabel lblChooseDrive;
    private JLabel lblChooseDirectory;
    private JComboBox cbxDrive;
    private JTree diskTree;
    private JButton btnOk;
    private JButton btnCancel;
    private JButton btnCreate;
    private JButton btnRoot;

    /**
     * Constructs Dialog
     */
    public DirectoryDialog(){
        super("DirectoryDialog - manual");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel cp = new JPanel();
        cp.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        cp.setLayout(gbl);
        lblChooseDrive = new JLabel("Choose Drive");
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 2.0;
        gbl.setConstraints(lblChooseDrive, gbc);

        cbxDrive = new JComboBox(new Object[]{"C:\\","D:\\","E:\\"});
        gbc.gridwidth = 1;
        gbl.setConstraints(cbxDrive, gbc);

        btnOk = new JButton("Ok");
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 0;
        gbc.insets.left = 4; // растояние между элементами
        gbl.setConstraints(btnOk, gbc);

        lblChooseDirectory = new JLabel("Choose Directory");
        gbc.weightx = 1;
        gbc.insets.left = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.SOUTHWEST;

        btnCancel = new JButton("Cancel");
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 0;
        gbc.insets.left = 5;
        gbc.insets.bottom = 10;
        gbc.anchor = GridBagConstraints.CENTER;
        gbl.setConstraints(btnCancel, gbc);

        diskTree  = new JTree();
        JScrollPane sp = new JScrollPane(diskTree);
        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.insets.left = 0;
        gbc.insets.bottom = 0;
        gbc.fill = GridBagConstraints.BOTH;

        btnCreate = new JButton("Create New...");
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = 1;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.insets.left = 5;
        gbc.insets.bottom = 10;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbl.setConstraints(btnCreate,gbc);

        btnRoot = new JButton("Project Root...");
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.NORTH;
        gbl.setConstraints(btnRoot, gbc);
        cp.add(lblChooseDrive);
        cp.add(cbxDrive);
        cp.add(btnOk);
        cp.add(lblChooseDirectory);
        cp.add(btnCancel);
        cp.add(sp);
        cp.add(btnCreate);
        cp.add(btnRoot);
        setContentPane(cp);
        setSize(400,300);
    }

    /**
     * Runs dialog window
     */
    public static void main(String[] args) {
        DirectoryDialog dialog = new DirectoryDialog();
        dialog.setVisible(true);
    }

}
