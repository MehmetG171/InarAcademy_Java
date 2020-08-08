package PackageChapter03;

import java.util.Scanner;

public class C0328 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Geometry: two rectangles");
		System.out.println("Enter r1's center x-, y-coordinates:");
		double r1centerx = input.nextDouble();
		double r1centery = input.nextDouble();
		System.out.println("Enter r1's width and height:");
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		System.out.println("Enter r2's center x-, y-coordinates:");
		double r2centerx = input.nextDouble();
		double r2centery = input.nextDouble();
		System.out.println("Enter r2's width and height:");
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();

		double r1UpperLeftx = r1centerx - width1 / 2;
		double r1UpperLefty = r1centery + height1 / 2;
		double r1UpperRightx = r1centerx + width1 / 2;
		double r1UpperRighty = r1centery + height1 / 2;
		double r1LowerLeftx = r1centerx - width1 / 2;
		double r1LowerLefty = r1centery - height1 / 2;
		double r1LowerRightx = r1centerx + width1 / 2;
		double r1LowerRighty = r1centery - height1 / 2;

		double r2UpperLeftx = r2centerx - width2 / 2;
		double r2UpperLefty = r2centery + height2 / 2;
		double r2UpperRightx = r2centerx + width2 / 2;
		double r2UpperRighty = r2centery + height2 / 2;
		double r2LowerLeftx = r2centerx - width2 / 2;
		double r2LowerLefty = r2centery - height2 / 2;
		double r2LowerRightx = r2centerx + width2 / 2;
		double r2LowerRighty = r2centery - height2 / 2;

		if ((r2UpperRighty <= r1UpperRighty) && (r2UpperLefty <= r1UpperLefty) && (r1LowerLefty <= r2LowerLefty)
				&& (r1LowerRighty <= r2LowerRighty) && (r2UpperRightx <= r1UpperRightx)
				&& (r2LowerRightx <= r1LowerRightx) && (r1UpperLeftx <= r2UpperLeftx)
				&& (r1LowerLeftx <= r2LowerLeftx)) {

			System.out.println("r2 is inside r1.");
		} else if ((r2UpperLefty < r1LowerLefty) || (r1UpperLefty < r2LowerLefty) || (r1UpperRightx < r2UpperLeftx)
				|| (r2UpperRightx < r1UpperLeftx)) {
			System.out.println("r2 does not overlap r1.");
		} else {
			System.out.println("r2 overlaps r1.");
		}

		input.close();
	}

}
