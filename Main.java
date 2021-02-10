private void startGame(){
        gameOver = false;
        loop = new Timer(10, new ActionListener() {

@Override
public void actionPerformed(ActionEvent x) {

        board.play();
        frame.repaint();
        }});
        loop.start()}

@Override
public void paint(Graphics g) {

        Point a = board.getBird().getLeftBottemCorner();
        Point b = (board.getBird().getRightUpCorner());
        g.setColor(Color.red);
        g.fillRect(a.x, a.y, b.x - a.x, b.y - a.y);
        drawHurdles(g);
        g.setColor(Color.red);
        g.drawString("Score: " + board.getBird().getHighScore(),10 , board.getBoardHight()+15);


        }
private void drawHurdles(Graphics g) {
        g.setColor(Color.black);
        ArrayList<Model.BOX> hurdles = board.getHindernisse().getHurdles();
        Iterator<BOX> it = hurdles.iterator();
        Point a;
        Point b;
        BOX akt;
        int hoehe;
        while (it.hasNext()) {
        akt = it.next();
        hoehe = akt.getRightUpCorner().y - akt.getLeftBottemCorner().y;
        a = akt.getLeftBottemCorner();
        b = akt.getRightUpCorner();
        g.fillRect(a.x, a.y, b.x - a.x,  hoehe);
        System.out.println(a + ", " + b + ", " + hoehe);

        }
        }
