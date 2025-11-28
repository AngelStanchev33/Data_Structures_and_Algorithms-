package org.example.practice.LinkedLIst;

public class BrowserHistory {

    private ListNode<String> current;

    public BrowserHistory(String homepage) {
        ListNode<String> home = new ListNode<>(homepage);
        current = home;
    }

    public void visit(String url) {
        ListNode<String> siteToVisit = new ListNode<>(url);
        siteToVisit.setPrev(current);
        current.setNext(siteToVisit);
        current = siteToVisit;

        System.out.println(STR."Visit \{current.getData()}");
    }

    public String back(int steps) {
        String url = "";

        while (steps > 0 && current.getPrev() != null) {
            steps--;
            url = current.getPrev().getData();
            current = current.getPrev();
        }

        System.out.println(STR."back to \{url}");

        return url;

    }

    public String forward(int steps) {
        String url = "";

        while (steps > 0 && current.getNext() != null) {
            steps--;
            url = current.getNext().getData();
            current = current.getNext();
        }

        System.out.println(STR."forward to \{url}");

        return url;
    }
}

