// Outline only. The full code is private.
// Function names, structure and comments are shown. The working logic is removed.
// Copyright 2026 Mustafa Khodir. All rights reserved.

// Reads 15 numbers into a 3 by 5 matrix, checks each row is in increasing
// order and merges the rows into one sorted array of 15.
// is_sorted checks a single array either way round, and merge joins two
// sorted arrays the way merge sort does.
//
// Negative numbers are refused and asked for again. Anything that is not
// a number ends the program. If any row is out of order the merge is
// refused and a message says so.
#include <stdio.h>
#include <string.h>

int is_sorted(int x[], int n, char *mode);
int merge(int *z, int *x, int *y, int n_x, int n_y);

// Fills the matrix from the keyboard, then merges row 1 with row 2 and the
// result with row 3, and prints the merged array
int main(void) { /* removed */ }

// returns 1 if x is sorted in the given mode ("increasing" or "decreasing"),
// 0 if it is not, and -1 if the mode is not one of those two
int is_sorted(int x[], int n, char *mode) { /* removed */ }

// merges two increasing arrays x and y into z, returns 1 if it worked
// and 0 if either input was not sorted
int merge(int *z, int *x, int *y, int n_x, int n_y) { /* removed */ }
