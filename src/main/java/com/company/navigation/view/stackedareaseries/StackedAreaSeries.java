package com.company.navigation.view.stackedareaseries;


import com.company.navigation.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "stacked-area-series", layout = MainView.class)
@ViewController("StackedAreaSeries")
@ViewDescriptor("stacked-area-series.xml")
public class StackedAreaSeries extends StandardView {
}