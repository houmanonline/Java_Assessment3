/*
 * This is the code of Question1 B
 */
package Question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 * ICTPRG523 Apply Advanced Programming Skills In Another Language
 * Student Name: Man Hou
 * Student ID :10042466
 */
public class DisplayDetails extends javax.swing.JFrame {     
     // Create an instance of Players
     Players player = new Players();
     // Create 3 variables to store classmembers of Achievement
     String description;
     int level;
     int maximum;
     
     
    public DisplayDetails() {
//        JTableHeader header = jtableAchievement.getTableHeader();
//        header.addMouseListener(l);
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

        btnExit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txbFilePath = new javax.swing.JTextField();
        btnReadFile = new javax.swing.JButton();
        jTextSearchInput = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jLabelSearch = new javax.swing.JLabel();
        jButtonSort = new javax.swing.JButton();
        jButtonSortByLevel = new javax.swing.JButton();
        jTextFieldInputPath = new javax.swing.JTextField();
        jButtonConvert = new javax.swing.JButton();
        jLabelInput = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableAchievement = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        lblPlayerNameAndTime = new javax.swing.JLabel();

        btnExit.setText("Exit");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        txbFilePath.setText("C:\\Users\\PC\\Desktop\\test.csv");
        txbFilePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbFilePathActionPerformed(evt);
            }
        });

        btnReadFile.setText("Read File");
        btnReadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadFileActionPerformed(evt);
            }
        });

        jTextSearchInput.setText("Input the achievement you want to search");

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jLabelSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelSearch.setText("Search:");

        jButtonSort.setText("Sort by Description");
        jButtonSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSortActionPerformed(evt);
            }
        });

        jButtonSortByLevel.setText("Sort by Level");
        jButtonSortByLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSortByLevelActionPerformed(evt);
            }
        });

        jTextFieldInputPath.setText("C:\\Users\\PC\\Desktop\\Players.csv");

        jButtonConvert.setText("Convert");
        jButtonConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertActionPerformed(evt);
            }
        });

        jLabelInput.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelInput.setText("Input File:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txbFilePath, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextSearchInput, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelInput)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldInputPath, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnReadFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButtonConvert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSort)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSortByLevel))
                            .addComponent(jLabelSearch))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReadFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSort)
                    .addComponent(jButtonSortByLevel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextSearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInput)
                    .addComponent(jTextFieldInputPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConvert))
                .addGap(82, 82, 82))
        );

        jtableAchievement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Description", "Level", "Out of Possible"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtableAchievement);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit)
                .addContainerGap())
        );

        lblPlayerNameAndTime.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        lblPlayerNameAndTime.setText("Display Player Name and Time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblPlayerNameAndTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPlayerNameAndTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void btnReadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadFileActionPerformed
        // Clear the arraylist everytime click button
        player.getAchievements().clear();
        // Get file path from Textbox
        Path pathToFile = Paths.get(txbFilePath.getText());
        // create an instance of BufferedReader
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                    StandardCharsets.UTF_8))
        {
            // read the first line from the text file 
            String line = br.readLine();
            while (line != null) 
            { 
            // use string.split to load a string array with the values from 
            // each line of 
            // the file, using a comma as the delimiter 
            String[] attributes = line.split(",");
            String title = attributes[0];
            //if the line describes a player, set player's name
            //if the line describes an achievement, create an instance of Achievement,
            //then add into an ArrayList which is a class member of Players
            if (title.equals("﻿Player"))
                {
                    player.setUsername(attributes[1].trim());
                    player.setTagname(attributes[2].trim());
                }else if(title.equals("Achievement"))
                {
                    description = attributes[1].trim();
                    level = Integer.parseInt(attributes[2].trim());
                    maximum = Integer.parseInt(attributes[3].trim());
                    Achievement achievement = new Achievement(description, level, maximum);
                    player.populateAchievements(achievement);
                }
            line = br.readLine();
            }
        }
         catch (IOException ex) {
            Logger.getLogger(DisplayDetails.class.getName()).log(Level.SEVERE, null, ex);
        }  
        // output in console
        System.out.println(player.getUsername());
        System.out.println(player.getTagname());
        for (int i =0; i<player.getAchievements().size(); i ++)
        {
            System.out.println(player.getAchievement(i).getDescription());
            System.out.println(Integer.toString(player.getAchievement(i).getLevel()));
            System.out.println(Integer.toString(player.getAchievement(i).getMaximum()));
        }
        lblPlayerNameAndTime.setText("Achievements of " + player.getTagname() + " at " + player.timeStamp() );
        // display in the table
        this.displayInTheTable(player);
        
    }//GEN-LAST:event_btnReadFileActionPerformed

    private void txbFilePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbFilePathActionPerformed
        // TODO add your handling code here: double clicked by mistake
    }//GEN-LAST:event_txbFilePathActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // Exit Button
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void jButtonSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSortActionPerformed
        // Create a description comparator
        Comparator<Achievement> nameComparator;
        nameComparator = new Comparator<Achievement>(){
            @Override
            public int compare(Achievement o1, Achievement o2) {
                return o1.getDescription().compareTo(o2.getDescription());
            }
        };
        // sort the Achievements
        player.getAchievements().sort(nameComparator);
        // display in the table
        this.displayInTheTable(player);
     
    }//GEN-LAST:event_jButtonSortActionPerformed
    
    private void jButtonSortByLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSortByLevelActionPerformed
        // Create a level comparator 
        Comparator<Achievement> LevelComparator;
        LevelComparator = new Comparator<Achievement>(){
            @Override
            public int compare(Achievement o1, Achievement o2) {
                return o1.getLevel() - o2.getLevel();
            }
        };
        // sort the Achievements
        player.getAchievements().sort(LevelComparator);
        // display in the table
        this.displayInTheTable(player);
    }//GEN-LAST:event_jButtonSortByLevelActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        
        DefaultTableModel dmSearchResult = new DefaultTableModel(0, 0);
        String header[] = new String[]{"Description", "Level", "Out of Possible"};
        dmSearchResult.setColumnIdentifiers(header);
        int size = player.getAchievements().size();
        for (int r = 0; r < size; r++) {
              if (jTextSearchInput.getText().equals(player.getAchievement(r).getDescription().toString()))
              {
                  jtableAchievement.setModel(dmSearchResult);
                  dmSearchResult.addRow(new String[]{player.getAchievement(r).getDescription(),
                                     Integer.toString(player.getAchievement(r).getLevel()),
                                     Integer.toString(player.getAchievement(r).getMaximum())});
                  jtableAchievement.setModel(dmSearchResult);
                  break;
              }
              else
              {lblPlayerNameAndTime.setText("Can not find " + jTextSearchInput.getText() + ".");}
        }
        
        
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertActionPerformed
        // TODO add your handling code here:
        PlayersList pl = new PlayersList();
        PDFGenerator pdfGenerator = new PDFGenerator();
//        Players playerInList = new Players();
        Path pathOfPlayersList = Paths.get(jTextFieldInputPath.getText());
        try (BufferedReader brPlayersList = Files.newBufferedReader(pathOfPlayersList,
                    StandardCharsets.UTF_8))
        {
            String line = brPlayersList.readLine();
            while (line != null)
            {
            String[] attributes = line.split(",");
            String title = attributes[0];
              System.out.println(pl.getPl().size());
                System.out.println(title);
            if (title.equals("﻿Player"))
                {
                    Players playerInList = new Players();
                    playerInList.setUsername(attributes[1].trim());
                    playerInList.setTagname(attributes[2].trim());
                    System.out.println(playerInList.getUsername());
                    System.out.println(playerInList.getTagname());
                    // add player into ArrayList            
                    pl.populatePlayerList(playerInList);
                }
            else if(title.equals("Achievement"))
                {
                    description = attributes[1].trim();
                    level = Integer.parseInt(attributes[2].trim());
                    maximum = Integer.parseInt(attributes[3].trim());
                    Achievement achievement = new Achievement(description, level, maximum);
                    // add achievements into player
                    pl.getPlayer(pl.getPl().size() - 1).populateAchievements(achievement);
                }
            line = brPlayersList.readLine();        
            }         
            pdfGenerator.execute(pl);
        }
        catch (IOException ex) {
            Logger.getLogger(DisplayDetails.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
    }//GEN-LAST:event_jButtonConvertActionPerformed
    public void displayInTheTable(Players player)
    { 
        DefaultTableModel dm = new DefaultTableModel(0, 0);
        String header[] = new String[]{"Description", "Level", "Out of Possible"};
        dm.setColumnIdentifiers(header); 
        int size = player.getAchievements().size();
        for (int r = 0; r < size; r++) {
              dm.addRow(new String[]{player.getAchievement(r).getDescription(),
                                     Integer.toString(player.getAchievement(r).getLevel()),
                                     Integer.toString(player.getAchievement(r).getMaximum())});
        }
        jtableAchievement.setModel(dm);  
    }
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
            java.util.logging.Logger.getLogger(DisplayDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReadFile;
    private javax.swing.JButton jButtonConvert;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonSort;
    private javax.swing.JButton jButtonSortByLevel;
    private javax.swing.JLabel jLabelInput;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldInputPath;
    private javax.swing.JTextField jTextSearchInput;
    private javax.swing.JTable jtableAchievement;
    private javax.swing.JLabel lblPlayerNameAndTime;
    private javax.swing.JTextField txbFilePath;
    // End of variables declaration//GEN-END:variables
}
