# Data structures: prime minister tree

A binary search tree of every UK prime minister keyed on days in office, where each node counts the nodes below it so "who is the nth shortest serving" is answered by walking a single path. It also deletes nodes with zero, one or two children and does an in order walk with an explicit stack. We were given a sample data file of prime ministers to build from. I wrote the tree and all the code around it. Language: Java.

The top four levels of the tree, built by running PMTree with the data file. Each box shows the prime minister, days in office and how many nodes sit below it:

```mermaid
graph TD
    N7614["Sir Robert Walpole<br/>7614 days, 56 below"]
    N484["The Earl of Wilmington<br/>484 days, 55 below"]
    N225["The Duke of Devonshire<br/>225 days, 12 below"]
    N3841["Henry Pelham<br/>3841 days, 41 below"]
    N144["The Viscount Goderich<br/>144 days, 4 below"]
    N317["The Earl of Bute<br/>317 days, 6 below"]
    N2760["The Duke of Newcastle<br/>2760 days, 34 below"]
    N4438["Lord North<br/>4438 days, 5 below"]
    N7614 -- shorter --> N484
    N484 -- shorter --> N225
    N484 -- longer --> N3841
    N225 -- shorter --> N144
    N225 -- longer --> N317
    N3841 -- shorter --> N2760
    N3841 -- longer --> N4438
```

Walpole is the root because the data starts with him, and he has nothing on his longer side because no one has served longer. Part of a real run:

```text
Number of prime ministers in the tree: 57
The 10th shortest serving prime minister is: { PM: The Lord Grenville, Days: 407, nodes below: 1 }
The 20th shortest serving prime minister is: { PM: Spencer Perceval, Days: 951, nodes below: 7 }
The 30th shortest serving prime minister is: { PM: The Earl Grey, Days: 1324, nodes below: 14 }
The 40th shortest serving prime minister is: { PM: Harold Macmillan, Days: 2471, nodes below: 0 }
The 50th shortest serving prime minister is: { PM: Henry Pelham, Days: 3841, nodes below: 41 }
```

The source code is private and available on request. Contact me at mkhodir77@gmail.com.
