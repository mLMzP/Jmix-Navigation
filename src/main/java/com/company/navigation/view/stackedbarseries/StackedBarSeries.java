package com.company.navigation.view.stackedbarseries;


import com.company.navigation.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "stacked-bar-series", layout = MainView.class)
@ViewController("StackedBarSeries")
@ViewDescriptor("stacked-bar-series.xml")
public class StackedBarSeries extends StandardView {
}