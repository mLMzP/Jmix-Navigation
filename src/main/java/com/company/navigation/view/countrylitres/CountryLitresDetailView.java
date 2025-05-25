package com.company.navigation.view.countrylitres;

import com.company.navigation.entity.CountryLitres;
import com.company.navigation.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "countryLitreses/:id", layout = MainView.class)
@ViewController("CountryLitres.detail")
@ViewDescriptor("country-litres-detail-view.xml")
@EditedEntityContainer("countryLitresDc")
public class CountryLitresDetailView extends StandardDetailView<CountryLitres> {
}