
document.addEventListener('DOMContentLoaded', () =>
{
    const familyFilter = document.getElementById('familyFilter');
    const categoryFilter = document.getElementById('categoryFilter');
    const cards = document.querySelectorAll('.main-box-card');

    function filterCards()
    {
        const family = familyFilter.value;
        const category = categoryFilter.value;

        cards.forEach(card =>
        {
            const cardFamily = card.getAttribute('data-family');
            const cardCategory = card.getAttribute('data-category');

            if ((family === "" || cardFamily === family) && (category === "" || cardCategory === category))
            {
                card.style.display = "flex";
            }
            else
            {
                card.style.display = "none";
            }
        });
    }

    familyFilter.addEventListener('change', filterCards);
    categoryFilter.addEventListener('change', filterCards);
});
