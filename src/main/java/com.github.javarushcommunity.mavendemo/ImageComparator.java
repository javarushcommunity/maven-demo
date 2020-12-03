package com.github.javarushcommunity.mavendemo;

import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;

import java.awt.image.BufferedImage;

/**
 * Class created for answering, does two images the same or not.
 */
public class ImageComparator {

    /**
     * Method, which says the same images or not.
     *
     * @param image1 image1 for comparison
     * @param image2 image2 for comparison
     * @return return true, if images are the same, false - otherwise.
     */
    public boolean isTheSameImages(BufferedImage image1, BufferedImage image2) {
        //Create ImageComparison object
        ImageComparison imageComparison = new ImageComparison(image1, image2);

        //Compare images
        ImageComparisonResult imageComparisonResult = imageComparison.compareImages();

        //Check, that ImageComparisonState is MATCH:
        return ImageComparisonState.MATCH == imageComparisonResult.getImageComparisonState();
    }
}
