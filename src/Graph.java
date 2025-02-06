import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;
import java.awt.*;
//Resources Used:
// https://steemit.com/visualization/@datatreemap/visualize-a-multiple-lines-graph-with-jfreechart-in-java
public class Graph extends JFrame {

    public Graph() {
        super("Sorting Algorithms Runtime Comparison");

        // Create dataset
        DefaultCategoryDataset dataset = createDataset();

        // Create the chart
        JFreeChart chart = ChartFactory.createLineChart(
                "Sorting Algorithms Runtime Comparison",// Chart Title
                "Number of Elements (N)", // X-Axis label
                "Time (ms)", // Y-Axis label
                dataset, // Dataset
                org.jfree.chart.plot.PlotOrientation.VERTICAL, // Orientation
                true, // Include legend
                true, // Tooltips
                false // URLs
        );

        // Customize the chart (optional)
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

        // BubbleSort data
        dataset.addValue(0.05, "BubbleSort", "100");
        dataset.addValue(0.2, "BubbleSort", "500");
        dataset.addValue(0.45, "BubbleSort", "1000");
        dataset.addValue(1.55, "BubbleSort", "2000");
        dataset.addValue(8.05, "BubbleSort", "5000");
        dataset.addValue(26.75, "BubbleSort", "10000");
        dataset.addValue(103.4, "BubbleSort", "20000");
        dataset.addValue(3202.95, "BubbleSort", "75000");
        dataset.addValue(15915.45, "BubbleSort", "150000");

        // InsertionSort data
        dataset.addValue(0.05, "InsertionSort", "100");
        dataset.addValue(0.1, "InsertionSort", "500");
        dataset.addValue(0.15, "InsertionSort", "1000");
        dataset.addValue(0.15, "InsertionSort", "2000");
        dataset.addValue(1.0, "InsertionSort", "5000");
        dataset.addValue(4.0, "InsertionSort", "10000");
        dataset.addValue(15.9, "InsertionSort", "20000");
        dataset.addValue(223.9, "InsertionSort", "75000");
        dataset.addValue(895.45, "InsertionSort", "150000");

        // SelectionSort data
        dataset.addValue(0.05, "SelectionSort", "100");
        dataset.addValue(0.15, "SelectionSort", "500");
        dataset.addValue(0.15, "SelectionSort", "1000");
        dataset.addValue(0.55, "SelectionSort", "2000");
        dataset.addValue(3.2, "SelectionSort", "5000");
        dataset.addValue(13.1, "SelectionSort", "10000");
        dataset.addValue(50.35, "SelectionSort", "20000");
        dataset.addValue(705.95, "SelectionSort", "75000");
        dataset.addValue(2768.0, "SelectionSort", "150000");

        // ShellSort data
        dataset.addValue(0.0, "ShellSort", "100");
        dataset.addValue(0.05, "ShellSort", "500");
        dataset.addValue(0.1, "ShellSort", "1000");
        dataset.addValue(0.1, "ShellSort", "2000");
        dataset.addValue(0.25, "ShellSort", "5000");
        dataset.addValue(0.55, "ShellSort", "10000");
        dataset.addValue(1.4, "ShellSort", "20000");
        dataset.addValue(6.25, "ShellSort", "75000");
        dataset.addValue(13.35, "ShellSort", "150000");

        // QuickSort data
        dataset.addValue(0.05, "QuickSort", "100");
        dataset.addValue(0.0, "QuickSort", "500");
        dataset.addValue(0.0, "QuickSort", "1000");
        dataset.addValue(0.05, "QuickSort", "2000");
        dataset.addValue(0.25, "QuickSort", "5000");
        dataset.addValue(0.4, "QuickSort", "10000");
        dataset.addValue(0.75, "QuickSort", "20000");
        dataset.addValue(2.95, "QuickSort", "75000");
        dataset.addValue(6.35, "QuickSort", "150000");

        // MergeSort data
        dataset.addValue(0.0, "MergeSort", "100");
        dataset.addValue(0.05, "MergeSort", "500");
        dataset.addValue(0.05, "MergeSort", "1000");
        dataset.addValue(0.15, "MergeSort", "2000");
        dataset.addValue(0.35, "MergeSort", "5000");
        dataset.addValue(0.75, "MergeSort", "10000");
        dataset.addValue(1.05, "MergeSort", "20000");
        dataset.addValue(4.65, "MergeSort", "75000");
        dataset.addValue(9.45, "MergeSort", "150000");

        return dataset;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Graph().setVisible(true);
            }
        });
    }
}
