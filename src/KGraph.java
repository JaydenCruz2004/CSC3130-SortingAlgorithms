import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
//Resources Used:
// https://steemit.com/visualization/@datatreemap/visualize-a-multiple-lines-graph-with-jfreechart-in-java
// https://www.javatpoint.com/jfreechart-line-chart

public class KGraph extends JFrame {

    public KGraph() {
        super("KSorting Algorithms Runtime Comparison");

        // Create dataset
        DefaultCategoryDataset dataset = createDataset();

        // Create the chart
        JFreeChart chart = ChartFactory.createLineChart(
                "KSorting Algorithms Runtime Comparison",// Chart Title
                "Number of Elements (N)", // X-Axis label
                "Time (ms)", // Y-Axis label
                dataset, // Dataset
                org.jfree.chart.plot.PlotOrientation.VERTICAL, // Orientation
                true, // Include legend
                true, // Tooltips
                false // URLs
        );

        chart.setBackgroundPaint(Color.white);

        // Add the chart panel to the frame
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        setContentPane(chartPanel);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // BubbleSort
        dataset.addValue(0.05, "BubbleSort", "100");
        dataset.addValue(0.1, "BubbleSort", "500");
        dataset.addValue(0.35, "BubbleSort", "1000");
        dataset.addValue(1.0, "BubbleSort", "2000");
        dataset.addValue(5.5, "BubbleSort", "5000");
        dataset.addValue(22.35, "BubbleSort", "10000");
        dataset.addValue(88.75, "BubbleSort", "20000");
        dataset.addValue(1745.4, "BubbleSort", "75000");
        dataset.addValue(7763.4, "BubbleSort", "150000");

// InsertionSort
        dataset.addValue(0.0, "InsertionSort", "100");
        dataset.addValue(0.1, "InsertionSort", "500");
        dataset.addValue(0.15, "InsertionSort", "1000");
        dataset.addValue(0.25, "InsertionSort", "2000");
        dataset.addValue(0.25, "InsertionSort", "5000");
        dataset.addValue(1.2, "InsertionSort", "10000");
        dataset.addValue(4.55, "InsertionSort", "20000");
        dataset.addValue(63.15, "InsertionSort", "75000");
        dataset.addValue(252.65, "InsertionSort", "150000");

// SelectionSort
        dataset.addValue(0.0, "SelectionSort", "100");
        dataset.addValue(0.15, "SelectionSort", "500");
        dataset.addValue(0.15, "SelectionSort", "1000");
        dataset.addValue(0.65, "SelectionSort", "2000");
        dataset.addValue(3.3, "SelectionSort", "5000");
        dataset.addValue(13.0, "SelectionSort", "10000");
        dataset.addValue(49.5, "SelectionSort", "20000");
        dataset.addValue(688.65, "SelectionSort", "75000");
        dataset.addValue(2751.2, "SelectionSort", "150000");

// ShellSort
        dataset.addValue(0.0, "ShellSort", "100");
        dataset.addValue(0.0, "ShellSort", "500");
        dataset.addValue(0.0, "ShellSort", "1000");
        dataset.addValue(0.15, "ShellSort", "2000");
        dataset.addValue(0.2, "ShellSort", "5000");
        dataset.addValue(0.5, "ShellSort", "10000");
        dataset.addValue(1.2, "ShellSort", "20000");
        dataset.addValue(5.45, "ShellSort", "75000");
        dataset.addValue(11.95, "ShellSort", "150000");

// QuickSort
        dataset.addValue(0.0, "QuickSort", "100");
        dataset.addValue(0.05, "QuickSort", "500");
        dataset.addValue(0.05, "QuickSort", "1000");
        dataset.addValue(0.1, "QuickSort", "2000");
        dataset.addValue(0.15, "QuickSort", "5000");
        dataset.addValue(0.35, "QuickSort", "10000");
        dataset.addValue(0.65, "QuickSort", "20000");
        dataset.addValue(2.85, "QuickSort", "75000");
        dataset.addValue(6.15, "QuickSort", "150000");

// MergeSort
        dataset.addValue(0.05, "MergeSort", "100");
        dataset.addValue(0.0, "MergeSort", "500");
        dataset.addValue(0.1, "MergeSort", "1000");
        dataset.addValue(0.2, "MergeSort", "2000");
        dataset.addValue(0.15, "MergeSort", "5000");
        dataset.addValue(0.0, "MergeSort", "10000");
        dataset.addValue(1.05, "MergeSort", "20000");
        dataset.addValue(4.45, "MergeSort", "75000");
        dataset.addValue(9.45, "MergeSort", "150000");


        return dataset;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new KGraph().setVisible(true);
            }
        });
    }
}
