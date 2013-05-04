package com.dns.enums;


public enum EnumColour {
    
    BLACK("black", "\u00a70"),
    DARK_BLUE("darkBlue", "\u00a71"),
    DARK_GREEN("darkGreen", "\u00a72"),
    DARK_AQUA("darkAqua", "\u00a73"),
    DARK_RED("darkRed", "\u00a74"),
    PURPLE("purple", "\u00a75"),
    ORANGE("orange", "\u00a76"),
    GREY("grey", "\u00a77"),
    DARK_GREY("darkGrey", "\u00a78"),
    INDIGO("indigo", "\u00a79"),
    BRIGHT_GREEN("green", "\u00a7a"),
    AQUA("aqua", "\u00a7b"),
    RED("red", "\u00a7c"),
    PINK("pink", "\u00a7d"),
    YELLOW("yellow", "\u00a7e"),
    WHITE("white", "\u00a7f");
    
    private String name, colour;
    
    private EnumColour(String name, String colour) {
        
        this.name = name;
        this.colour = colour;
    }
    
    public String getName() {
        
        return name.toLowerCase();
    }
    
    public String getColour() {
        
        return colour.toLowerCase();
    }
}
