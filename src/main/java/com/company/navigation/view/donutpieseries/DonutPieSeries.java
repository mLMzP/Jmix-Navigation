package com.company.navigation.view.donutpieseries;


import com.company.navigation.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.chartsflowui.component.Chart;
import io.jmix.chartsflowui.data.item.MapDataItem;
import io.jmix.chartsflowui.kit.component.model.DataSet;
import io.jmix.chartsflowui.kit.data.chart.ListChartItems;
import io.jmix.flowui.view.*;

import java.util.Map;

@Route(value = "donut-pie-series", layout = MainView.class)
@ViewController("DonutPieSeries")
@ViewDescriptor("donut-pie-series.xml")
public class DonutPieSeries extends StandardView {

    @ViewComponent
    protected Chart chart;

    @Subscribe
    protected void onInit(InitEvent event) {
        ListChartItems<MapDataItem> items = new ListChartItems<>(
                new MapDataItem(Map.of("category", "New", "value", 4852)),
                new MapDataItem(Map.of("category", "Returning", "value", 9899))
        );

        chart.setDataSet(
                new DataSet()
                        .withSource(
                                new DataSet.Source<MapDataItem>()
                                        .withDataProvider(items)
                                        .withCategoryField("category")
                                        .withValueField("value")
                        )
        );
    }
}