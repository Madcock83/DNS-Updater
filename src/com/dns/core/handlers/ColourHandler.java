package com.dns.core.handlers;

import com.dns.enums.EnumColour;
import com.dns.lib.Reference;

public class ColourHandler {

    private static final String cfgColour = Reference.outputColour;
    private static String colour;

    public static void init() {

        if(cfgColour.matches(EnumColour.AQUA.getName())) {

            colour = EnumColour.AQUA.getColour();
        } else if(cfgColour.matches(EnumColour.BLACK.getName())) {

            colour = EnumColour.BLACK.getColour();
        } else if(cfgColour.matches(EnumColour.BRIGHT_GREEN.getName())) {

            colour = EnumColour.BRIGHT_GREEN.getColour();
        } else if(cfgColour.matches(EnumColour.DARK_AQUA.getName())) {

            colour = EnumColour.DARK_AQUA.getColour();
        } else if(cfgColour.matches(EnumColour.DARK_BLUE.getName())) {

            colour = EnumColour.DARK_BLUE.getColour();
        } else if(cfgColour.matches(EnumColour.DARK_GREEN.getName())) {

            colour = EnumColour.DARK_GREEN.getColour();
        } else if(cfgColour.matches(EnumColour.DARK_GREY.getName())) {

            colour = EnumColour.DARK_GREY.getColour();
        } else if(cfgColour.matches(EnumColour.DARK_RED.getName())) {

            colour = EnumColour.DARK_RED.getColour();
        } else if(cfgColour.matches(EnumColour.GREY.getName())) {

            colour = EnumColour.GREY.getColour();
        } else if(cfgColour.matches(EnumColour.INDIGO.getName())) {

            colour = EnumColour.INDIGO.getColour();
        } else if(cfgColour.matches(EnumColour.ORANGE.getName())) {

            colour = EnumColour.ORANGE.getColour();
        } else if(cfgColour.matches(EnumColour.PINK.getName())) {

            colour = EnumColour.PINK.getColour();
        } else if(cfgColour.matches(EnumColour.PURPLE.getName())) {

            colour = EnumColour.PURPLE.getColour();
        } else if(cfgColour.matches(EnumColour.RED.getName())) {

            colour = EnumColour.RED.getColour();
        } else if(cfgColour.matches(EnumColour.WHITE.getName())) {

            colour = EnumColour.WHITE.getColour();
        } else if(cfgColour.matches(EnumColour.YELLOW.getName())) {

            colour = EnumColour.YELLOW.getColour();
        } else {

            colour = EnumColour.BRIGHT_GREEN.getColour();
        }

        Reference.colour = colour;
    }
}
