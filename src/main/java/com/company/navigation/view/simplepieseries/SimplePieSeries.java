package com.company.navigation.view.simplepieseries;


import com.company.navigation.view.main.MainView;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.tabsheet.JmixTabSheet;
import io.jmix.flowui.view.*;
import io.jmix.flowui.view.navigation.RouteSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Route(value = "simple-pie-series", layout = MainView.class)
@ViewController("SimplePieSeries")
@ViewDescriptor("simple-pie-series.xml")
public class SimplePieSeries extends StandardView {

    @ViewComponent
    private JmixTabSheet tabSheet;
    @Autowired
    private RouteSupport routeSupport;

    @Subscribe
    public void onQueryParametersChange(final QueryParametersChangeEvent event) {
        QueryParameters queryParameters = event.getQueryParameters();
        Map<String, List<String>> parameters = queryParameters.getParameters();
        if (parameters.isEmpty()) {
            return;
        }

        String tabIndex = parameters.get("tabIndex").stream().findAny().orElse("0");
        int index = Integer.parseInt(tabIndex);

        tabSheet.setSelectedIndex(index);
    }

    @Subscribe("tabSheet")
    public void onTabSheetSelectedChange(final JmixTabSheet.SelectedChangeEvent event) {
        String selectedIndex = String.valueOf(tabSheet.getSelectedIndex());
        routeSupport.setQueryParameter(UI.getCurrent(), "tabIndex", selectedIndex);
    }
}