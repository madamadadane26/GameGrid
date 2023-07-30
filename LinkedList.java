public class LinkedList {

    public Node oHeadNode = new Node();

    public void addNode(int x, int y) {

        Node newNode = new Node();


        newNode.xPosition = x;
        newNode.yPosition = y;

        newNode.nextNode = oHeadNode;
        oHeadNode = newNode;

    }

    public Node removeHeadNode() {

        Node temp = oHeadNode;

        oHeadNode = oHeadNode.nextNode;
        return temp;
    }
}