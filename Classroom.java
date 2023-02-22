//Cycle Detection (Undirected Graph)-----------------------------------
import java.util.*;

public class Classroom {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1, 2));
        
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean [graph.length];
        for(int i=0; i<graph.length; i++) {
            if(!vis[i]) {
                if(detectCycleUtil(graph, vis, i, -1)) {
                    return true;
                    //cycle exists in one of the parts
                }

            }
        }

        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par) {
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            //case3 
            if(!vis[e.dest]) {
                if(detectCycleUtil(graph, vis, e.dest, curr)) {
                    return true;
                }
            }
            //case1
            else if(vis[e.dest] && e.dest != par) {
                return true;
            }
            //case 2 -> do nothing -> continue
        }

        return false;
    }

    public static void main(String args[]) {
        /*
                0 -------- 3
               /|          |
              / |          |
             1  |          4
              \ |
               \|
                2
         */

         int V = 5;
         ArrayList<Edge> graph[] = new ArrayList[V];
         createGraph(graph);
         System.out.println(detectCycle(graph));
    }
}

// // Prefix Problem-------------------------------------------------------------------------------------
// public class Classroom {
//     static class Node {
//         Node[] children = new Node[26];
//         boolean eow = false;
//         int freq;

//         public Node() {
//             for(int i=0; i<children.length; i++) {
//                 children[i] = null;
//             }
//             freq = 1;
//         }
//     }

//     public static Node root = new Node();

//     public static void insert(String word) {
//         Node curr = root;
//         for(int i=0; i<word.length(); i++) {
//             int idx = word.charAt(i)-'a';
//             if(curr.children[idx] == null) {
//                 curr.children[idx] = new Node();
//             } else {
//                 curr.children[idx].freq++;
//             }

//             curr = curr.children[idx];
//         }

//         curr.eow = true;
//     }

//     public static void findPrefix(Node root, String ans) {
//         if(root == null) {
//             return;
//         }

//         if(root.freq == 1) {
//             System.out.println(ans);
//             return;
//         }
//         for(int i=0; i<root.children.length; i++) {
//             if(root.children[i] != null) {
//                 findPrefix(root.children[i], ans+(char)(i+'a'));
//             }
//         }
//     }


//     public static void main(String args[]) {
//         String arr[] = {"zebra", "dog", "duck", "dove"};
//         for(int i=0; i<arr.length; i++) {
//             insert(arr[i]);
//         }

//         root.freq = -1;
//         findPrefix(root, "");
//     }
// }

// // Insertion in Trie-------------------------------------------------------------------------
// public class Classroom {
//     static class Node {
//         Node children[] = new Node[26];
//         boolean eow = false;

//         Node() {
//             for(int i=0; i<26; i++) {
//                 children[i] = null;
//             }
//         }
//     }

//     public static Node root = new Node();

//     public static void insert(String word) { //O(L)
//         Node curr = root;
//         for(int level=0; level<word.length(); level++) {
//             int idx = word.charAt(level) - 'a';
//             if(curr.children[idx] == null) {
//                 curr.children[idx] = new Node();
//             }
//             curr = curr.children[idx];
//         }

//         curr.eow = true;
//     }

//     public static void main(String args[]) {
//         String words[] = {"the", "a", "there", "their", "any", "thee"};
//         for(int i=0; i<words.length; i++) {
//             insert(words[i]);
//         }
//     }
// }

// import java.util.*;
// // Union Intersection------------------------------------------------------
// public class Classroom {
//     public static void main(String args[]) {
//         int arr1[] = {7, 3, 9};
//         int arr2[] = {6, 3, 9, 2, 9, 4};
//         HashSet<Integer> set = new HashSet<>();

//         //union
//         for(int i=0; i<arr1.length; i++){
//             set.add(arr1[i]);
//         }

//         for(int i=0; i<arr2.length; i++) {
//             set.add(arr2[i]);
//         }

//         System.out.println("union = " +set.size());
        

//         //intersection
//         set.clear();
//         for(int i=0; i<arr1.length; i++) {
//             set.add(arr1[i]);
//         }

//         int count = 0;
//         for(int i=0; i<arr2.length; i++) {
//             if(set.contains(arr2[i])) {
//                 count++;
//                 set.remove(arr2[i]);
//             }
//         }

//         System.out.println("intersection = " +count);
//     }
// }



//import java.util.*;
// // Valid Anagram--------------------------------------------
// public class Classroom {
//     public static boolean isAnagram(String s, String t) {
//         HashMap<Character, Integer> map = new HashMap<>();

//         for(int i=0; i<s.length(); i++) {
//             char ch = s.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }

//         for(int i=0; i<t.length(); i++) {
//             char ch = t.charAt(i);
//             if(map.get(ch) != null) {
//                 if(map.get(ch) == 1) {
//                     map.remove(ch);
//                 } else {
//                     map.put(ch, map.get(ch) -1);
//                 }
//             } else {
//                 return false;
//             }
//         }

//         return map.isEmpty();
//     }

//     public static void main(String args[]) {
//         String s = "race";
//         String t = "care";

//         System.out.println(isAnagram(s, t));
//     }
// }
//-------------------------------------------------------------------------
// // import java.util.*;
// import java.util.Comparator;
// import java.util.PriorityQueue;

// public class Classroom{
//     static class Student implements Comparable<Student> { // Overrinding 
//         String name;
//         int rank;

//         public Student(String name, int rank) {
//             this.name = name;
//             this.rank = rank;
//         }

//         @Override
//         public int compareTo(Student s2) {
//             return this.rank - s2.rank;
//         }
//     }

//     public static void main(String args[]) {
//         PriorityQueue<Student> pq = new PriorityQueue<>();

//         pq.add(new Student("A", 4)); // O(logn)
//         pq.add(new Student("B", 5));
//         pq.add(new Student("C", 2));
//         pq.add(new Student("D", 12));

//         while(!pq.isEmpty()) {
//             System.out.println(pq.peek().name +" -> " + pq.peek().rank); //O(1)
//             pq.remove(); //O(logn)
//         }
//     }
// }
// // PQ in JCF--------------------------------------------------------------------------------------
//     public static void main(String args[]) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

//         pq.add(3); // O(log n)
//         pq.add(4);
//         pq.add(1);
//         pq.add(7);

//         while(!pq.isEmpty()) {
//             System.out.println(pq.peek()); // 0(1) 
//             pq.remove(); // O(log n)
//         }
//     }
// }
// // Merge 2 BSTs------------------------------------------------------------------------------

//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }
 
//     public static void getInorder(Node root, ArrayList<Integer> arr) {
//         if(root == null) {
//             return;
//         }

//         getInorder(root.left, arr);
//         arr.add(root.data);
//         getInorder(root.right, arr);
//     }

//     public static Node createBST(ArrayList<Integer> arr, int st, int end) {
//         if(st > end) {
//             return null;
//         }
//         int mid = (st+end)/2;
//         Node root = new Node(arr.get(mid));
//         root.left = createBST(arr, st, mid-1);
//         root.right = createBST(arr, mid+1, end);
//         return root;
//     }


//     public static Node mergeBSTs(Node root1, Node root2) {
//         //step1
//         ArrayList<Integer> arr1 = new ArrayList<>();
//         getInorder(root1, arr1);

//         //step2 
//         ArrayList<Integer> arr2 = new ArrayList<>();
//         getInorder(root2, arr2);

//         //merge
//         int i=0, j=0;
//         ArrayList<Integer> finalArr = new ArrayList<>();
//         while(i<arr1.size() && j<arr2.size()) {
//             if(arr1.get(i) <= arr2.get(j)) {
//                 finalArr.add(arr1.get(i));
//                 i++;
//             } else {
//                 finalArr.add(arr2.get(j));
//                 j++;
//             }
//         }

//         while(i<arr1.size()) {
//             finalArr.add(arr1.get(i));
//             i++;
//         }

//         while(j<arr2.size()) {
//             finalArr.add(arr2.get(j));
//             j++;
//         }

//         //sorted AL -> balanced BST
//         return createBST(finalArr, 0, finalArr.size()-1);
//     }

//     public static void preorder(Node root) {
//         if(root == null) {
//             return;
//         }
//         System.out.print(root.data+" ");
//         preorder(root.left);
//         preorder(root.right);
//     }

//     public static void main(String args[]) {
//         /*
//                 2
//                / \
//               1   4
//               BST1
//          */
//         Node root1 = new Node(2);
//         root1.left = new Node(1);
//         root1.right = new Node(4);

//         /*
//                 9
//                / \
//               3   12
//               BST2
//          */
//         Node root2 = new Node(9);
//         root2.left = new Node(3);
//         root2.right = new Node(12);
//         //O(n+m) -> linear

//         /*
//                     3
//                   /   \
//                  1     9
//                   \   /  \
//                   2  4   12
//                   final ans : BST
//          */
//         Node root = mergeBSTs(root1, root2);
//         preorder(root);
//     }
// }


//-------------------------------------------------------------------------------------------
// // Size of Largest BST in BT...
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }

//     static class Info {
//         boolean isBST;
//         int size;
//         int min;
//         int max;

//         public Info(boolean isBST, int size, int min, int max) {
//             this.isBST = isBST;
//             this.size = size;
//             this.min = min;
//             this.max = max;
//         }
//     }

//     public static int maxBST = 0;

//     public static Info largestBST(Node root) {
//         if(root == null) {
//             return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
//         }
//         Info leftInfo = largestBST(root.left);
//         Info rightInfo = largestBST(root.right);
//         int size = leftInfo.size + rightInfo.size + 1;
//         int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
//         int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

//         if(root.data <= leftInfo.max || root.data >= rightInfo.min) {
//             return new Info(false, size, min, max);
//         }

//         if(leftInfo.isBST && rightInfo.isBST) {
//             maxBST = Math.max(maxBST, size);
//             return new Info(true, size, min, max);
//         }

//         return new Info(false, size, min, max);
//     }


//     public static void main(String args[]) {
//         /* 
//                         50
//                       /    \
//                     30      60
//                    /  \    /  \
//                   5   20  45   70
//                               /  \
//                              65  80

//                     given BT
//         */
//         Node root = new Node(50);
//         root.left = new Node(30);
//         root.left.left = new Node(5);
//         root.left.right = new Node(20);

//         root.right = new Node(60);
//         root.right.left = new Node(45);
//         root.right.right = new Node(70);
//         root.right.right.left = new Node(65);
//         root.right.right.right = new Node(80);
        
//         /*
//                     60
//                    /  \
//                   45   70
//                       /  \
//                      65   80
//                 expected BST : size = 5
//          */

//          Info info = largestBST(root);
//          System.out.println("largest BST size = " + maxBST);

//     }

// }

//------------------------------------------------------------------------------------------
// // Convert BST to Balanced BST...
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }

//     public static void preorder(Node root) {
//         if(root == null) {
//             return;
//         }

//         System.out.print(root.data+ " ");
//         preorder(root.left);
//         preorder(root.right);
//     }

//     public static void getInorder(Node root, ArrayList<Integer> inorder) {
//         if(root == null) {
//             return;
//         }

//         getInorder(root.left, inorder);
//         inorder.add(root.data);
//         getInorder(root.right, inorder);
//     }

//     public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
//         if(st > end) {
//             return null;
//         }

//         int mid = (st+end)/2;
//         Node root = new Node(inorder.get(mid));
//         root.left = createBST(inorder, st, mid-1);
//         root.right = createBST(inorder, mid+1, end);
//         return root;
//     }

//     public static Node balanceBST(Node root) {// - O(n)
//         //inorder seq - O(n)
//         ArrayList<Integer> inorder = new ArrayList<>();
//         getInorder(root, inorder);

//         //sorted inorder -> balanced BST - O(n)
//         root = createBST(inorder, 0, inorder.size()-1);
//         return root;
//     }
//     public static void main(String args[]) {
//         /*
//                             8 
//                           /   \
//                          6     10
//                         /        \ 
//                        5         11
//                       /            \
//                      3             12
//                      given BST
                       
//          */
//         Node root = new Node(8);
//         root.left = new Node(6);
//         root.left.left = new Node(5);
//         root.left.left.left = new Node(3);

//         root.right = new Node(10);
//         root.right.right = new Node(11);
//         root.right.right.right = new Node(12);

//         /*
//                             8
//                           /   \
//                          5     11
//                         / \   /  \
//                        3   6 10  12
//                        expected BST
//          */

//          root = balanceBST(root);
//          preorder(root);
//     }
// }


//--------------------------------------------------------------------------------------
// // Sorted Array to Balanced BST...

//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }

//     public static void preorder(Node root) {
//         if(root == null) {
//             return;
//         }

//         System.out.print(root.data+ " ");
//         preorder(root.left);
//         preorder(root.right);
//     }

//     public static Node createBST(int arr[], int st, int end) {
//         if(st > end) {
//             return null;
//         }
//         int mid = (st+end)/2;
//         Node root = new Node(arr[mid]);
//         root.left = createBST(arr, st, mid-1);
//         root.right = createBST(arr, mid+1, end);
//         return root;
//     }
//     public static void main(String args[]) {
//         int arr[] = {3, 5, 6, 8, 10, 11, 12};
//         /*
//                         8
//                       /   \
//                      5     11
//                     / \    / \
//                    3   6  10  12
//                    expected BST
//          */
    
//         Node root = createBST(arr, 0, arr.length-1);
//         preorder(root);
//     }
// }

//----------------------------------------------------------------------------------------------------
// Mirror BST.........

    // static class Node {
    //     int data;
    //     Node left;
    //     Node right;

    //     public Node(int data) {
    //         this.data = data;
    //         this.left = this.right = null;
    //     }
    // }

    // public static Node createMirror(Node root) { // O(n)
    //     if(root == null) {
    //         return null;
    //     }

    //     Node leftMirror = createMirror(root.left);
    //     Node rightMirror = createMirror(root.right);

    //     root.left = rightMirror;
    //     root.right = leftMirror;
    //     return root;
    // }

    // public static void preorder(Node root) {
    //     if(root == null) {
    //         return;
    //     }

    //     System.out.print(root.data+" ");
    //     preorder(root.left);
    //     preorder(root.right);
    // }
     
    // public static void main(String args[]) {
    //     /*
    //                 8
    //                / \ 
    //               5   10
    //              / \    \
    //             3   6   11 

    //      */
    //     Node root = new Node(8);
    //     root.left = new Node(5);
    //     root.right = new Node(10);
    //     root.left.left = new Node(3);
    //     root.left.right = new Node(6);
    //     root.right.right = new Node(11);

    //     /*
    //               8 
    //              / \
    //             10  5
    //            /   / \
    //           11  6   3
    //           Mirror BST
    //      */

    //      root = createMirror(root);
    //      preorder(root);
    // }

// }

//-------------------------------------------------------------------------------------------------
// Suduko.................

    // public static boolean isSafe(int sudoku[][], int row, int col, int digit){

    //     //column
    //     for(int i = 0; i <= 8; i++) {
    //         if(sudoku[i][col] == digit){
    //             return false;
    //         }
    //     }

    //     //row
    //     for(int j = 0; j <= 8; j++) {
    //         if(sudoku[row][j] == digit) {
    //             if(sudoku[row][j] == digit){
    //                 return false;
    //             }
    //         }

    //     //grid
    //     int sr = (row / 3) * 3;
    //     int sc = (row / 3) * 3;
    //     //3X3 grid
    //         for(int i = sr; i< sr+3; i++) {
    //             for( j = sc; j< sc+3; j++) {
    //                 if(sudoku[i][j] == digit) {
    //                     return false;
    //                 }
    //             }
    //         }
    //         return true;

    //     }

    //     public static boolean sudokuSolver(int sudoku[][], int row, int col) {
    //         //base case
    //         if(row == 9 && col == 0) {
    //             return true;
    //         }

    //         //recursive
    //         int nextRow = row, nextCol = col + 1;
    //         if(col+1 == 9) {
    //             nextRow = row + 1;
    //             nextCol = 0;
    //         }

    //         if(sudoku[row][col] != 0) {
    //             return sudokuSolver(sudoku, nextRow, nextCol);
    //         }

    //         for(int digit = 1; digit <= 9; digit++) {
    //             if(isSafe(sudoku, row, col, digit)) {
    //                 sudoku[row][col] = digit;
    //                 if(sudokuSolver(sudoku, nextRow, nextCol)){ // Solution exists
    //                     return true;
    //                 }
    //                 sudoku[row][col] = 0;

    //             }
    //         }
    //         return false;
    //     }

    //     public static void printSudoku(int sudoku[][]) {

    //         for(int i = 0; i < 9; i++) {
    //             for( int j = 0; j < 9; j++){
    //                 System.out.print(sudoku[i][j] + " ");
    //             }
    //             System.out.println();
    //         }
    //     }
        
        // public static void main(String args[]) {

        //     int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0},
        //                        { 4, 9, 0, 1, 5, 7, 0, 0, 2},
        //                        { 0, 0, 3, 0, 0, 4, 1, 9, 0},
        //                        { 1, 8, 5, 0, 6, 0, 0, 2, 0},
        //                        { 0, 0, 0, 0, 2, 0, 0, 6, 0},
        //                        { 9, 6, 0, 4, 0, 5, 3, 0, 0},
        //                        { 0, 3, 0, 0, 7, 2, 0, 0, 4},
        //                        { 0, 4, 9, 0, 3, 0, 0, 5, 7},
        //                        { 8, 2, 7, 0, 0, 9, 0, 1, 3} };
        //         if(sudokuSolver(sudoku, 0, 0)) {
        //         System.out.println("Solution exits ");
        //         printSudoku(sudoku);
        //     } else {
        //         System.out.println("Solution does not exits ");


//------------------------------------------------------------------------------------------------
// Top View of a Tree..........

            // static class Node{
            //     int data;
            //     Node left, right;

            //     public Node(int data) {
            //         this.data = data;
            //         this.left = null;
            //         this.right = null;
            //     }
            // }

            // static class Info {
            //     Node node;
            //     int hd;

            //     public Info(Node node, int hd) {
            //         this.node = node;
            //         this.hd = hd;
            //     }
            // }

            // public static void topView(Node root) {
            //     //Level Order
            //     Queue<Info> q = new LinkedList<>();
            //     HashMap<Integer, Node> map = new HashMap<>();

            //     int min = 0, max = 0;
            //     q.add(new Info(root, 0));
            //     q.add(null);

            //     while(!q.isEmpty()) {
            //         Info curr = q.remove();
            //         if(curr == null) {
            //             if(q.isEmpty()) {
            //                 break;
            //             } else {
            //                 q.add(null);
            //             }
            //         }else {
            //             if(!map.containsKey(curr.hd)) { //first time my hd is occuring
            //                 map.put(curr.hd, curr.node);
            //             }
    
            //             if(curr.node.left != null) {
            //                 q.add(new Info(curr.node.left, curr.hd-1));
            //                 min = Math.min(min, curr.hd-1);
            //             }
            //             if(curr.node.right != null) {
            //                 q.add(new Info(curr.node.right, curr.hd+1));
            //                 max = Math.max(max, curr.hd+1);
            //             }
            //         }


            //     }

            //     for(int i = min; i <= max; i++) {
            //         System.out.print(map.get(i).data+" ");
            //     }
            //     System.out.println();
            // }

        //     public static void KLevel(Node root, int level, int k) {
        //         if(root == null) {
        //             return;
        //         }

        //         if(level == k) {
        //             System.out.print(root.data+" ");
        //             return;
        //         }

        //         KLevel(root.left, level+1, k);
        //         KLevel(root.right, level+1, k);
        //     }

        //     public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        //         if(root == null) {
        //             return false;
        //         }

        //         path.add(root);

        //         if(root.data == n) {
        //             return true;
        //         }

        //         boolean foundLeft = getPath(root.left, n, path);
        //         boolean foundRight = getPath(root.right, n , path);

        //         if(foundLeft || foundRight) {
        //             return true;
        //         }

        //         path.remove(path.size()-1);
        //         return false;
        //     }

        //     public static Node lca(Node root, int n1, int n2) { //O(n)
        //         ArrayList<Node> path1 = new ArrayList<>();
        //         ArrayList<Node> path2 = new ArrayList<>();
            

        //     getPath(root, n1, path1);
        //     getPath(root, n2, path2);

        //     //last common ancestor
        //     int i = 0;
        //     for(; i < path1.size() && i < path2.size(); i++) {
        //         if(path1.get(i) != path2.get(i)) {
        //             break;
        //         }
        //     }

        //     //last equal node -> i-1th
        //     Node lca = path1.get(i-1);
        //     return lca;
        //     }

        //     public static Node lca2(Node root, int n1, int n2) {
                
        //         if(root == null || root.data == n1 || root.data == n2) {
        //             return root;
        //         }

        //         Node leftLca = lca2(root.left, n1, n2);
        //         Node rightLca = lca2(root.right, n1, n2);

        //         //leftLCA = valid  , rightLCA = null
        //         if(rightLca == null) {
        //             return leftLca;
        //         }    //leftLCA = null  , rightLCA = valid
        //         if(leftLca == null) {
        //             return rightLca;
        //         }

        //         return root;
        //     }

        //     public static int lcaDist(Node root, int n) {
        //         if(root == null) {
        //             return -1;
        //         }

        //         if(root.data == n) {
        //             return 0;
        //         }

        //         int leftDist = lcaDist(root.left, n);
        //         int rightDist = lcaDist(root.right, n);

        //         if(leftDist == -1 && rightDist == -1) {
        //             return -1;
        //         } else if(leftDist == -1) {
        //             return rightDist + 1;
        //         } else {
        //             return leftDist + 1;
        //         }
        //     }

        //     public static int minDist(Node root, int n1, int n2) {
        //         Node lca = lca2(root, n1, n2);
        //         int dist1 = lcaDist(lca, n1);
        //         int dist2 = lcaDist(lca, n2);

        //         return dist1 + dist2;
        //     }

        //     public static int KAncentor(Node root, int n, int k){

        //         if(root == null) {
        //             return -1;
        //         }

        //         if(root.data == n) {
        //             return 0;
        //         }

        //         int leftDist = KAncestor(root.left, n, k);
        //         int rightDist = KAncestor(root.right, n, k);

        //         if(leftDist == -1 && rightDist == -1) {
        //             return -1;
        //         }

        //         int max = Math.max(leftDist, rightDist);
        //         if(max+1 == k) {
        //             System.out.println(root.data);
        //         }
        //         return max+1;
        //     }

        //     public static int transform(Node root) {
        //         if(root == null) {
        //             return 0;
        //         }

        //         int leftChild = transform(root.left);
        //         int rightChild = transform(root.right);

        //         int data = root.data;

        //         int newLeft = root.left == null ? 0 : root.left.data;
        //         int newRight = root.right == null ? 0 : root.right.data;

        //         root.data = newLeft + leftChild + newRight + rightChild;
        //         return data;
        //     }

        //     public static void preorder(Node root) {
        //         if(root == null) {
        //             return;
        //         }

        //         System.out.print(root.data+ " ");
        //         preorder(root.left);
        //         preorder(root.right);
        //     }
        //     public static void main(String args[]) {
        //         /* 
        //                         1
        //                        / \
        //                       2   3
        //                      / \ / \
        //                     4  5 6  7
                 
        //                     expected sum tree is : 

        //                         27
        //                        /  \
        //                       9    13
        //                      / \   / \
        //                     0   0 0   0
        //           */

        //         Node root = new Node(1);
        //         root.left = new Node(2);
        //         root.right = new Node(3);
        //         root.left.left = new Node(4);
        //         root.left.right = new Node(5);
        //         root.right.left = new Node(6);
        //         root.right.right = new Node(7);

        //         transform(root);
        //         preorder(root);

        //     }

        // }

            
                            
        


    

