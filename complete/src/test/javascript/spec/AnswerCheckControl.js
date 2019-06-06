describe("AnswerCheckControl", function () {
    it("generateFeedback to see if true, gives correct response", function () {
        expect(generateFeedback(true)).toBe("Correct!");
    });
    it("generateFeedback to see if gives false response correctly when sent in a false", function () {
        expect(generateFeedback(false)).toBe("Incorrect. So sad :(");
    });
});
