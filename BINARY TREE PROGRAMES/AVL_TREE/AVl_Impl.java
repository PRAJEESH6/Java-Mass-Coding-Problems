package AVL_TREE;

public class AVl_Impl {

        Node Root;

        class Node{
            int data;
            int height;
            Node Left;
            Node Right;

            Node(int val)
            {
                data = val;
                height = 0;
                Left = null;
                Right = null;
            }
        }

        public AVl_Impl(int val)
        {
            Root = new Node(val);
        }

        public AVl_Impl()
        {
            Root = null;
        }

        public void InsertTree(int val)
        {
            Root = InsertTree(Root,val);
        }

        public int FindHeight(Node node)
        {
            if (node == null)
            {
                return -1;
            }

            return node.height;
        }

        public int FindMaximum(int a,int b)
        {
            return a > b ? a : b;
        }

        private int FindBalanceFactor(Node node)
        {
            if (node == null)
            {
                return 0;
            }

            return FindHeight(node.Left) - FindHeight(node.Right);
        }

        public Node InsertTree(Node node,int val)
        {
            if (node == null)
            {
                return new Node(val);
            }

            if (val < node.data)
            {
                node.Left = InsertTree(node.Left,val);

            } else if (val > node.data) {

               node.Right = InsertTree(node.Right,val);

            }else {
                return node; // Duplicate values are not allowed
            }

            node.height = 1 + FindMaximum(FindHeight(node.Left), FindHeight(node.Right));

            int BalanceFactor = FindBalanceFactor(node);

            //LEFT LEFT CASE

            if (BalanceFactor > 1 && val < node.Left.data)
            {
                return RightRotate(node);
            }

            //LEFT RIGHT CASE

            if (BalanceFactor > 1 && val > node.Left.data)
            {
                node.Left = LeftRotate(node.Left);
                return RightRotate(node);
            }

            //RIGHT RIGHT CASE

            if (BalanceFactor < -1 && val > node.Right.data)
            {
                return LeftRotate(node);
            }

            //RIGHT LEFT CASE

            if (BalanceFactor < -1 && val < node.Right.data)
            {
                node.Right = RightRotate(node.Right);
                return RightRotate(node);
            }


            return node;
        }

        public static void InOrderTraverse(Node node)
        {
            if(node != null)
            {
                InOrderTraverse(node.Left);
                System.out.println(node.data + " The Height is :" + node.height);
                InOrderTraverse(node.Right);
            }
        }

        public Node Search_Nodes(Node node,int val)
        {
            if (node == null || node.data == val)
            {
                return node;
            }

            if (val < node.data)
            {
                return Search_Nodes(node.Left,val);
            }

            return Search_Nodes(node.Right,val);
        }

        private Node RightRotate(Node Z)
        {
            Node Y = Z.Left;
            Node T3 = Y.Right;

            Y.Right = Z;
            Z.Left = T3;

            Z.height = 1 + FindMaximum(FindHeight(Z.Left), FindHeight(Z.Right));
            Y.height = 1 + FindMaximum(FindHeight(Y.Left), FindHeight(Y.Right));

            return Y;
        }

        private Node LeftRotate(Node Z)
        {
            Node Y = Z.Right;
            Node T3 = Y.Left;

            Y.Left = Z;
            Z.Right = T3;

            Z.height = 1 + FindMaximum(FindHeight(Z.Left), FindHeight(Z.Right));
            Y.height = 1 + FindMaximum(FindHeight(Y.Left), FindHeight(Y.Right));

            return Y;
        }

}
