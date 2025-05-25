package com.company.navigation.view.simplelineseries;


import com.company.navigation.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "simple-line-series", layout = MainView.class)
@ViewController("SimpleLineSeries")
@ViewDescriptor("simple-line-series.xml")
public class SimpleLineSeries extends StandardView {
}