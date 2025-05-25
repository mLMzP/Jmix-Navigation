package com.company.navigation.view.simplebarseries;


import com.company.navigation.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "simple-bar-series", layout = MainView.class)
@ViewController("SimpleBarSeries")
@ViewDescriptor("simple-bar-series.xml")
public class SimpleBarSeries extends StandardView {
}