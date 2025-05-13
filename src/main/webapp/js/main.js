function toggleProfileDropdown() {
    const dropdown = document.querySelector('.profile-dropdown');
    dropdown.classList.toggle('show');

    // Close dropdown when clicking outside
    document.addEventListener('click', function(event) {
        if (!event.target.closest('.profile-link')) {
            dropdown.classList.remove('show');
        }
    });
}

// Close dropdown when pressing escape key
document.addEventListener('keydown', function(event) {
    if (event.key === 'Escape') {
        document.querySelector('.profile-dropdown')?.classList.remove('show');
    }
});
