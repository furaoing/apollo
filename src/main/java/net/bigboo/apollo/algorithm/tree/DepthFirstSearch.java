package net.bigboo.apollo.algorithm.tree;

import net.bigboo.apollo.adt.tree.generaltree.Node;
import net.bigboo.apollo.adt.tree.generaltree.Tree;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by rao on 16-6-13.
 */

public class DepthFirstSearch {
    public static <T> boolean solve(Node<T> n, T target){
        // TODO: change .equals method to something that applies to primitive type as well
        if(n.getData().equals(target)){
            return true;
        }
        else{
            for(Node<T> child: n.getChildren()){
                if(solve(child, target)){
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Node<String> C = new Node<String>("bad");
        Node<String> D = new Node<String>("bad");
        Node<String> E = new Node<String>("good");
        Node<String> F = new Node<String>("bad");
        Node<String> A = new Node<String>("bad");
        Node<String> B = new Node<String>("bad");
        Node<String> Root = new Node<String>("bad");
        A.addChild(C);
        A.addChild(D);
        B.addChild(E);
        B.addChild(F);
        Root.addChild(A);
        Root.addChild(B);

        System.out.println(solve(Root, "good"));
    }
}
