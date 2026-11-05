% Outline only. The full code is private.
% Function names, structure and comments are shown. The working logic is removed.
% Copyright 2026 Mustafa Khodir. All rights reserved.

% Root locus of a three phase synchronous machine with its controller,
% used to read off the gain K where the locus settles.
% Needs the Control System Toolbox.
% machine and controller constants. M is set here but not used below.
% zeros and poles of the machine
% build the numerator from the two zeros and the denominator from the
% three poles. conv multiplies two polynomials together.
% click on the locus in the figure to read the gain at that point
