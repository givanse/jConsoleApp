package gui.view;

import gui.control.BoardMouseListener;
import game.GameService;
import gui.control.BoardController;
import gui.control.GameStateController;
import gui.control.ScoreController;
import gui.control.SpeedController;
import gui.model.GameModel;
import gui.model.GameModel.GameState;

/**
 *
 * @author givanse
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MainWindow() {
        initComponents();
        
        this.startNewGame();
        
        this.boardPanel.addMouseListener(new BoardMouseListener(
                            this.boardPanel, this.textAreaLog, this.gameModel));
        new ScoreController(this.scoreField, this.gameModel);
        new SpeedController(this.speedField, this.gameModel);
        new GameStateController(this.textAreaLog, this.gameModel);
        new BoardController(this.boardPanel, this.gameModel); 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonNewGame = new javax.swing.JButton();
        buttonPause = new javax.swing.JToggleButton();
        boardPanel = new gui.view.BoardPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaLog = new javax.swing.JTextArea();
        scoreField = new javax.swing.JTextField();
        speedField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Video Game");
        setMinimumSize(new java.awt.Dimension(580, 630));
        setName("Java Game"); // NOI18N
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                handleKeyTyped(evt);
            }
        });

        buttonNewGame.setFocusable(false);
        buttonNewGame.setLabel("<N>ew");
        buttonNewGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonNewGameMouseClicked(evt);
            }
        });

        buttonPause.setText("<P>ause");
        buttonPause.setFocusable(false);
        buttonPause.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                handleButtonPauseStateChanged(evt);
            }
        });

        boardPanel.setBackground(BoardPanel.BACKGROUND_COLOR);
        boardPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        boardPanel.setFocusable(false);
        boardPanel.setPreferredSize(new java.awt.Dimension(BoardPanel.CANVAS_WIDTH, BoardPanel.CANVAS_HEIGHT));

        javax.swing.GroupLayout boardPanelLayout = new javax.swing.GroupLayout(boardPanel);
        boardPanel.setLayout(boardPanelLayout);
        boardPanelLayout.setHorizontalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        boardPanelLayout.setVerticalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        textAreaLog.setEditable(false);
        textAreaLog.setColumns(5);
        textAreaLog.setRows(8);
        textAreaLog.setBorder(javax.swing.BorderFactory.createTitledBorder("Log"));
        textAreaLog.setFocusable(false);
        jScrollPane1.setViewportView(textAreaLog);

        scoreField.setEditable(false);
        scoreField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        scoreField.setText("000000000");
        scoreField.setBorder(javax.swing.BorderFactory.createTitledBorder("Score"));
        scoreField.setFocusable(false);

        speedField.setEditable(false);
        speedField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        speedField.setText("000");
        speedField.setBorder(javax.swing.BorderFactory.createTitledBorder("Speed"));
        speedField.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPause, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(speedField)
                        .addComponent(scoreField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(buttonNewGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(speedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPause)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNewGame)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                    .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void handleButtonPauseStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_handleButtonPauseStateChanged
        this.handleEventPauseGame();
    }//GEN-LAST:event_handleButtonPauseStateChanged

    private void handleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_handleKeyTyped
        char keyTyped = evt.getKeyChar();
        if(keyTyped ==  'p' || keyTyped ==  'P')
            this.buttonPause.setSelected(!this.buttonPause.isSelected());
        if(keyTyped ==  'n' || keyTyped ==  'N')
            this.startNewGame();
    }//GEN-LAST:event_handleKeyTyped

    private void buttonNewGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNewGameMouseClicked
        this.startNewGame();
    }//GEN-LAST:event_buttonNewGameMouseClicked

    private void handleEventPauseGame() {
        boolean isPaused = this.buttonPause.isSelected();
        if(isPaused) {
            this.gameModel.setGameState(GameState.PAUSED);
        } else {
            this.gameModel.setGameState(GameState.RUNNING);
        }
    }
    
    private void startNewGame() {
        if(this.gameModel == null) {
            this.gameModel = new GameModel();
            this.gameService = new GameService(this.gameModel);
        } else {
            this.gameModel.startNewGame();
        }
    }
    
    public void startGame() {
        this.gameService.start();
    }
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | 
                 InstantiationException | 
                 IllegalAccessException | 
                 javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow mainWindow = new MainWindow();
                mainWindow.setVisible(true);
                mainWindow.startGame();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.view.BoardPanel boardPanel;
    private javax.swing.JButton buttonNewGame;
    private javax.swing.JToggleButton buttonPause;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField scoreField;
    private javax.swing.JTextField speedField;
    private javax.swing.JTextArea textAreaLog;
    // End of variables declaration//GEN-END:variables
    private GameModel gameModel;
    private GameService gameService;
}
