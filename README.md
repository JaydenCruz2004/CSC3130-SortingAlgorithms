# Assignment 2 – Sorting Algorithms

**Deadline:** Thursday, February 06, 2025, 9:59 pm

## Overview

This repository contains the implementation of various sorting algorithms as required in the assignment. The primary objective is to familiarize myself with the basic sorting algorithms and their performance characteristics. The algorithms implemented are:

- **Bubble Sort**
- **Insertion Sort**
- **Selection Sort**
- **Shellsort**
- **Quicksort**
- **Mergesort**

Additionally, the assignment includes performance testing and comparison of these algorithms.

## Assignment Breakdown

### 1. Text Problems
   - **Step-by-step process for merging sorted lists** using mergesort.
   - **Step-by-step process for sorting an array** using insertion sort, quicksort, shell sort, and other algorithms.
   - **Ranking algorithms based on runtime** and comparing them through asymptotic analysis.
   - **`k-sorting`**: Performance analysis of sorting algorithms on partially sorted data.

### 2. Code Implementation
   - **Sorting Algorithms**: Implemented as separate classes for each algorithm, all implementing the `SortingAlgorithm` interface. The algorithms included are:
     - `BubbleSort.java`
     - `InsertionSort.java`
     - `SelectionSort.java`
     - `ShellSort.java`
     - `QuickSort.java`
     - `MergeSort.java`

   - **Performance Testing**: Implemented a `Tester` class for performance testing, including:
     - `Tester(SortingAlgorithm sa)` constructor to initialize the testing algorithm.
     - `singleTest(int size)` to generate random data and measure sorting time.
     - `test(int iterations, int size)` to calculate the average runtime over multiple iterations.

   - **Performance Comparison**: A `Performance` class generates performance reports, testing the sorting algorithms on various input sizes (100, 500, 1000, 2000, etc.). Results are saved in a `report.txt` file.

   - **K-Sorting**: Implemented `KSortedArray.java` for generating partially sorted data and performing performance testing on k-sorted arrays.

## Usage

### 1. Sorting Algorithm Implementation

Each sorting algorithm is implemented as its own class. For example:

```java
public class BubbleSort implements Sortable {
    @Override
    public int[] sort(int[] arr) {
        // Bubble Sort Implementation
    }
}
